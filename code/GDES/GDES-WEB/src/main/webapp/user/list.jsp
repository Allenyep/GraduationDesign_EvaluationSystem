<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>用户列表</title>
    <link href="../assets/layui/css/layui.css" rel="stylesheet"/>
    <script src="../assets/layui/layui.js"></script>
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
              <a><cite>用户列表</cite></a>
            </span>
                <a class="layui-btn layui-btn-mini" style="line-height:1.0em;margin-top:1px;float:right"
                   href="/user/index.do" title="刷新">
                    <i class="layui-icon" style="line-height:25px">&#x1002</i></a>
            </div>
        </div>
        <a class="layui-btn layui-btn-normal" role="button"
           style="margin-right: 10px;float: right" href="/user/add.do">导入用户</a>
        <a class="layui-btn layui-btn-normal" role="button"
           style="margin-right: 10px;float: right" href="/user/add.do">添加用户</a>
        <div class="layui-col-xs12 layui-col-sm12 layui-col-md12">
            <table class="layui-table"
                   lay-data="{height: 'full-110',even: true,url:'/user/list.do',limits:[10,30,50,100], limit: 10,page:true,id:'id'}"
                   lay-filter="user">
                <thead>
                <tr>
                    <!--<th lay-data="{checkbox:true, fixed: true}"></th>-->
                    <th lay-data="{field:'id',align:'center', width:100, sort: true}">ID</th>
                    <th lay-data="{field:'username',align:'center', width:100, sort: true}">登录名</th>
                    <th lay-data="{field:'staffname', align:'center',width:100, sort: true}">用户姓名</th>
                    <th lay-data="{field:'deptname', align:'center',width:200, sort: true}">所属部门</th>
                    <th lay-data="{field:'rolename', align:'center',width:100, sort: true}">用户角色</th>
                    <th lay-data="{field:'status',align:'center', width:100, sort: true,templet: '#userStateTpl'}">
                        用户状态
                    </th>
                    <th lay-data="{width:120, align:'center', toolbar: '#toolBar'}">操作</th>
                </tr>
                </thead>
            </table>
        </div>
    </div>
</div>


<script type="text/html" id="toolBar">
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="update">修改</a>
    <a class="layui-btn layui-btn-warm layui-btn-mini" lay-event="delete">删除</a>
</script>
<!--推送规则模板 模板引擎-->
<script type="text/html" id="userStateTpl">
    {{#  if(d.status ===1){ }}
    <a class="layui-btn layui-btn-normal layui-btn-mini" lay-event="yes">已启用</a>
    {{#  } }}
    {{#  if(d.status ===0){ }}
    <a class="layui-btn layui-btn-primary layui-btn-mini" lay-event="no">已禁用</a>
    {{#  } }}
</script>

<script>
    layui.use(['table', 'element', 'jquery'], function () {
        var table = layui.table,
            element = layui.element,
            $ = layui.jquery;

        //监听导航点击
        element.on('nav(demo)', function (elem) {
            console.log("elem="+elem);
            layer.msg(elem.text());
        });
        //监听工具条
        table.on('tool(user)', function (obj) {
            var data = obj.data;
            console.log("obj.data="+obj.data);
            if (obj.event === 'update') {
                window.location.href = '/user/update/' + data.userId+".do";
            }


            //此处需要完善
            if (obj.event === 'delete') {
                var userId = obj.data.userId;
                layer.confirm('您确定要删除该用户吗？', {
                    btn: ['确定', '取消'] //按钮
                }, function () {
                    layer.closeAll();
                    $.post("/user/deleteUserById.do", {userId: userId}, function (data) {
                        if ("success"==data) {
                            //如果修改成功,则刷新页面
                            window.location.reload(); //刷新当前页面
                            layer.msg('删除成功!', {icon: 1});
                        }
                    }).error(function () {
                        layer.msg('删除失败!', {icon:5});
                    });
                });
            }
            if (obj.event === 'yes') {
                var userId = obj.data.userId;
                //已启用,设置为禁用
                $.post("/user/updateState.do", {userId: userId, status: 0}, function (data) {
                    var data = data;
                    if (data == "success") {
                        //如果修改成功,则刷新页面
                        //window.location.reload(); //刷新当前页面
                        window.location.href="/user/index.do";
                    }
                })
            }
            if (obj.event === 'no') {
                var userId = obj.data.userId;
                //已禁用,设置为启用
                $.post("/user/updateState.do", {userId: userId, status: 1}, function (data) {
                    var data = data;
                    if (data == "success") {
                        //如果修改成功,则刷新页面
                        //window.location.reload(); //刷新当前页面
                        window.location.href="/user/index.do";
                    }
                })
            }
        });
        //弹出层
        var msg = "${msg}";
        if (msg.length != "") {
            layer.msg(msg, {icon: 6});
            $("#msg").text("");
        }
    });
</script>
</body>

</html>