<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <title>我的工作台 - EasySchool</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="robots" content="noindex,nofollow">
    <%@include file="taglib.jsp"%>
    <%@include file="head.jsp"%>
    <%--<script src="assets/js/jquery.min.js"></script>--%>
    <%--<script type="text/javascript" src="resources/script/configBase.js"></script>--%>
    <%--<script type="text/javascript" src="resources/script/exam/exam.js"></script>--%>
</head>

<body>
<!--主体框架开始-->
<div class="pagebox" id="pageContentId">
    <div class="home-desktop" id="desktop_scroll">
        <div style="width:1025px; position: relative;">
            <div class="title">
                <div class="name left">教师出题</div>
                <div class="function left">
                    <!--[&nbsp;<a href="javascript:;" onclick="definedLayer('/addTeacherData.html',{},'html');">添加</a>&nbsp;]-->
                </div>
                <div class="clear"></div>
            </div>
            <div class="condition-box conditionItems" style="width:985px;">
                <div class="condition-items">
                    <span class="condition-title">专业：</span>
                    <select>
                        <option>计算机科学与技术</option>
                        <option>通信工程</option>
                        <option>物联网工程</option>
                    </select>
                </div>
                <div class="condition-items">
                    <span class="condition-title">课程：</span>
                    <select>
                        <option>数据结构</option>
                        <option>C语言程序设计</option>
                        <option>离散数学</option>
                        <option>操作系统</option>
                    </select>
                </div>
                <!-- <div class="condition-items">
                    <span class="condition-title">方面：</span>
                    <select id="fangmian">
                        <option>请选择</option>
                        <option>模型ML</option>
                        <option>算法AL</option>
                        <option>应用程序AP</option>
                        <option>计算机程序设计BP</option>
                        <option>通过集成开发系统ID</option>
                        <option>硬件与设备HW</option>
                    </select>
                </div>
                <div class="condition-items">
                    <span class="condition-title">能力点：</span>
                    <select id="nengli">
                        <option>请选择</option>
                        <option>问题的符号表示</option>
                        <option>问题求解过程的符号表示</option>
                        <option>逻辑思维</option>
                        <option>抽象思维</option>
                    </select>
                </div> -->
                <div class="clear"></div>
            </div>
            <div class="create-questions-content">
                <div class="exam-nav">
                    <div class="exam-item">
                        <h4 class="exam-item-title">常用题型<i class="icon-expand"></i></h4>
                        <ul class="exam-nav-list" id="ui_sortable_exam">
                            <li data-uid="1" data-tempId="drag_choice">
                                <a href="javascript:;" data-checkType="1"><i class="icon-singleChoice"></i>单选题</a>
                            </li>
                            <li data-uid="2" data-tempId="drag_choice">
                                <a href="javascript:;" data-checkType="2"><i class="icon-multipleChoice"></i>多选题</a>
                            </li>
                            <!-- <li data-uid="3" data-tempId="drag_choice">
                                <a href="javascript:;" data-checkType="1"><i class="icon-picChoice"></i>图片单选</a>
                            </li> -->
                            <!-- <li data-uid="4" data-tempId="drag_choice">
                                <a href="javascript:;" data-checkType="2"><i class="icon-picsChoice"></i>图片多选</a>
                            </li> -->
                            <li data-uid="5" data-tempId="drag_completion">
                                <a href="javascript:;" data-checkType="1"><i class="icon-gapFilling"></i>单行填空</a>
                            </li>
                            <!-- <li data-uid="6" data-tempId="drag_completion">
                                <a href="javascript:;" data-checkType="2"><i class="icon-multiRow"></i>多行填空</a>
                            </li> -->
                            <li data-uid="7" data-tempId="drag_describe">
                                <a href="javascript:;"><i class="icon-describe"></i>主观题</a>
                            </li>
                        </ul>
                        <div class="exam-item">
                            <h4 class="exam-item-title">知识点设置<i class="icon-expand"></i></h4>
                            <ul class="exam-nav-list" id="ui_sortable_exam">
                                <li data-uid="2" data-tempId="zhishidian">
                                    <a href="javascript:;" data-checkType="2"><i class="icon-multiRow"></i>添加知识点</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!--出题-->
                <div class="create-questions">
                    <div class="questions-head-title">
                        <h4 class="h4-bg T_edit T-center" data-Tid="10001" id="questionTitle"><span
                                style="font-size:18px;">点击此处修改试题名称</span></h4></div>
                    <table class="questions-items-title">
                        <tbody>
                        <tr>
                            <td class="module-menu">&nbsp;</td>
                            <td>
                                <div class="cq-title T_edit" data-Tid="10002" id="questionExamTitle"><span
                                        style="font-size:16px;">点击此处添加题目备注</span></div>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                    <ul class="ui-questions-content-list"></ul>
                    <ul class="ui-foot-all-list"></ul>
                </div>
            </div>
            <div style="height:40px; margin: 20px 0; text-align: right;">
                <button type="button" class="cotrlBtn exam-save-btn btnBlue" id="saveQuestion"
                        style="height:40px;width: 140px; font-size:18px;">保存试题
                </button>
            </div>
        </div>
    </div>

    <!--选择题-->
    <script type="text/html" id="drag_choice">
        <li class="ui-module items-questions">
            <div class="theme-type">
                <div class="module-menu">
                    <h4></h4>
                    <div class="module-ctrl">
                        <a href="javascript:void(0);" class="ui-up-btn" data-tisp="上移"><i class="icon-up"></i></a>
                        <a href="javascript:void(0);" class="ui-down-btn" data-tisp="下移"><i class="icon-down"></i></a>
                        <a href="javascript:void(0);" class="ui-clone-btn" data-tisp="复制"><i class="icon-clone"></i></a>
                        <a href="javascript:void(0);" class="ui-del-btn" data-tisp="删除"><i class="icon-del"></i></a>
                    </div>
                </div>
                <div class="ui-drag-area">
                    <div class="cq-title T_edit T_plugins" data-Tid="{{itmetid}}"><span style="font-size:16px;">{{if type==1}}单选题-题目填写{{else if type==2}}多选题-题目填写{{/if}}</span>
                    </div>
                </div>
                <div class="cq-items-content">
                    <ul class="cq-unset-list" data-checkType="{{type}}" data-nameStr="{{name}}">
                        {{each items as itemData i}}
                        <li><label class="input-check"><input
                                type="{{if type==1}}radio{{else if type==2}}checkbox{{/if}}" name="{{name}}"
                                value="{{itemData.value}}"></label>
                            <div class="cq-answer-content T_edit T_plugins" data-Tid="{{itemData.tid}}">选项{{i+1}}</div>
                        </li>
                        {{/each}}
                    </ul>
                    <div class="cq-items-ctrl">
                        <a href="javascript:void(0);" class="ui-add-item-btn" data-tisp="添加"><i
                                class="icon-add"></i></a>
                        <a href="javascript:void(0);" class="ui-batch-item-btn" data-tisp="批量添加"><i
                                class="icon-addList"></i></a>
                        <a href="javascript:void(0);" class="ui-add-answer-btn" data-tisp="添加答案解析"><i
                                class="icon-assignment"></i></a>
                    </div>
                </div>
            </div>
        </li>
    </script>
    <!--填空题-->
    <script type="text/html" id="drag_completion">
        <li class="ui-module items-questions">
            <div class="theme-type">
                <div class="module-menu">
                    <h4></h4>
                    <div class="module-ctrl">
                        <a href="javascript:void(0);" class="ui-up-btn" data-tisp="上移"><i class="icon-up"></i></a>
                        <a href="javascript:void(0);" class="ui-down-btn" data-tisp="下移"><i class="icon-down"></i></a>
                        <a href="javascript:void(0);" class="ui-clone-btn" data-tisp="复制"><i class="icon-clone"></i></a>
                        <a href="javascript:void(0);" class="ui-del-btn" data-tisp="删除"><i class="icon-del"></i></a>
                    </div>
                </div>
                <div class="ui-drag-area">
                    <div class="cq-title T_edit T_plugins" data-Tid="{{itmetid}}"><span style="font-size:16px;">{{if type==1}}填空题-题目填写{{else if type==2}}填空题目标题{{/if}}</span>
                    </div>
                </div>
                <div class="cq-items-content">
                    <div class="describe-edit-content T_edit T_plugins" data-tid="{{items[0].tid}}"><span
                            style="line-height: 1.6;12px;">这里是{{if type==1}}填空题-答案填写{{else if type==2}}完形填空题目标题{{/if}}</span>
                    </div>
                    <div class="cq-items-ctrl">
                        <a href="javascript:void(0);" class="ui-add-item-btn" data-tisp="添加"><i
                                class="icon-add"></i></a>
                        <a href="javascript:void(0);" class="ui-batch-item-btn" data-tisp="批量添加"><i
                                class="icon-addList"></i></a>
                        <a href="javascript:void(0);" class="ui-add-answer-btn" data-tisp="添加答案解析"><i
                                class="icon-assignment"></i></a>
                    </div>
                </div>
            </div>
        </li>
    </script>
    <!--描述题-->
    <script type="text/html" id="drag_describe">
        <li class="ui-module items-questions">
            <div class="theme-type">
                <div class="module-menu">
                    <h4></h4>
                    <div class="module-ctrl">
                        <a href="javascript:void(0);" class="ui-up-btn" data-tisp="上移"><i class="icon-up"></i></a>
                        <a href="javascript:void(0);" class="ui-down-btn" data-tisp="下移"><i class="icon-down"></i></a>
                        <a href="javascript:void(0);" class="ui-clone-btn" data-tisp="复制"><i class="icon-clone"></i></a>
                        <a href="javascript:void(0);" class="ui-del-btn" data-tisp="删除"><i class="icon-del"></i></a>
                    </div>
                </div>
                <div class="ui-drag-area">
                    <div class="cq-title T_edit T_plugins" data-Tid="{{itmetid}}"><span
                            style="font-size:16px;">主观题-题目填写</span></div>
                </div>
                <div class="cq-items-content">
                    <div class="describe-edit-content T_edit T_plugins" data-tid="{{items[0].tid}}"><span
                            style="line-height: 1.6;12px;">主观题-答案填写</span></div>
                </div>
            </div>
        </li>
    </script>
    <!--知识点-->
    <script type="text/html" id="zhishidian">
        <li class="ui-module items-questions">
            <div class="theme-type">
                <div class="ui-drag-area">
                    <div class="zhishidian T_edit T_plugins" data-Tid="{{itmetid}}"><span style="font-size:16px;">添加知识点</span></div>
                </div>
                <div class="cq-items-content">
                    <ul class="zhishidianList" data-checkType="{{type}}" data-nameStr="{{name}}">
                        {{each items as itemData i}}
                        <li><label class="input-check"><input
                                type="{{if type==1}}radio{{else if type==2}}checkbox{{/if}}" name="{{name}}"
                                value="{{itemData.value}}"></label>
                            <div class="cq-answer-content T_edit T_plugins" data-Tid="{{itemData.tid}}">选项{{i+1}}</div>
                        </li>
                        {{/each}}
                    </ul>
                    <!--<div class="cq-items-ctrl">-->
                        <!--<a href="javascript:void(0);" class="ui-add-item-btn" data-tisp="添加"><i-->
                                <!--class="icon-add"></i></a>-->
                    <!--</div>-->
                </div>
            </div>
        </li>
    </script>

    <script type="text/html" id="drag_T_edit">
        <div class="cq-into-edit">
            <div class="add-edit cq-edit-title" contenteditable="true">{{title}}</div>
        </div>
    </script>
    <script type="text/html" id="T_edit_plugins">
        <div class="edit-plug-box">
            <a href="javascript:void(0);"><i class="icon-picChoice"></i></a>
            <a href="javascript:void(0);"><i class="icon-title"></i></a>
        </div>
    </script>
    <script type="text/html" id="ui_additem_content">
        {{each items as itemData i}}
        <li><label class="input-check"><input type="{{if type==1}}radio{{else if type==2}}checkbox{{/if}}"
                                              name="{{name}}" value="{{itemData.value}}"></label>
            <div class="cq-answer-content T_edit T_plugins" data-Tid="{{itemData.tid}}">选项{{i+1+index}}</div>
        </li>
        {{/each}}
    </script>
    <script type="text/html" id="analysis_tmp">
        <textarea class="exam-textarea analysis_contx" placeholder="请在此填写答案解析"></textarea>
    </script>
    <script type="text/javascript">
        $(function () {
            exam.init();
            $("select").dcselect();
            $('#saveQuestion').on('click', function () {
                var dataBase = {}, questionItems = [],zhishidian=[];
                dataBase.questionTitle = $('#questionTitle').text();
                dataBase.questionExamTitle = $('#questionExamTitle').text();
                //封装所有题列表，遍历提取值analysis（答案）、题列表（数组对象）；
                $('.ui-questions-content-list').children('li').each(function (i) {
                    var dataTx = {}, qListItems = [];
                    dataTx.QItemsTitle = $(this).find('.cq-title').text();
                    //封装单题，遍历提取值name、value、checkCurr（选中状态）；
                    $(this).find('ul.cq-unset-list').children('li').each(function (j) {
                        var listItems = {};
                        listItems.name = $(this).find('input').attr('name');
                        listItems.value = $(this).find('input').val();
                        listItems.checkCurr = $(this).find('input').prop('checked');
                        qListItems.push(listItems)
                    });
                    dataTx.analysis = $(this).find('.analysis_contx').val() || 0;
                    dataTx.describrContent = $(this).find('.describe-edit-content').text();
                    dataTx.qListItems = qListItems;
                    questionItems.push(dataTx);
                    questionItems.forEach(function (i, index) {
                        if(i.qListItems!=null) {
                            if (i.qListItems.length != 0) {
                                i.qClass = 1;
                            } else {
                                i.qClass = 0;
                            }
                        }
                    });
                    $(this).find('ul.zhishidianList').children('li').each(function (j) {
                        var listItems = {};
                        listItems.name = $(this).find('input').attr('name');
                        listItems.value = $(this).find('input').val();
                        listItems.checkCurr = $(this).find('input').prop('checked');
                        zhishidian.push(listItems);
                    });

                });
                dataBase.zhishidian=zhishidian;
                dataBase.questionItems = questionItems;
                console.log(JSON.stringify(dataBase));
                alert(dataBase);
                //将dataBase发送到数据库存储
            });
        });
    </script>
    <script type="text/javascript">
        var nengliData = [
            ['问题的符号表示', '问题求解过程的符号表示', '逻辑思维'],
            ['简单算法设计', '复杂算法设计', '简单算法分析', '复杂算法分析'],
            ['设计应用程序', '实现应用程序', '配置应用程序'],
            ['小型程序设计', '大型程序设计'],
            ['管理组织一个网站', '配置和继承电子商务软件'],
            ['设计数字电路', '实现数字电路']
        ];
        var nengli = $('#nengli');
        $('#fangmian').change(function () {
            nengli.empty();
            // $('#nengli').append("<option>请选择能力</option>");
            $("<option value=''>请选择能力</option>").appendTo(nengli);

            var checkedIndex = $('#fangmian').get(0).selectedIndex;
            // alert(checkedIndex);
            console.log(checkedIndex);
            var positionGrade = nengliData[checkedIndex - 1];
            for (var i = 0; i < positionGrade.length; i++) {
                opt = "<option>" + positionGrade[i] + "</option>";
                console.log(opt);
                nengli.append(opt);
            }

        });
    </script>

</div>
<!--主体框架结束-->
</body>

</html>