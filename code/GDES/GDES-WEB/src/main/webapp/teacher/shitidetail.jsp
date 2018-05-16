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
    <script src="../assets/js/echarts.min.js"></script>
    <link rel="stylesheet" href="../assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="../assets/css/amazeui.datatables.min.css"/>
    <link rel="stylesheet" href="../assets/css/app.css">
    <script src="../assets/js/jquery.min.js"></script>
</head>

<body>

<div class="main-container" id="main-container">
    <div class="main-container-inner">
        <div class="page-content">
            <div class="page-header" style="background: white">
                <h1>
                    首页
                    <small>
                        <i class="icon-double-angle-right"></i>
                        <a onclick="javascript:window.history.back(-1);">试题列表</a>
                    </small>
                    <small>
                        <i class="icon-double-angle-right"></i>
                        试题详情
                    </small>
                    <a type="button" class="btn btn-info" style="float: right">查 看</a>
                </h1>
            </div><!-- /.page-header -->
            <div class="row">
                <div class="col-xs-12">
                    <!-- PAGE CONTENT BEGINS -->
                    <div class="row">
                        <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                            <div class="widget-body am-fr">
                                <form class="am-form tpl-form-border-form tpl-form-border-br">
                                    <div class="am-form-group">
                                        <label for="user-intro" class="am-u-sm-3 am-form-label">试题内容</label>
                                        <div class="am-u-sm-9">
                                            <textarea class="" rows="10" id="user-intro" placeholder="请输入试题内容"></textarea>
                                            <small>试题内容</small>
                                        </div>
                                    </div>
                                    <div class="am-form-group">
                                        <label for="user-name" class="am-u-sm-3 am-form-label">试题答案 <span class="tpl-form-line-small-title">Title</span></label>
                                        <div class="am-u-sm-9">
                                            <input type="text" class="tpl-form-input" id="user-name" placeholder="请输入答案">
                                            <small>试题答案</small>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="zhishidian" class="am-u-sm-3 am-form-label">作者 <span class="tpl-form-line-small-title">Author</span></label>
                                        <div class="am-u-sm-9">
                                            <select data-am-selected="{searchBox: 1}" id="zhishidian" name="zhishidian" style="display: none;">
                                                <option value="a">-The.CC</option>
                                                <option value="b">夕风色</option>
                                                <option value="o">Orange</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <div class="am-u-sm-9 am-u-sm-push-3">
                                            <button type="button" class="am-btn am-btn-primary tpl-btn-bg-color-success ">提交</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div><!-- /.col -->
            </div><!-- /.row -->
        </div><!-- /.page-content -->
    </div><!-- /.main-content -->
</div><!-- /.main-container -->

<script type="text/javascript">
    window.jQuery || document.write("<script src='../assets/js/jquery-2.0.3.min.js'>" + "<" + "/script>");
</script>
<script src="../assets/js/bootstrap.min.js"></script>
<script src="../assets/js/amazeui.min.js"></script>
<script src="../assets/js/amazeui.datatables.min.js"></script>
<script src="../assets/js/dataTables.responsive.min.js"></script>
<script src="../assets/js/app.js"></script>


</body>
</html>
