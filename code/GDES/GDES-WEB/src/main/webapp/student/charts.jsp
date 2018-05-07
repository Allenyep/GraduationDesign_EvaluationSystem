<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    session.setAttribute("basePath",basePath);
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>能力概况</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="../assets/css/style.css"/>
    <link rel="stylesheet" href="../assets/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="../assets/css/custom.css">
    <link rel="stylesheet" href="../assets/css/amazeui.css"/>
    <link rel="stylesheet" href="../assets/css/ace.min.css"/>
    <script type="text/javascript" src="../assets/js/Chart.js"></script>
    <script type="text/javascript" src="../assets/js/echarts.min.js"></script>
    <script type="text/javascript" src="../assets/js/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="../assets/js/bootstrap.min.js"></script>

</head>
<body>
<div class="page-content">
    <div class="page-header">
        <h1>
            主页
            <small>
                <i class="icon-double-angle-right"></i>
                图解
            </small>
        </h1>
    </div>

    <!--饼状图-->
    <div class="am-u-md-6 chrt-page-grids">
        <!-- Step Line -->
        <div class="card-box">
            <div id="pie3" style="width: 100%;height: 400px;"></div>
        </div>
    </div>

    <!--雷达图-->
    <div class="col-md-6 chrt-page-grids">
        <h4 class="title">职位推荐</h4>
        <div class="radar-grid">
            <canvas id="radar" height="292" width="400" style="width: 400px; height: 292px;"></canvas>
        </div>
    </div>

    <div class="clearfix"></div>

    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading">
                待定标题
            </div>
            <div class="panel-body">
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a href="#home" data-toggle="tab">推荐职位</a>
                    </li>
                    <li class="">
                        <a href="#profile" data-toggle="tab">待定</a>
                    </li>
                    <li class="">
                        <a href="#messages" data-toggle="tab">待定</a>
                    </li>
                    <li class="">
                        <a href="#settings" data-toggle="tab">待定</a>
                    </li>
                </ul>

                <div class="tab-content">
                    <div class="tab-pane fade active in" id="home">
                        <h4>Home Tab</h4>
                        <p> 根据分析，推荐最佳职位为：UI设计。<br/>
                            推荐职位排行：UI设计>数据库设计>Web开发>移动开发>前端工程师>软件测试>系统运营
                        </p>
                    </div>
                    <div class="tab-pane fade" id="profile">
                        <h4>Profile Tab</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
                            labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in
                            voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
                            cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                    </div>
                    <div class="tab-pane fade" id="messages">
                        <h4>Messages Tab</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
                            labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in
                            voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
                            cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                    </div>
                    <div class="tab-pane fade" id="settings">
                        <h4>Settings Tab</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
                            labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in
                            voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
                            cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                    </div>
                </div>
            </div>
        </div>

        <script>
            <!--雷达图-->
            var radarChartData = {
                labels: ["Web开发", "移动开发", "UI设计", "数据库设计", "前端工程师", "软件测试", "系统运营"],
                datasets: [
                    {
                        fillColor: "rgba(239, 85, 58, 0.87)",
                        strokeColor: "#e94e02",
                        pointColor: "#e94e02",
                        pointStrokeColor: "#fff",
                        data: [65, 59, 90, 81, 56, 55, 40]
                    },
                    // {
                    //     fillColor: "rgba(79, 82, 186, 0.87)",
                    //     strokeColor: "#4F52BA",
                    //     pointColor: "#4F52BA",
                    //     pointStrokeColor: "#fff",
                    //     data: [28, 48, 40, 19, 96, 27, 100]
                    // }
                ]

            };
            new Chart(document.getElementById("radar").getContext("2d")).Radar(radarChartData);
        </script>
    </div>
    <!--饼图-->
    <script type="text/javascript">
        (function () {
            var pie3 = echarts.init(document.getElementById("pie3"));
            option = {
                title: {
                    text: '能力占比',
                    x: 'center'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    left: 'left',
                    data: []
                },
                series: [
                    {
                        name: '比例',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: [],
                        itemStyle: {
                            emphasis: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };

            <c:forEach items="${scorebystudentid}" var="s">
                option.legend.data.push("${s.abilitypoint.name_ap}");
                option.series[0].data.push({value: ${s.score_las}, name: "${s.abilitypoint.name_ap}"});
            </c:forEach>
            pie3.setOption(option);
        })();
    </script>
</div>
</body>
</html>