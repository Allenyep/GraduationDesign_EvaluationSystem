<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    session.setAttribute("basePath", basePath);
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>能力点</title>
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../assets/css/font-awesome.min.css" rel="stylesheet"/>
    <link href="../assets/css/dataTables.bootstrap.css" rel="stylesheet"/>
</head>
<body>
<div class="row">
    <div class="col-md-12">
        <!-- Advanced Tables -->
        <div class="panel panel-default">
            <div class="page-header">
                <h3>
                    <a href="#">首页</a>
                    <small>
                        <i class="icon-double-angle-right"></i>
                        能力点
                    </small>
                    <label class="text-center" style="margin-left: 10%">注：0~5表示对专业的要求，数字越大要求越高</label>
                </h3>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                        <tr>
                            <th class="center">专业基本能力</th>
                            <th class="center">方面</th>
                            <th class="center">能力</th>
                            <th class="center">计算机工程(CE)</th>
                            <th class="center">计算机科学(CS)</th>
                            <th class="center">系统工程(SE)</th>
                            <th class="center">信息系统(IS)</th>
                            <th class="center">信息技术(IT)</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${aplist}" var="al">
                            <tr class="gradeA">
                                <td class="center">${al.classAp}</td>
                                <td class="center">${al.aspectAp}</td>
                                <td class="center">${al.nameAp}</td>
                                <c:forEach items="${all}" var="a" >
                                    <c:if test="${a.idAp==al.idAp}">
                                        <c:if test="${a.idMb==1}">
                                            <td class="center">${a.requiredlevelPapr}</td>
                                        </c:if>
                                        <c:if test="${a.idMb==2}">
                                            <td class="center">${a.requiredlevelPapr}</td>
                                        </c:if>
                                        <c:if test="${a.idMb==3}">
                                            <td class="center">${a.requiredlevelPapr}</td>
                                        </c:if>
                                        <c:if test="${a.idMb==4}">
                                            <td class="center">${a.requiredlevelPapr}</td>
                                        </c:if>
                                        <c:if test="${a.idMb==5}">
                                            <td class="center">${a.requiredlevelPapr}</td>
                                        </c:if>
                                    </c:if>
                                </c:forEach>
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
