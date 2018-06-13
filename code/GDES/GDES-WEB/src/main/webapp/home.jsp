<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    session.setAttribute("basePath",basePath);
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>首页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="assets/img/favicon.png">
    <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="assets/css/app.css">
    <link rel="stylesheet" href="assets/layui/css/layui.css"/>
    <script src="assets/js/jquery.min.js"></script>



</head>

<body>
<script src="assets/js/theme.js"></script>
<div class="am-g tpl-g">
    <!-- 头部 -->
    <header>
        <!-- logo -->
        <div class="am-fl tpl-header-logo">
            <a href="javascript:;"><img src="assets/img/logo.png" alt=""></a>
        </div>
        <!-- 右侧内容 -->
        <div class="tpl-header-fluid">
            <!-- 侧边切换 -->
            <div class="am-fl tpl-header-switch-button am-icon-list">
                    <span>

                </span>
            </div>
            <!-- 搜索 -->
            <div class="am-fl tpl-header-search">
                <form class="tpl-header-search-form" action="javascript:;">
                    <button class="tpl-header-search-btn am-icon-search"></button>
                    <input class="tpl-header-search-box" type="text" placeholder="搜索内容...">
                </form>
            </div>
            <!-- 其它功能-->
            <div class="am-fr tpl-header-navbar">
                <ul>
                    <!-- 欢迎语 -->
                    <li class="am-text-sm tpl-header-navbar-welcome">
                        <a href="javascript:;">欢迎你, <span><shiro:principal property="staffname"/> </span> </a>
                    </li>



                    <!-- 退出 -->
                    <li class="am-text-sm">
                        <a href="/logout">
                            <span class="am-icon-sign-out"></span> 退出
                        </a>
                    </li>
                </ul>
            </div>
        </div>

    </header>
    <!-- 风格切换 -->
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
    <!-- 侧边导航栏 -->
    <div class="left-sidebar">
        <!-- 用户信息 -->
        <div class="tpl-sidebar-user-panel">
            <div class="tpl-user-panel-slide-toggleable">
                <div class="tpl-user-panel-profile-picture">
                    <img src="assets/img/pikachu.jpg" alt="">
                </div>
                <span class="user-panel-logged-in-text">
              <i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
              你好，<shiro:principal property="username"></shiro:principal>
          </span>
                <a href="javascript:;" class="tpl-user-panel-action-link"> <span class="am-icon-pencil"></span> 账号设置</a>
            </div>
        </div>

        <!-- 菜单 -->
        <ul class="sidebar-nav">
            <c:forEach items="${list}" var="menus">
            <li class="sidebar-nav-heading">Components <span class="sidebar-nav-heading-info"> 功能菜单</span></li>
                <c:forEach items="${menus.get(0).childMenu}" var="childMenu">
                    <li class="sidebar-nav-link">
                        <c:choose>
                            <c:when test="${childMenu.menuname=='学生首页'}">
                                <a href="${childMenu.url}" target="index">
                                    <i class="am-icon-home sidebar-nav-link-logo"></i> ${childMenu.menuname}
                                </a>
                            </c:when>
                            <c:when test="${childMenu.menuname=='教师首页'}">
                                <a href="${childMenu.url}" target="index">
                                    <i class="am-icon-home sidebar-nav-link-logo"></i> ${childMenu.menuname}
                                </a>
                            </c:when>
                            <c:otherwise>
                                <a href="javascript:;" >
                                    <i class="am-icon-home sidebar-nav-link-logo"></i> ${childMenu.menuname}
                                </a>
                            </c:otherwise>
                        </c:choose>

                        <ul class="sidebar-nav sidebar-nav-sub" style="display: block">
                            <c:forEach items="${childMenu.childMenu}" var="menu">
                                <li class="sidebar-nav-link">
                                    <a href="${menu.url}"  target="index">
                                        <span class="am-icon-angle-right sidebar-nav-link-logo"></span> ${menu.menuname}
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>

                    </li>
                </c:forEach>
            </c:forEach>



            <%--<li class="sidebar-nav-link">--%>
                <%--<a href="javascript:;" class="sidebar-nav-sub-title">--%>
                    <%--<i class="am-icon-table sidebar-nav-link-logo"></i> 学生信息管理--%>
                    <%--<span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>--%>
                <%--</a>--%>
            <%--</li>--%>
            <%--<li class="sidebar-nav-link">--%>
                <%--<a href="javascript:;" class="sidebar-nav-sub-title">--%>
                    <%--<i class="am-icon-table sidebar-nav-link-logo"></i> 教师信息管理--%>
                    <%--<span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>--%>
                <%--</a>--%>
            <%--</li>--%>
            <%--<shiro:hasRole name="student">--%>
                <%--<li class="sidebar-nav-link">--%>
                    <%--<a href="javascript:;" class="sidebar-nav-sub-title">--%>
                        <%--<i class="am-icon-table sidebar-nav-link-logo"></i> 学科负责人信息管理--%>
                        <%--<span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>--%>
                    <%--</a>--%>
                <%--</li>--%>
            <%--</shiro:hasRole>--%>
            <a href="/usertest/tiao.do">跳转</a>
            <a href="/permission/reload.do">加载权限</a>
        </ul>
    </div>


    <!-- 内容区域 -->
    <!-- 出题界面 -->

    <div class="tpl-content-wrapper">
        <c:forEach items="${list}" var="menus">
            <c:forEach items="${menus.get(0).childMenu}" var="childMenu">
                <c:if test="${childMenu.menuname=='学生首页'}">
                    <iframe name="index" src="${childMenu.url}" height="100%" width="100%"></iframe>
                </c:if>
                <c:if test="${childMenu.menuname=='教师首页'}">
                    <iframe name="index" src="${childMenu.url}" height="100%" width="100%"></iframe>
                </c:if>
            </c:forEach>
        </c:forEach>
    </div>

</div>
</div>
<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/app.js"></script>

</body>

</html>