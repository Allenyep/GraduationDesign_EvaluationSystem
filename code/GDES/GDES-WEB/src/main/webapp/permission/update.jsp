<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>添加权限</title>
</head>

<body>
<div class="layui-container">

    <jsp:include page="inc.jsp"></jsp:include>
    <div class="layui-row">
        <div class="layui-col-xs12 layui-col-sm12 layui-col-md12">
            <div class="x-nav layui-elem-quote">
						<span class="layui-breadcrumb">
             <a><cite><i class="layui-icon" style="line-height:25px">&#xe68e  </i>首页</cite></a>
                <a href="${pageContext.request.contextPath}/admin/permission/index">权限列表</a>
                <a><cite>添加权限</cite></a>
            </span>
                <a class="layui-btn layui-btn-mini" style="line-height:1.0em;margin-top:1px;float:right"
                   href="javascript:location.reload()" title="刷新">
                    <i class="layui-icon" style="line-height:25px">&#x1002</i></a>
            </div>
            <a class="layui-btn layui-btn-danger" role="button"
               style="margin-right: 10px;float: right"
               href="${pageContext.request.contextPath}/admin/permission/index">返回上一级</a>
        </div>
        <div class="layui-col-xs12 layui-col-sm8 layui-col-md6">
            <form class="layui-form layui-form-pane"
                  action="${pageContext.request.contextPath}/admin/permission/update/"
                  method="post">
                <div class="layui-form-item" hidden>
                    <label class="layui-form-label">权限ID</label>
                    <div class="layui-input-block">
                        <input type="text" name="id" lay-verify="required" placeholder="请输入权限ID"
                               value="${permission.id}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">权限名称</label>
                    <div class="layui-input-block">
                        <input type="text" name="name" lay-verify="required" placeholder="请输入权限名称"
                               value="${permission.name}" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">权限代码</label>
                    <div class="layui-input-block">
                        <input type="text" name="permission" lay-verify="required" placeholder="请输入权限代码"
                               value="${permission.permission}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">权限URL</label>
                    <div class="layui-input-block">
                        <input type="text" name="url" lay-verify="required" placeholder="请输入权限URL"
                               value="${permission.url}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">父级权限</label>
                    <div class="layui-input-block">
                        <select name="parantid"  lay-search="">
                            <option value="">请输入或选择权限名称(不选择为顶级权限)</option>
                            <c:forEach items="${parantMenus}" var="menu">
                                <c:if test="${permission.parantid==menu.permissionId}">
                                    <option value="${menu.permissionId}" selected>${menu.menuname}</option>
                                </c:if>
                                <c:if test="${permission.parantid!=menu.permissionId}">
                                    <option value="${menu.permissionId}">${menu.menuname}</option>
                                </c:if>
                            </c:forEach>
                        </select>
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
<script src="${pageContext.request.contextPath}/resources/layui/layui.js"></script>
<script src="${pageContext.request.contextPath}/resources/jquery-3.1.0.min.js"></script>
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
        //监听CheckBox
        form.on('checkbox(permission)', function (data) {
            $('input[type=checkbox]:checked').map(function () {
                return this.value
            }).get().join(',');
        })
        //弹出层
        var msg = $("#msg").text();
        if (msg.length != "") {
            layer.msg(msg, {icon: 5});
        }
    });
</script>

</body>
</html>