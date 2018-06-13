<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>添加用户</title>
    <link href="../assets/layui/css/layui.css" rel="stylesheet"/>
</head>

<body>
<div class="layui-container">
    <!--

        描述：引入公共html
    -->
    <jsp:include page="inc.jsp"></jsp:include>
    <div class="layui-row">
        <div class="layui-col-xs12 layui-col-sm12 layui-col-md12">
            <div class="x-nav layui-elem-quote">
						<span class="layui-breadcrumb">
             <a><cite><i class="layui-icon" style="line-height:25px">&#xe68e  </i>首页</cite></a>
                <a href="/user/index.do">用户列表</a>
                <a><cite>添加用户</cite></a>
            </span>
                <a class="layui-btn layui-btn-mini" style="line-height:1.0em;margin-top:1px;float:right"
                   href="javascript:location.reload()" title="刷新">
                    <i class="layui-icon" style="line-height:25px">&#x1002</i></a>
            </div>
            <a class="layui-btn layui-btn-danger" role="button"
               style="margin-right: 10px;float: right"
               href=/user/index.do>返回上一级</a>
        </div>
        <div class="layui-col-xs12 layui-col-sm8 layui-col-md6">
            <form class="layui-form layui-form-pane"
                  action="/user/add.do"
                  method="post">
                <div class="layui-form-item">
                    <label class="layui-form-label">用户姓名</label>
                    <div class="layui-input-block">
                        <input type="text" name="staffname" lay-verify="required" placeholder="请输入用户姓名"
                               value="${user.staffname}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">登录名</label>
                    <div class="layui-input-block">
                        <input type="text" name="username" lay-verify="required" placeholder="请输入员工工号"
                               value="${user.username}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">登录密码</label>
                    <div class="layui-input-block">
                        <input type="password" name="password" placeholder="默认密码000000"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">所属部门</label>
                    <div class="layui-input-block">
                        <select name="deptId" lay-verify="required" lay-search="">
                            <option value="">请输入或选择部门</option>
                            <c:forEach items="${depts}" var="dept">
                                <c:if test="${user.deptId==dept.id}">
                                    <option value="${dept.id}" selected>${dept.name}</option>
                                </c:if>
                                <c:if test="${user.deptId!=dept.id}">
                                    <option value="${dept.id}">${dept.name}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">用户角色</label>
                    <div class="layui-input-block">
                        <c:forEach items="${roles}" var="role" varStatus="idxStatus">
                            <c:if test="${idxStatus.index==0 or user.roleId==role.id}">
                                <input type="radio" name="roleId" value="${role.id}" title="${role.name}" checked>
                            </c:if>
                            <c:if test="${ idxStatus.index!=0 and user.roleId!=role.id}">
                                <input type="radio" name="roleId" value="${role.id}" title="${role.name}">
                            </c:if>
                        </c:forEach>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">用户状态</label>
                    <div class="layui-input-block">
                        <c:if test="${user.status==0 or user.status==null}">
                            <input type="radio" name="status" value="0" title="已禁用" checked>
                            <input type="radio" name="status" value="1" title="已启用">
                        </c:if>
                        <c:if test="${user.status==1}">
                            <input type="radio" name="status" value="0" title="已禁用">
                            <input type="radio" name="status" value="1" title="已启用" checked>
                        </c:if>
                    </div>
                </div>
                <div class="layui-form-item" style="text-align: center">
                    <div class="layui-form-item">
                        <button class="layui-btn" lay-submit="" lay-filter="rulesSubmit">提交</button>
                        <button class="layui-btn layui-btn-primary" type="reset">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<span hidden id="msg">${msg}</span>
<script src="/assets/js/jquery-2.0.3.min.js"></script>
<script src="/assets/layui/layui.js" type="text/javascript"></script>
<%--<script src="${pageContext.request.contextPath}/resources/layui/layui.js"></script>--%>
<%--<script src="${pageContext.request.contextPath}/resources/jquery-3.1.0.min.js"></script>--%>
<script>
    layui.use(['element', 'form', 'jquery'], function () {
        var form = layui.form,
            layer = layui.layer,
            element = layui.element,
            $ = layui.jquery;

        //监听导航点击
        element.on('nav(demo)', function (elem) {
            //console.log(elem)
            layer.msg(elem.text());
        });

        //监听提交
        form.on('submit(rulesSubmit)', function (data) {
            //提交表单
        });
        //弹出层
        var msg=$("#msg").text();
        if (msg.length!=""){
            layer.msg(msg, {icon: 5});
        }
    });
</script>

</body>
</html>