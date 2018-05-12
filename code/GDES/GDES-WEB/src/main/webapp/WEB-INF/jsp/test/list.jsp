<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="taglib.jsp"%>
<html>
<head>
<%@ include file="head.jsp"%>

	<title>用户列表</title>
</head>
<body>
<%--${info }--%>
<%--欢迎你!--%>
<%--<shiro:hasRole name="admin">--%>
	<%--欢迎有admin角色的用户！<shiro:principal/>--%>
	<%--<input type="button" value="增加学生">--%>
	<%--<input type="button" value="修改学生">--%>
	<%--<input type="button" value="删除学生">--%>
<%--</shiro:hasRole>--%>
<%--<shiro:hasRole name="teacher">--%>
	<%--欢迎有teacher角色的用户！<shiro:principal/>--%>
	<%--<input type="button" value="增加学生">--%>
<%--</shiro:hasRole>--%>
<%--<shiro:hasPermission name="student:create">--%>
	<%--欢迎有student:create权限的用户！<shiro:principal/>--%>
<%--</shiro:hasPermission>--%>

<div><h1 class="text-center">用户列表</h1></div>
<div id="main" class="container">
	<div class="row">
		<div class="col-lg-12 col-sm-12 col-md-12">
			<shiro:hasRole name="zuidaima">
				尊敬的:<shiro:principal/>,欢迎您！测试新加权限3333
			</shiro:hasRole>
			<shiro:hasRole name="teacher">
				尊敬的:<shiro:principal/>,欢迎您！
			</shiro:hasRole>
			<shiro:hasRole name="admin">
				尊敬的<font color="red" >管理员</font>:<shiro:principal/>,欢迎您！
				<div class="pull-right"><a href="${ctx}/usertest/form.do" class="btn btn-primary">新增用户</a></div>
			</shiro:hasRole>
			<div class="pull-right"><a href="${ctx}/usertest/logout.do" class="btn btn-danger">退出系统</a></div>
			<table class="table table-hover table-bordered text-center">
				<thead>
				<th class="text-center">ID</th>
				<th class="text-center">姓名</th>
				<th class="text-center">年龄</th>
				<th class="text-center">性别</th>
				<th class="text-center">备注</th>
				<shiro:hasRole name="admin">
					<th class="text-center">操作</th>
				</shiro:hasRole>
				</thead>
				<tbody>
				<c:forEach items="${humans}" var="human">
					<tr>
						<td>${human.id}</td>
						<td>${human.name}</td>
						<td>${human.age}</td>
						<td>${human.sex == 1 ? '男' : '女'}</td>
						<td>${human.remark}</td>
						<shiro:hasRole name="admin">
							<td><a href="${ctx}/usertest/edit.do/${human.id}" class="btn btn-primary btn-sm">修改</a>
								<a href="${ctx}/usertest/del.do/${human.id}" class="btn btn-danger btn-sm">删除</a></td>
						</shiro:hasRole>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

</body>
</html>