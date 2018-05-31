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
    <title>查看试题</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <script src="../assets/js/echarts.min.js"></script>
    <link rel="stylesheet" href="../assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="../assets/css/app.css">
    <link rel="stylesheet" href="../assets/css/font-awesome.min.css"/>
    <script src="../assets/js/jquery.min.js"></script>

</head>

<body data-type="widgets">
<script src="../assets/js/theme.js"></script>
<div class="am-g tpl-g">
    <!-- 内容区域 -->
    <div class="row-content am-cf">
        <div class="row">
            <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                <div class="widget am-cf">
                    <div class="widget-head am-cf">
                        <h1>
                            <a href="#">首页</a>
                            <small>
                                <i class="icon-double-angle-right"></i>
                                <a href="javascript:window.history.go(-2)">学生能力查看</a>
                                <small>
                                    <i class="icon-double-angle-right"></i>
                                    <a href="javascript:window.history.go(-1)">能得分详情</a>
                                    <small>
                                        <i class="icon-double-angle-right"></i>
                                        查看试题
                                    </small>
                                </small>
                            </small>
                        </h1>
                    </div>
                    <div class="widget-body am-fr">

                        <form class="am-form tpl-form-border-form tpl-form-border-br">
                            <div class="am-form-group">
                                <div class="am-form-group">
                                    <label class="am-u-sm-3 am-form-label">试题内容<span
                                            class="tpl-form-line-small-title">context</span></label>
                                    <div class="am-u-sm-9">
                                        <textarea class="" rows="10" disabled>${que.contextQ}</textarea>
                                    </div>
                                </div>

                                <label class="am-u-sm-3 am-form-label">试题分值 <span
                                        class="tpl-form-line-small-title">score</span></label>
                                <div class="am-u-sm-9">
                                    <input type="text" class="tpl-form-input" disabled value="${que.scoreQ}">
                                </div>

                                <label class="am-u-sm-3 am-form-label">试题答案 <span
                                        class="tpl-form-line-small-title">answer</span></label>
                                <div class="am-u-sm-9">
                                    <input type="text" class="tpl-form-input" disabled value="${que.answerQ}">
                                </div>

                                <label class="am-u-sm-3 am-form-label">规定时间 <span
                                        class="tpl-form-line-small-title">time</span></label>
                                <div class="am-u-sm-9">
                                    <input type="text" class="tpl-form-input" disabled value="${que.timeQ}">
                                </div>

                                <label class="am-u-sm-3 am-form-label">学生答案 <span
                                        class="tpl-form-line-small-title">sanswer</span></label>
                                <div class="am-u-sm-9">
                                    <input type="text" class="tpl-form-input" disabled
                                           value="${mhtps.get(0).answerHtp}">
                                </div>

                                <label class="am-u-sm-3 am-form-label">试题得分 <span
                                        class="tpl-form-line-small-title">sscore</span></label>
                                <div class="am-u-sm-9">
                                    <input type="text" class="tpl-form-input" disabled value="${mhtps.get(0).scoreHtp}">
                                </div>

                                <label class="am-u-sm-3 am-form-label">试题耗时 <span
                                        class="tpl-form-line-small-title">stime</span></label>
                                <div class="am-u-sm-9">
                                    <input type="text" class="tpl-form-input" disabled
                                           value="${mhtps.get(0).timeconsumingHtp}">
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
                                                        <input type="checkbox" id="istrueO" name="istrueO"
                                                               disabled checked="${op.istrueO}">
                                                    </c:when>
                                                    <c:otherwise>
                                                        <input type="checkbox" id="istrueO" name="istrueO" disabled>
                                                    </c:otherwise>
                                                </c:choose>
                                            </span>
                                        <%--<input type="text" id="contextO" name="contextO"
                                               class="am-form-field" value="${op.contextO}" disabled>
                                        <input type="hidden" value="${op.idO}" name="idO" disabled>--%>
                                    </div>
                                </div>
                            </c:forEach>

                            <%--知识点输出--%>
                            <c:forEach var="kp" items="${kplist}">
                                <div class="am-form-group">
                                    <label class="am-u-sm-3 am-form-label">知识点
                                        <span class="tpl-form-line-small-title">Author</span></label>
                                    <div class="am-u-sm-9">
                                        <input type="text" class="tpl-form-input" disabled value="${kp.nameKp}">
                                    </div>
                                            <%--<c:forEach var="a" items="${Allkplist}">
                                                <option value="${a.idKp}" disabled>${a.nameKp}</option>
                                            </c:forEach>--%>
                                    <label class="am-u-sm-3 am-form-label">权重
                                        <span class="tpl-form-line-small-title">Weights</span></label>
                                    <div class="am-u-sm-9">
                                        <input type="text" id="user-weibo" value="${kp.proportionKp}" disabled>
                                    </div>
                                </div>
                            </c:forEach>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../assets/js/amazeui.min.js"></script>
<script src="../assets/js/app.js"></script>
</body>

</html>