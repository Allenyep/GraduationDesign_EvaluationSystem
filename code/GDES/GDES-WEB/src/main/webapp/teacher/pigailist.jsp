<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2018/5/21
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
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
    <title>批改试题列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../assets/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="../assets/css/ace.min.css"/>
</head>

<body>

<div class="main-container" id="main-container">
    <div class="main-container-inner">
        <div class="page-content">
            <div class="page-header">
                <h1>
                    首页
                    <small>
                        <i class="icon-double-angle-right"></i>
                        待批改试卷表&nbsp;
                    </small>
                    <small style="color: red">
                        ${message}
                    </small>
                    <a type="button" class="btn btn-info" style="float: right"
                       href="${basePath}excle/sdown.do?id_s=631406010102">查 看</a>
                </h1>
            </div><!-- /.page-header -->
            <div class="row">
                <div class="col-xs-12">
                    <!-- PAGE CONTENT BEGINS -->
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="table-responsive">
                                <table id="sample-table-2" class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th class="center">

                                        </th>
                                        <%--这里点击查看--%>
                                        <th class="hidden-480">测评记录号</th>
                                        <th class="hidden-480">学生编号</th>
                                        <th class="hidden-480">测评学生</th>
                                        <th class="hidden-480">测评时间</th>
                                        <th class="hidden-480">操作</th>
                                        <th></th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${erlist}" var="a">
                                        <tr>
                                            <td class="center">

                                            </td>

                                            <td class="hidden-480">
                                                    <div style="width:250px;word-wrap:break-word;">
                                                            ${a.idEr}
                                                    </div>
                                            </td>
                                            <td class="hidden-480">${a.idS}</td>
                                            <td class="hidden-480">
                                                <div style="width:100px;word-wrap:break-word;">
                                                        ${a.student.nameS}
                                                </div>
                                            </td>

                                            <td class="hidden-480">${a.beginEr}</td>
                                            <td class="hidden-480">
                                                <a href="/question/pigaidetail.do?idEr=${a.idEr}&idT=${idT}" type="button"
                                                   class="btn btn-info">批 改</a>
                                            </td>

                                            <td>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div><!-- /.col -->
            </div><!-- /.row -->
        </div><!-- /.page-content -->
    </div><!-- /.main-content -->
</div><!-- /.main-container -->


<!-- basic scripts -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='../assets/js/jquery-2.0.3.min.js'>" + "<" + "/script>");
</script>
<script src="../assets/js/bootstrap.min.js"></script>
<script src="../assets/js/jquery.dataTables.min.js"></script>
<script src="../assets/js/jquery.dataTables.bootstrap.js"></script>
<script type="text/javascript">
    jQuery(function ($) {
        var oTable1 = $('#sample-table-2').dataTable({
            "aoColumns": [
                {"bSortable": false},
                null, null, null, null, null,
                {"bSortable": false}
            ]
        });


        $('table th input:checkbox').on('click', function () {
            var that = this;
            $(this).closest('table').find('tr > td:first-child input:checkbox')
                .each(function () {
                    this.checked = that.checked;
                    $(this).closest('tr').toggleClass('selected');
                });

        });


        $('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});

        function tooltip_placement(context, source) {
            var $source = $(source);
            var $parent = $source.closest('table')
            var off1 = $parent.offset();
            var w1 = $parent.width();

            var off2 = $source.offset();
            var w2 = $source.width();

            if (parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2)) return 'right';
            return 'left';
        }
    })


</script>

</body>
</html>

