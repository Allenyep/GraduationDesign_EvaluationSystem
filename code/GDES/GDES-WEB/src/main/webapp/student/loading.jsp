<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    session.setAttribute("basePath",basePath);
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>页面加载中...</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript">
        //获取浏览器页面可见高度和宽度
        var _PageHeight = document.documentElement.clientHeight,
            _PageWidth = document.documentElement.clientWidth;
        //计算loading框距离顶部和左部的距离（loading框的宽度为215px，高度为61px）
        var _LoadingTop = _PageHeight > 61 ? (_PageHeight - 61) / 2 : 0,
            _LoadingLeft = _PageWidth > 215 ? (_PageWidth - 215) / 2 : 0;
        //在页面未加载完毕之前显示的loading Html自定义内容
        var _LoadingHtml = '<div id="loadingDiv" style="position:absolute;left:0;width:100%;height:' + _PageHeight + 'px;top:0;background:#f3f8ff;opacity:1;filter:alpha(opacity=80);z-index:10000;"><div id="showc" style="position: absolute; cursor1: wait; left: ' + _LoadingLeft + 'px; top:' + _LoadingTop + 'px; width: auto; height: 57px; line-height: 57px; padding-left: 50px; padding-right: 5px; background: #fff url(../assets/img/loading.gif) no-repeat scroll 5px 10px; border: 2px solid #95B8E7; color: #696969; font-family:\'Microsoft YaHei\';">页面加载中，请等待...</div></div>';
        //呈现loading效果
        document.write(_LoadingHtml);

        //window.onload = function () {
        //    var loadingMask = document.getElementById('loadingDiv');
        //    loadingMask.parentNode.removeChild(loadingMask);
        //};

        //监听加载状态改变
        document.onreadystatechange = completeLoading;

        //加载状态为complete时移除loading效果
        /*function completeLoading() {
            if (document.readyState == "complete") {
                var loadingMask = document.getElementById('loadingDiv');
                loadingMask.parentNode.removeChild(loadingMask);
            }
        }*/
    </script>
</head>
<body>
<script type="text/javascript">
    if("${p}"=="scoretable") {
        window.location.href = "${basePath}las/listbystudentid.do?id_s=${idS}";
    }
    if("${p}"=="scorecharts") {
        window.location.href = "${basePath}las/scoreproportion.do?id_s=${idS}";
    }
    if("${p}"=="sprofile") {
        window.location.href = "${basePath}student/profile.do?idS=${idS}&flag=${flag}";
    }
</script>
</body>
</html>