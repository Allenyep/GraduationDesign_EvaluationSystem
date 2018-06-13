<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
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
    <title>首页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="../assets/img/favicon.png">
    <link rel="stylesheet" href="../assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="../assets/css/app.css">
    <script src="../assets/js/jquery.min.js"></script>

</head>

<body>
<script src="../assets/js/theme.js"></script>


<div class="">


    <!-- 内容区域 -->
    <div class="">
        <div class="row-content am-cf">


            <div class="row">

                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <%--<div class="widget-head am-cf">--%>
                            <%--<div class="widget-title am-fl">个人资料</div>--%>
                            <%--<div class="widget-function am-fr">--%>
                                <%--<a href="javascript:;" class="am-icon-cog"></a>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <div class="widget-body am-fr">

                            <form action="/admin/member/updatepwd1.do" class="am-form" data-am-validator method="post">
                                <fieldset>
                                    <legend>密码验证</legend>
                                    <div>${msg}</div>
                                    <div class="am-form-group">
                                        <label for="doc-vld-name-2">用户名：</label>
                                        <input type="text" id="doc-vld-name-2" minlength="3"
                                             name="username" value="${user.username}" required/>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="doc-vld-pwd-1">密码：</label>
                                        <input  name="pwd" type="password" id="doc-vld-pwd-1" placeholder="请输入密码" pattern="^\d{6}$" required/>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="doc-vld-pwd-2">确认密码：</label>
                                        <input type="password" id="doc-vld-pwd-2" placeholder="请与上面输入的值一致" data-equal-to="#doc-vld-pwd-1" required/>
                                    </div>

                                    <button class="am-btn am-btn-secondary" type="submit">提交</button>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>





<script src="../assets/js/amazeui.min.js"></script>
<script src="../assets/js/app.js"></script>

</body>

</html>