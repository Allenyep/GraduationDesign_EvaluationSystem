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
    <title>能力概况</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="../assets/css/style.css"/>
    <link rel="stylesheet" href="../assets/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="../assets/css/custom.css">
    <link rel="stylesheet" href="../assets/css/amazeui.css"/>
    <link rel="stylesheet" href="../assets/css/ace.min.css"/>
    <script type="text/javascript" src="../assets/css/app.css"></script>
    <script type="text/javascript" src="../assets/js/Chart.js"></script>
    <script type="text/javascript" src="../assets/js/echarts.min.js"></script>
    <script type="text/javascript" src="../assets/js/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="../assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../assets/js/jquery.min.js"></script>

</head>
<body>
<script type="text/javascript" src="../assets/js/theme.js"></script>
<div class="page-content">
    <div class="page-header">
        <h1>
            <a>首页</a>
            <small>
                <i class="icon-double-angle-right"></i>
                <a href="javascript:history.back(-1)">学生能力查看</a>
                <i class="icon-double-angle-right"></i>
                能力图
            </small>
            <label class="text-center" style="margin-left: 10%">专业：${student.major.nameM}；学号：${student.idS}；姓名：${student.nameS}</label>
        </h1>
    </div>
    <div>
        <!--饼状图-->
        <div class="am-u-md-6 chrt-page-grids">
            <!-- Step Line -->
            <div class="card-box">
                <div id="pie3" style="width: 100%;height: 50%;"></div>
            </div>
        </div>

        <!--雷达图-->
        <div class="col-md-6 chrt-page-grids">
            <h4 class="title">职位推荐</h4>
            <div class="radar-grid">
                <canvas id="radar" style="width: 50%;height: 23%;"></canvas>
            </div>
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
                        <a href="#home" data-toggle="tab">能力波动</a>
                    </li>
                    <li class="">
                        <a href="#profile" data-toggle="tab">得分详情</a>
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
                        <!--折线图-->
                        <div id="Stack" style="width: 100%; height: 350px;"></div>
                    </div>
                    <div class="tab-pane fade" id="profile">
                        <div class="row">
                            <table width="100%" class="am-table am-table-compact tpl-table-black ">
                                <thead>
                                <tr>
                                    <th>能力点编号</th>
                                    <th>能力点名称</th>
                                    <th>得分</th>
                                    <th>时间</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${scorel}" var="d">
                                <tr class="gradeX">
                                    <td>${d.idAp}</td>
                                    <td>${d.abilitypoint.nameAp}</td>
                                    <td>${d.scoreSd}</td>
                                    <td>${d.timeSd}</td>
                                </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
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
                labels: [],
                datasets: [
                    {
                        fillColor: "rgba(239, 85, 58, 0.87)",
                        strokeColor: "#e94e02",
                        pointColor: "#e94e02",
                        pointStrokeColor: "#fff",
                        data: []
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
            <c:forEach items="${scorez}" var="sp">
                radarChartData.labels.push("${sp.post.nameP}");
                radarChartData.datasets[0].data.push(${sp.scoreSp});
            </c:forEach>
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
                        name: '得分（比例）',
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
            <c:forEach items="${scorep}" var="s">
            option.legend.data.push("${s.abilitypoint.nameAp}");
            option.series[0].data.push({value: ${s.scoreLas}, name: "${s.abilitypoint.nameAp}"});
            </c:forEach>
            pie3.setOption(option);
        })();
    </script>
    <script type="text/javascript">
        //折线图堆叠
        (function () {

            var myChart = echarts.init(document.getElementById("Stack"));

            option = {
                title: {
                    text: '能力波动图'
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: []
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                toolbox: {
                    feature: {
                        saveAsImage: {}
                    }
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: []
                },
                yAxis: {
                    type: 'value'
                },
                series: []
            };
            <c:forEach items="${scorep}" var="sd">
            option.legend.data.push("${sd.abilitypoint.nameAp}");
            var parm = {
                name: '${sd.abilitypoint.nameAp}',
                type: 'line',
                stack: '总量',
                data: []
            };
            option.series.push(parm);
            </c:forEach>
            <c:forEach items="${scorel}" var="dl">
            var i = option.legend.data.indexOf("${dl.abilitypoint.nameAp}");
            option.series[i].data.push(${dl.scoreSd});
            </c:forEach>
            myChart.setOption(option);
        })();
    </script>
</div>
</body>
</html>