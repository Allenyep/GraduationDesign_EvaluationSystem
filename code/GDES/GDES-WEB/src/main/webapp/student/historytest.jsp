<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2018/5/31
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
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
            主页
            <small>
                <i class="icon-double-angle-right"></i>
                图解
            </small>
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

        <!--折线图-->
        <div class="col-md-6 chrt-page-grids">
            <div id="line" style="width: 100%;height: 50%;"></div>
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
                        <a href="#home" data-toggle="tab">历史试卷</a>
                    </li>
                    <li class="">
                        <a href="#settings" data-toggle="tab">待定</a>
                    </li>
                    <li class="">
                        <a href="#messages" data-toggle="tab">待定</a>
                    </li>

                </ul>


                <div class="tab-content">

                    <div class="tab-pane fade active in" id="home">
                        <div class="row">
                            <table width="100%" class="am-table am-table-compact tpl-table-black ">
                                <thead>
                                <tr>
                                    <th>学号</th>
                                    <th>开始时间</th>
                                    <th>结束时间</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${erlist}" var="er">
                                    <tr class="gradeX">
                                        <td>${er.idS}</td>
                                        <td>${er.beginEr}</td>
                                        <td>${er.endEr}</td>
                                        <td>
                                            <a href="/question/historydetail.do?idEr=${er.idEr}" type="button"
                                               class="btn btn-info">查 看</a>
                                        </td>
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
    </div>
    <script>
        <!--折线图-->
        (function (ec) {
            var myChart = echarts.init(document.getElementById("line"));
            var option = {
                title : {
                    text: '历史测评分数',
                    subtext: '分数图'
                },
                tooltip : {
                    trigger: 'axis'
                },
                legend: {
                    data:['总分','实际得分']
                },
                toolbox: {
                    show : true,
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false},
                        magicType : {show: true, type: ['line', 'bar']},
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : []
                    }
                ],
                yAxis : [
                    {
                        type : 'value',
                        axisLabel : {
                            formatter: '{value}'
                        }
                    }
                ],
                series : [
                    {
                        name:'总分',
                        type:'line',
                        data:[],
                        markLine : {
                            data : [
                                {type : 'average', name: '平均值'}
                            ]
                        }
                    },{
                        name:'实际得分',
                        type:'line',
                        data:[],
                        markLine : {
                            data : [
                                {type : 'average', name: '平均值'}
                            ]
                        }
                    }
                ]
            };
            <c:forEach items="${scoreSum}" var="sss" varStatus="i">
                option.series[0].data.push(${sss});
            </c:forEach>
            <c:forEach items="${scoreSumstudent}" var="ss" varStatus="i">
                option.series[1].data.push(${ss});
            </c:forEach>

            myChart.setOption(option);
        })();
    </script>
    <!--饼图-->
    <script type="text/javascript">
        (function () {
            var pie3 = echarts.init(document.getElementById("pie3"));
            option = {
                title: {
                    text: '试题完成情况',
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
            //返回已完成试题数量和未完成试题数量
            option.legend.data.push("学生完成数目");
            option.legend.data.push("题目总数");
            option.series[0].data.push({value: ${stutestNum}, name: "学生完成数目"});
            option.series[0].data.push({value: ${questionNum}, name: "题目总数"});
            pie3.setOption(option);
        })();
    </script>

</div>
</body>
</html>
