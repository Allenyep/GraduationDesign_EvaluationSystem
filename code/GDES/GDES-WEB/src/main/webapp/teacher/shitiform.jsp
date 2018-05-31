<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    session.setAttribute("basePath", basePath);
%>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze UI Admin index Examples</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="icon" type="image/png" href="../assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <script src="../assets/js/echarts.min.js"></script>
    <link rel="stylesheet" href="../assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="../assets/css/amazeui.datatables.min.css"/>
    <link rel="stylesheet" href="../assets/css/app.css">
    <script src="../assets/js/jquery.min.js"></script>

</head>

<body data-type="widgets">
<script src="../assets/js/theme.js"></script>
<div class="am-g tpl-g">
    <div class="tpl-skiner">
        <div class="tpl-skiner-toggle am-icon-cog">
        </div>
        <div class="tpl-skiner-content">
            <div class="tpl-skiner-content-title">
                选择主题
            </div>
            <div class="tpl-skiner-content-bar">
                <span class="skiner-color skiner-white" data-color="theme-white"></span>
                <span class="skiner-color skiner-black" data-color="theme-black"></span>
            </div>
        </div>
    </div>
    <!-- 内容区域 -->
    <div>

        <div class="container-fluid am-cf">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-9">
                    <div class="page-header-heading"><span class="am-icon-home page-header-heading-icon"></span> 首页>>
                        <small><a onclick="javascript:window.history.back(-1);">试题列表</a></small>>><small>试题详情</small>
                    </div>
                    <p class="page-header-description">修改试题内容</p>
                </div>
                <div class="am-u-lg-3 tpl-index-settings-button">
                    <button type="button" class="page-header-button"><span class="am-icon-paint-brush"></span> 设置
                    </button>
                </div>
            </div>

        </div>

        <div class="row-content am-cf">


            <div class="row">

                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <div class="widget-head am-cf">
                            <div class="widget-title am-fl">试题表单           ${message}</div>
                            <div class="widget-function am-fr">
                                <a href="javascript:;"  class="am-icon-cog" ></a>
                            </div>
                        </div>
                        <div class="widget-body am-fr">

                            <form class="am-form tpl-form-border-form tpl-form-border-br"
                                  method="post" action="/teacher/updateshiti.do">
                                <div class="am-form-group">
                                    <input type="hidden" value="${que.idQ}" name="idQ">
                                    <div class="am-form-group">
                                        <label for="contextQ" class="am-u-sm-3 am-form-label">试题内容<span
                                                class="tpl-form-line-small-title">context</span></label>
                                        <div class="am-u-sm-9">
                                            <textarea class="" name="contextQ" rows="10" id="contextQ" placeholder="试题内容">${que.contextQ}</textarea>
                                        </div>
                                    </div>

                                    <label for="answerQ" class="am-u-sm-3 am-form-label">试题答案 <span
                                            class="tpl-form-line-small-title">answer</span></label>
                                    <div class="am-u-sm-9">
                                        <input type="text" class="tpl-form-input" name="answerQ" id="answerQ" placeholder="请输入试题答案" value="${que.answerQ}">
                                        <small>请在这里填写试题答案</small>
                                    </div>

                                    <label for="scoreQ" class="am-u-sm-3 am-form-label">试题分数 <span
                                            class="tpl-form-line-small-title">score</span></label>
                                    <div class="am-u-sm-9">
                                        <input type="text" class="tpl-form-input" name="scoreQ" id="scoreQ" placeholder="请输入试题分数" value="${que.scoreQ}">
                                        <small>请在这里填写试题分数</small>
                                    </div>
                                </div>

                                <%--输出选择题选项--%>
                                <c:forEach var="op" items="${oplist}">
                                    <div class="am-u-lg-6">
                                        <label for="contextO" class="am-u-sm-3 am-form-label">选项 <span
                                                class="tpl-form-line-small-title">option</span></label>
                                        <div class="am-input-group">
                                            <span class="am-input-group-label">
                                                <c:choose>
                                                    <c:when test="${op.istrueO==true}">
                                                        <input type="checkbox" id="istrueO" name="istrueO" checked="${op.istrueO}">
                                                    </c:when>
                                                    <c:otherwise>
                                                        <input type="checkbox" id="istrueO" name="istrueO">
                                                    </c:otherwise>
                                                </c:choose>
                                            </span>
                                            <input type="text" id="contextO" name="contextO"
                                                   class="am-form-field" value="${op.contextO}">
                                            <input type="hidden" value="${op.idO}" name="idO">
                                        </div>
                                    </div>
                                </c:forEach>

                                <%--知识点输出--%>
                                <c:forEach var="kp" items="${kplist}">
                                    <div class="am-form-group">
                                        <label for="knowpoint" class="am-u-sm-3 am-form-label">知识点 <span
                                                class="tpl-form-line-small-title">Author</span></label>
                                        <div class="am-u-sm-9">
                                            <select data-am-selected="{searchBox: 1}" name="knowpoint" id="knowpoint" style="display: none;">
                                                <option value="${kp.idKp}">${kp.nameKp}</option>
                                                <c:forEach var="a" items="${Allkplist}">
                                                    <option value="${a.idKp}">${a.nameKp}</option>
                                                </c:forEach>
                                            </select>
                                            <input type="text" id="user-weibo" value="${kp.proportionKp}" placeholder="输入知识点占比" >
                                        </div>
                                    </div>
                                </c:forEach>

                                <div class="am-form-group">
                                    <div class="am-u-sm-9 am-u-sm-push-3">
                                        <button type="submit" class="am-btn am-btn-primary tpl-btn-bg-color-success ">
                                            提交
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>



        </div>
    </div>
</div>
</div>
<script src="../assets/js/amazeui.min.js"></script>
<script src="../assets/js/amazeui.datatables.min.js"></script>
<script src="../assets/js/dataTables.responsive.min.js"></script>
<script src="../assets/js/app.js"></script>

</body>

</html>