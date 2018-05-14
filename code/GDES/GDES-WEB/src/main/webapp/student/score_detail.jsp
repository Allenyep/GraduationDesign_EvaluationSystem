<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    session.setAttribute("basePath", basePath);
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>能力点得分详情</title>
    <link rel="stylesheet" href="../assets/css/bootstrap.css"/>
    <link rel="stylesheet" href="../assets/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="../assets/css/dataTables.bootstrap.css"/>
    <link rel="stylesheet" href="../assets/css/ace.min.css"/>
</head>
<body>
<div class="main-container" id="main-container">
    <div class="main-container-inner">
        <div class="page-content">
            <div class="page-header">
                <h1>
                    <a href="">首页</a>
                    <small>
                        <i class="icon-double-angle-right"></i>
                        <a href="javascript:history.back(-1)">得分表</a>
                        <small>
                            <i class="icon-double-angle-right"></i>
                            得分详情
                        </small>
                    </small>
                </h1>
            </div><!-- /.page-header -->
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>能力点编号</th>
                                        <th>能力点名称</th>
                                        <th>试题来源</th>
                                        <th>能力点得分</th>
                                        <th>阅卷教师</th>
                                        <th>得分时间</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${detail}" var="d">
                                    <tr class="odd gradeX">
                                         <td class="center">${d.idAp}</td>
                                        <td class="center">${d.abilitypoint.nameAp}</td>
                                        <td class="center">
                                            <a href="#">查看试题</a>
                                        </td>
                                        <td class="center">${d.scoreSd}</td>
                                        <td class="center">${d.teacher.nameT}</td>
                                        <td class="center">${d.timeSd}</td>
                                    </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../assets/js/jquery-1.10.2.js"></script>

<script src="../assets/js/jquery.dataTables.js"></script>
<script src="../assets/js/dataTables.bootstrap.js"></script>
<script>
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });
</script>
</body>
</html>
