<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="taglib.jsp"%>
<html>
<head>
<%@ include file="head.jsp"%>

    <title>新增用户</title>
</head>
<body>
    <div><h1 class="text-center">这里是新增用户</h1></div>
    <div id="main" class="container">
        <div class="row">
            <div class="col-lg-6 col-sm-6 col-md-6">
                <form action="${ctx}/usertest/${human == null ? 'submit.do' : 'update.do'}" method="post">

                    <input type="hidden" name="id" value="${human.id}">
                    <div class="form-group">
                        <label>姓名</label>
                        <input type="text" value="${human.name}" class="form-control" name="name" placeholder="请输入姓名">
                    </div>

                    <div class="form-group">
                        <label>年龄</label>
                        <input type="text" value="${human.age}" class="form-control" name="age" placeholder="请输入年龄">
                    </div>

                    <!-- name必须保持一样才能单选框选择 -->
                    <div class="form-group">
                        <label>性别</label>
                        <div class="radio-inline">
                            <input type="radio" <c:if test="${human != null && human.sex == 1}">checked="checked"</c:if> name="sex" value="1">男
                        </div>
                        <div class="radio-inline">
                            <input type="radio" <c:if test="${human != null && human.sex == 2}">checked="checked"</c:if> name="sex" value="2">女
                        </div>
                    </div>

                    <div class="form-group">
                        <label>备注</label>
                        <textarea style="height: auto" class="form-control" name="remark" placeholder="请输入备注">${human.remark}</textarea>
                    </div>

                    <div style="text-align: center">
                        <button type="submit" class="btn btn-primary" style="width: 120px;height: 45px">提交</button>
                    </div>

                </form>
            </div>
        </div>
    </div>
</body>
</html>
