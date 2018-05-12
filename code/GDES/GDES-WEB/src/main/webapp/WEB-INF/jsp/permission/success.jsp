<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/5/8
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
sfddff
<shiro:hasRole name="admin">
    欢迎：<shiro:principal/>,fdkfjdkfj---------
</shiro:hasRole>

<shiro:hasRole name="student">
    <shiro:principal/> 欢迎fff
</shiro:hasRole>


<%--<div>--%>
    <%--<a href="/usertest/index.do">登录</a>--%>
<%--</div>--%>
<%--<shiro:hasPermission name="admin:create">--%>
    <%--<a>创建</a>--%>
<%--</shiro:hasPermission>--%>
<div class="pull-right"><a href="${ctx}/usertest/logout.do" class="btn btn-danger">退出系统</a></div>
<shiro:hasAnyRoles name="student,admin">

<div class="pull-right"><a href="${ctx}/usertest/index.do" class="btn btn-danger">登陆</a></div>
</shiro:hasAnyRoles>


</body>
</html>
