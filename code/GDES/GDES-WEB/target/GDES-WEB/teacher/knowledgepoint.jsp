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
<div class="">



    <!-- 内容区域 -->
    <div class="">
        <div class="row-content am-cf">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <div class="widget-head am-cf">
                            <div class="widget-title  am-cf">知识点列表  ${message}</div>


                        </div>
                        <div class="widget-body  am-fr">

                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                <div class="am-form-group">
                                    <div class="am-btn-toolbar">
                                        <div class="am-btn-group am-btn-group-xs">
                                            <button type="button" class="am-btn am-btn-default am-btn-success"
                                                    data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0, width: 400, height: 400}">
                                                <span class="am-icon-plus"></span> 新增
                                            </button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary"><span
                                                    class="am-icon-save"></span> 保存
                                            </button>
                                            <button type="button" class="am-btn am-btn-default am-btn-warning"><span
                                                    class="am-icon-archive"></span> 审核
                                            </button>
                                            <button type="button" class="am-btn am-btn-default am-btn-danger"><span
                                                    class="am-icon-trash-o"></span> 删除
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
                                <div class="am-form-group tpl-table-list-select">
                                    <select data-am-selected="{btnSize: 'sm'}">
                                        <option value="">所有类别</option>
                                        <option value="option2">数据结构</option>
                                    </select>
                                </div>
                            </div>
                            <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                <div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
                                    <input type="text" class="am-form-field ">
                                    <span class="am-input-group-btn">
            <button class="am-btn  am-btn-default am-btn-success tpl-table-list-field am-icon-search"
                    type="button"></button>
          </span>
                                </div>
                            </div>

                            <div class="am-u-sm-12">
                                <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black "
                                       id="example-r">
                                    <thead>
                                    <tr>
                                        <th>知识点名称</th>
                                        <th>知识点占比</th>
                                        <th>备注</th>
                                        <th>课程名称</th>
                                    </tr>
                                    </thead>
                                    <tbody id="tablelist">
                                    <%--<tr class="gradeX">--%>
                                        <%--<td>顺序表</td>--%>
                                        <%--<td>0.1</td>--%>
                                        <%--<td>testhard</td>--%>
                                        <%--<td>--%>
                                            <%--<div class="tpl-table-black-operation">--%>
                                                <%--<a href="javascript:;"--%>
                                                   <%--id="updatekonwA">--%>
                                                    <%--<i class="am-icon-pencil"></i> 编辑--%>
                                                <%--</a>--%>
                                                <%--<a href="javascript:;" class="tpl-table-black-operation-del"--%>
                                                   <%--data-am-modal="{target: '#my-confirm', closeViaDimmer: 0}">--%>
                                                    <%--<i class="am-icon-trash"></i> 删除--%>
                                                <%--</a>--%>
                                            <%--</div>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                    <c:forEach items="${konwlist}" var="a" varStatus="i">
                                        <tr>
                                            <td>${a.nameKp}</td>
                                            <td>${a.proportionKp}</td>
                                            <td>${a.noteKp}</td>
                                            <td>
                                                <div class="tpl-table-black-operation">
                                                    <a href="javascript:;" onclick="updatedata(${i.index},${a.idKp})"
                                                       id="updateKp">
                                                        <i class="am-icon-pencil"></i> 编辑
                                                    </a>
                                                    <a href="javascript:;" onclick="if(confirm('确定删除?')==true)
                                                        location.href='/teacher/delKonwledgepoint.do?idKp=${a.idKp}'"
                                                       class="tpl-table-black-operation-del">
                                                        <i class="am-icon-trash"></i> 删除
                                                    </a>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    <!-- more data -->
                                    </tbody>
                                </table>
                            </div>
                            <div class="am-u-lg-12 am-cf">

                                <div class="am-fr">
                                    <ul class="am-pagination tpl-pagination">
                                        <li class="am-disabled"><a href="#">«</a></li>
                                        <li class="am-active"><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li><a href="#">»</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

<!-- 添加知识点 -->
<div class="am-modal am-modal-no-btn" tabindex="-1" id="doc-modal-1">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">添加知识点
            <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
        </div>
        <form class="am-form" method="post" action="/teacher/addkonwpoint.do">
            <fieldset>
                <div class="am-form-group">
                    <label for="nameKp">知识点名称</label>
                    <input type="text" class="" id="nameKp" name="nameKp" placeholder="输入知识点名称">
                </div>

                <div class="am-form-group">
                    <label for="proportionKp">知识点占比</label>
                    <input type="text" class="" id="proportionKp" name="proportionKp" placeholder="占比0.1到1之间">
                </div>
                <div class="am-form-group">
                    <label for="doc-select-1">课程名称</label>
                    <select id="doc-select-1" name="idC">
                        <option value="2">数据结构</option>
                        <option value="3">计算机网络</option>
                        <option value="7">数据库原理</option>
                    </select>
                    <span class="am-form-caret"></span>
                </div>

                <p>
                    <button type="submit" class="am-btn am-btn-default">提交</button>
                </p>
            </fieldset>
        </form>
    </div>
</div>

<!-- 修改知识点 -->
<div class="am-modal am-modal-no-btn" tabindex="-1" id="doc-modal-2">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">修改知识点
            <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
        </div>
        <form class="am-form" action="/teacher/updateKnowledgepoint.do" method="post">
            <fieldset>
                <div class="am-form-group">
                    <label for="nameKp2">知识点名称</label>
                    <input type="text" class="" name="nameKp" id="nameKp2" placeholder="输入知识点名称">
                </div>

                <input type="hidden" id="idKp" name="idKp">

                <div class="am-form-group">
                    <label for="proportionKp2">知识点占比</label>
                    <input type="text" class="" name="proportionKp" id="proportionKp2" placeholder="占比0.1到1之间">
                </div>
                <p>
                    <button type="submit" class="am-btn am-btn-default">提交</button>
                </p>
            </fieldset>
        </form>
    </div>
</div>

<!-- 删除模态框 -->
<div class="am-modal am-modal-confirm" tabindex="-1" id="my-confirm">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">提 示</div>
        <div class="am-modal-bd">
            你，确定要删除这条记录吗？
        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn" data-am-modal-cancel>取消</span>
            <span class="am-modal-btn" id="confirm-del" data-am-modal-confirm>确定</span>
        </div>
    </div>
</div>
<!-- 删除提示 -->
<script type="text/javascript">
    $('#confirm-del').on('click', function () {
        alert("delete");
    });

    function updatedata(row,idKp){
        var tdArr=$('#tablelist').children("tr").eq(row);
        var konwname=tdArr.find("td").eq(0).text();
        var proportion=tdArr.find("td").eq(1).text();
        console.log(konwname);
        console.log(proportion);

        $('#doc-modal-2').modal();
        $('#nameKp2').val(konwname);
        $('#proportionKp2').val(proportion);
        $('#idKp').val(idKp);


    }
</script>

<script src="../assets/js/amazeui.min.js"></script>
<script src="../assets/js/amazeui.datatables.min.js"></script>
<script src="../assets/js/dataTables.responsive.min.js"></script>
<script src="../assets/js/app.js"></script>

</body>

</html>