<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/5/10
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="left-sidebar">
    <!-- 用户信息 -->
    <div class="tpl-sidebar-user-panel">
        <div class="tpl-user-panel-slide-toggleable">
            <div class="tpl-user-panel-profile-picture">
                <img src="${ctxAssets}/img/user00.png" alt="">
            </div>
            <span class="user-panel-logged-in-text">
              <i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
              你好，<shiro:principal/>
          </span>
            <a href="javascript:;" class="tpl-user-panel-action-link"> <span class="am-icon-pencil"></span> 账号设置</a>
        </div>
    </div>

    <!-- 菜单 -->
    <ul class="sidebar-nav">
        <li class="sidebar-nav-heading">Components <span class="sidebar-nav-heading-info"> 功能菜单</span></li>
        <li class="sidebar-nav-link">
            <a href="index.html" class="active">
                <i class="am-icon-home sidebar-nav-link-logo"></i> 首页(教师个人信息)
            </a>
        </li>
        <li class="sidebar-nav-link">
            <a href="javascript:;" class="sidebar-nav-sub-title">
                <i class="am-icon-table sidebar-nav-link-logo"></i> 试题管理
                <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
            </a>
            <ul class="sidebar-nav sidebar-nav-sub">
                <li class="sidebar-nav-link">
                    <%--<a href="<%=basePath%>permission/chuti.jsp">--%>
                    <a href="/usertest/permission/chuti.do">
                        <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 出题
                    </a>
                </li>
                <li class="sidebar-nav-link">
                    <!-- 查询链接 -->
                    <a href="shitiliebiao.html">
                        <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 查看试题列表
                    </a>
                </li>
            </ul>
        </li>
        <li class="sidebar-nav-link">
            <a href="javascript:;" class="sidebar-nav-sub-title">
                <i class="am-icon-table sidebar-nav-link-logo"></i> 学生成绩管理
                <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
            </a>
            <ul class="sidebar-nav sidebar-nav-sub">
                <li class="sidebar-nav-link">
                    <a href="paihangbang.html">
                        <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 排行榜
                    </a>
                </li>
                <li class="sidebar-nav-link">
                    <a href="javascript:;">
                        <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 学生成绩查看
                    </a>
                </li>
            </ul>
        </li>
        <shiro:hasRole name="admin">


        <li class="sidebar-nav-link">
            <a href="javascript:;" class="sidebar-nav-sub-title">
                <i class="am-icon-table sidebar-nav-link-logo"></i> 用户信息管理
                <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
            </a>
            <ul class="sidebar-nav sidebar-nav-sub">
                <li class="sidebar-nav-link">
                    <a href="paihangbang.html">
                        <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 学生信息管理
                    </a>
                </li>
                <li class="sidebar-nav-link">
                    <a href="javascript:;">
                        <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 教师信息管理
                    </a>
                </li>
            </ul>
        </li>
        </shiro:hasRole>
        <!---->
        <!--<li class="sidebar-nav-link">-->
        <!--<a href="tables.html">-->
        <!--<i class="am-icon-table sidebar-nav-link-logo"></i> 表格-->
        <!--</a>-->
        <!--</li>-->
        <!--<li class="sidebar-nav-link">-->
        <!--<a href="calendar.html">-->
        <!--<i class="am-icon-calendar sidebar-nav-link-logo"></i> 日历-->
        <!--</a>-->
        <!--</li>-->
        <!--<li class="sidebar-nav-link">-->
        <!--<a href="form.html">-->
        <!--<i class="am-icon-wpforms sidebar-nav-link-logo"></i> 表单-->

        <!--</a>-->
        <!--</li>-->
        <!--<li class="sidebar-nav-link">-->
        <!--<a href="chart.html">-->
        <!--<i class="am-icon-bar-chart sidebar-nav-link-logo"></i> 图表-->

        <!--</a>-->
        <!--</li>-->

        <!--<li class="sidebar-nav-heading">Page<span class="sidebar-nav-heading-info"> 常用页面</span></li>-->
        <!--<li class="sidebar-nav-link">-->
        <!--<a href="javascript:;" class="sidebar-nav-sub-title">-->
        <!--<i class="am-icon-table sidebar-nav-link-logo"></i> 数据列表-->
        <!--<span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>-->
        <!--</a>-->
        <!--<ul class="sidebar-nav sidebar-nav-sub">-->
        <!--<li class="sidebar-nav-link">-->
        <!--<a href="table-list.html">-->
        <!--<span class="am-icon-angle-right sidebar-nav-link-logo"></span> 文字列表-->
        <!--</a>-->
        <!--</li>-->

        <!--<li class="sidebar-nav-link">-->
        <!--<a href="table-list-img.html">-->
        <!--<span class="am-icon-angle-right sidebar-nav-link-logo"></span> 图文列表-->
        <!--</a>-->
        <!--</li>-->
        <!--</ul>-->
        <!--</li>-->
        <!--<li class="sidebar-nav-link">-->
        <!--<a href="sign-up.html">-->
        <!--<i class="am-icon-clone sidebar-nav-link-logo"></i> 注册-->
        <!--<span class="am-badge am-badge-secondary sidebar-nav-link-logo-ico am-round am-fr am-margin-right-sm">6</span>-->
        <!--</a>-->
        <!--</li>-->
        <!--<li class="sidebar-nav-link">-->
        <!--<a href="login.html">-->
        <!--<i class="am-icon-key sidebar-nav-link-logo"></i> 登录-->
        <!--</a>-->
        <!--</li>-->
        <!--<li class="sidebar-nav-link">-->
        <!--<a href="404.html">-->
        <!--<i class="am-icon-tv sidebar-nav-link-logo"></i> 404错误-->
        <!--</a>-->
        <!--</li>-->

    </ul>
</div>
