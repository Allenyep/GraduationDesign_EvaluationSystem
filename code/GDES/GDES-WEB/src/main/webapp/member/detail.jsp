<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>个人资料</title>
    <link href="/assets/layui/css/layui.css" rel="stylesheet"/>
</head>

<body>
<div class="layui-container">

    <jsp:include page="inc.jsp"></jsp:include>
    <div class="layui-row">
        <div class="layui-col-xs12 layui-col-sm12 layui-col-md12">
            <div class="x-nav layui-elem-quote">
						<span class="layui-breadcrumb">
             <a><cite><i class="layui-icon" style="line-height:25px">&#xe68e  </i>首页</cite></a>
                <a href="/admin/member/index.do">个人资料</a>
                <a><cite>个人资料</cite></a>
            </span>
                <a class="layui-btn layui-btn-mini" style="line-height:1.0em;margin-top:1px;float:right"
                   href="/admin/member/index.do" title="刷新">
                    <i class="layui-icon" style="line-height:25px">&#x1002</i></a>
            </div>
        </div>
        <form class="layui-form" action="" style="align-self: center">
            <div class="layui-form-item">
                <label class="layui-form-label">用户姓名</label>
                <div class="layui-input-inline">
                    <input type="text" name="staffname" required lay-verify="required" placeholder="" autocomplete="off"
                         value="${user.staffname}" readonly class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">用户名</label>
                <div class="layui-input-inline">
                    <input type="text" name="username" required lay-verify="required" placeholder="" autocomplete="off"
                           value="${user.username}" readonly class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">所属部门</label>
                <div class="layui-input-inline">
                    <input type="text" name="deptname" required lay-verify="pwd" placeholder="请输入旧密码" autocomplete="off"
                           value="${user.deptname}" readonly  class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">用户角色</label>
                <div class="layui-input-inline">
                    <input type="text" id="npwd" name="rolename" required lay-verify="pwd" placeholder="请输入新密码"
                           value="${user.rolename}" readonly autocomplete="off" class="layui-input">
                </div>
            </div>
        </form>
    </div>
</div>
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/resources/layui/layui.js"></script>--%>
<%--<script src="/assets/js/jquery-2.0.3.min.js"></script>--%>
<script src="/assets/layui/layui.js" type="text/javascript"></script>
<script>
    //个人资料
    layui.use(['form','element', 'jquery'], function () {
        var $ = layui.jquery;
        var form = layui.form;
        form.verify({
            pwd: [/(.+){6,12}$/, '密码必须6到12位'],
            repwd: function (value) {
                //获取密码
                var pwd = $("#npwd").val();
                if (pwd != value) {
                    return '两次输入的密码不一致';
                }
            }
        });
        //监听导航点击
        /*element.on('nav(demo)', function (elem) {
            //console.log(elem)
            layer.msg(elem.text());
        });*/
        //监听提交
        form.on('submit(updatePwd)', function (data) {
            if (data.field.pwd == data.field.password) {
                layer.msg("您输入的<font color='red'>新密码</font>和旧密码一致,请重新输入!", {icon: 5});
            } else {
                /* var user = JSON.stringify(data.field);
                 layer.msg(user);*/
                submit($, data.field);
            }
            return false;
        });
    });

    //提交
    function submit($, params) {
        var id = params.id;
        $.post('${pageContext.request.contextPath}/admin/member/updatepwd/', params, function (res) {
            //alert(res);
            if (res == 0) {
                layer.msg("旧密码输入有误,请重新输入!", {icon: 5});
            } else if (res == 1) {
                /*layer.msg("用户个人资料成功,请重新登录!",'',login())
                login();*/
                layer.msg('个人资料成功,请重新登录!', {
                    icon: 6
                    , btn: ['确定']
                    , yes: function () {
                        window.top.location = "${pageContext.request.contextPath}/logout";
                    }
                });
            } else if (res == 2) {
                layer.msg("用户个人资料失败!", {icon: 5});
            }
        }, 'json');
    }
</script>
</body>

</html>