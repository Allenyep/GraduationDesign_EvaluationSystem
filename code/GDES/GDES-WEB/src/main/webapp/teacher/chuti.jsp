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
    <title>问题列表</title>
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
                        试题列表
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
                                        <th class="hidden-480">试题内容</th>
                                        <th class="hidden-480">试题答案</th>
                                        <th class="hidden-480">试题分数</th>
                                        <%--<th>
                                            <i class="icon-time bigger-110 hidden-480"></i>
                                            更新日期(最后日期)
                                        </th>--%>
                                        <th class="hidden-480">试题类型</th>
                                        <th class="hidden-480">操作</th>
                                        <th></th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${qlist}" var="a">
                                        <tr>
                                            <td class="center">

                                            </td>

                                            <td class="hidden-480">
                                                <a href="/teacher/shitidetail.do?idQ=${a.idQ}">
                                                    <div style="width:400px;word-wrap:break-word;">
                                                        ${a.contextQ}
                                                    </div>
                                                </a>
                                            </td>
                                            <td class="hidden-480">
                                                <div style="width:100px;word-wrap:break-word;">
                                                    ${a.answerQ}
                                                </div>
                                            </td>
                                            <td class="hidden-480">${a.scoreQ}</td>
                                                <%--<td>Feb 12</td>--%>
                                            <td class="hidden-480">
                                                <c:choose>
                                                    <c:when test="${a.styleQ=='1'}">
                                                        选择题
                                                    </c:when>
                                                    <c:when test="${a.styleQ=='2'}">
                                                        填空题
                                                    </c:when>
                                                    <c:when test="${a.styleQ=='3'}">
                                                        判断题
                                                    </c:when>
                                                    <c:when test="${a.styleQ=='4'}">
                                                        主观题
                                                    </c:when>
                                                </c:choose>
                                            </td>

                                            <td>
                                                <a class="btn btn-danger">删除</a>
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


<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">编辑题目内容</h4>
            </div>
            <div class="modal-body">在这里添加一些文本</div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">提交更改</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
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
