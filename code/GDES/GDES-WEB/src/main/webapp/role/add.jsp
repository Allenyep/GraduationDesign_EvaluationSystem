<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>添加角色</title>
</head>

<body>
<div class="layui-container">

    <jsp:include page="inc.jsp"></jsp:include>
    <div class="layui-row">
        <div class="layui-col-xs12 layui-col-sm12 layui-col-md12">
            <div class="x-nav layui-elem-quote">
						<span class="layui-breadcrumb">
             <a><cite><i class="layui-icon" style="line-height:25px">&#xe68e  </i>首页</cite></a>
                <a href="/admin/role/index.do">角色列表</a>
                <a><cite>添加角色</cite></a>
            </span>
                <a class="layui-btn layui-btn-mini" style="line-height:1.0em;margin-top:1px;float:right"
                   href="javascript:location.reload()" title="刷新">
                    <i class="layui-icon" style="line-height:25px">&#x1002</i></a>
            </div>
            <a class="layui-btn layui-btn-danger" role="button"
               style="margin-right: 10px;float: right"
               href="/admin/role/index.do">返回上一级</a>
        </div>
        <div class="layui-col-xs12 layui-col-sm12 layui-col-md8">
            <form class="layui-form layui-form-pane"
                  action="/admin/role/add.do"
                  method="post">
                <div class="layui-form-item">
                    <label class="layui-form-label">角色名称</label>
                    <div class="layui-input-block">
                        <input type="text" name="name" lay-verify="required" placeholder="请输入角色名称"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">角色类型</label>
                    <div class="layui-input-block">
                        <input type="text" name="sn" lay-verify="required" placeholder="请输入角色类型"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">拥有权限</label>
                    <div class="layui-input-block">
                        <c:forEach items="${permission.childMenu}" var="permission">
                            <input type="checkbox" name="permission" lay-filter="permission"
                                   value="${permission.id}" checked
                                   lay-skin="primary" title="${permission.name}">
                            <c:forEach items="${permission.childMenu}" var="permission">
                                <br><input type="checkbox" name="permission" lay-filter="permission"
                                           value="${permission.id}"
                                           lay-skin="primary" title="${permission.name}">
                                <c:forEach items="${permission.childMenu}" var="permission">
                                    <br><input type="checkbox" name="permission" lay-filter="permission"
                                           value="${permission.id}"
                                           lay-skin="primary" title="${permission.name}">
                                    <c:forEach items="${permission.childMenu}" var="permission">
                                        <input type="checkbox" name="permission" lay-filter="permission"
                                               value="${permission.id}"
                                               lay-skin="primary" title="${permission.name}">
                                    </c:forEach>
                                </c:forEach>
                            </c:forEach>
                        </c:forEach>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">备注</label>
                    <div class="layui-input-block">
                        <input type="text" name="remark" placeholder="请输入备注信息"
                               class="layui-input">
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
<script src="/assets/layui/layui.js" type="text/javascript"></script>
<script src="/assets/js/jquery-2.0.3.min.js"></script>
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