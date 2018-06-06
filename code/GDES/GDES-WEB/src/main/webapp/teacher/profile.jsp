<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    session.setAttribute("basePath", basePath);
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>用户信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../assets/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="../assets/css/jquery.gritter.css"/>
    <link rel="stylesheet" href="../assets/css/bootstrap-editable.css"/>
    <link rel="stylesheet" href="../assets/css/ace.min.css"/>

</head>

<body>
<div class="main-container">
    <div class="page-content">
        <div class="page-header">
            <h1>
                主页
                <small>
                    <i class="icon-double-angle-right"></i>
                    个人信息
                </small>
            </h1>
        </div><!-- /.page-header -->

        <div class="row">
            <div class="col-xs-12">
                <div>
                    <div id="user-profile-1" class="user-profile row">
                        <div class="col-xs-12 col-sm-3 center">
                            <div>
                                <span class="profile-picture">
                                    <img id="avatar" class="editable img-responsive" alt="Alex's Avatar"
                                         src="../assets/img/profile-pic.jpg"/>
                                </span>

                                <div class="space-4"></div>

                                <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                                    <div class="inline position-relative">
                                        <a class="user-title-label dropdown-toggle" data-toggle="dropdown">
                                            <i class="icon-circle light-green middle"></i>
                                            &nbsp;
                                            <span class="white">${teacher.nameT}</span>
                                        </a>

                                    </div>
                                </div>
                            </div>

                            <div class="space-6"></div>

                            <div class="hr hr12 dotted"></div>

                            <div class="clearfix">
                                <div class="grid2">
                                    <span class="bigger-175 blue">${correct.size()}</span>

                                    <br/>
                                    次批改
                                </div>

                                <div class="grid2">
                                    <span class="bigger-175 blue">${notcorrect.size()}</span>

                                    <br/>
                                    待批改
                                </div>
                            </div>

                            <div class="hr hr16 dotted"></div>
                        </div>

                        <div class="col-xs-12 col-sm-9">
                            <div class="center">
												<span class="btn btn-app btn-sm btn-light no-hover">
													<span class="line-height-1 bigger-170 blue"> 1,411 </span>

													<br/>
													<a href="#">
													<span class="line-height-1 smaller-90"> 得分表 </span>
													</a>
												</span>

                                <span class="btn btn-app btn-sm btn-yellow no-hover">
													<span class="line-height-1 bigger-170"> 32 </span>

													<br/>
													<span class="line-height-1 smaller-90"> 评价图 </span>
												</span>

                                <span class="btn btn-app btn-sm btn-pink no-hover">
													<span class="line-height-1 bigger-170"> 4 </span>

													<br/>
													<span class="line-height-1 smaller-90"> Projects </span>
												</span>

                                <span class="btn btn-app btn-sm btn-grey no-hover">
													<span class="line-height-1 bigger-170"> 23 </span>

													<br/>
													<span class="line-height-1 smaller-90"> Reviews </span>
												</span>

                                <span class="btn btn-app btn-sm btn-success no-hover">
													<span class="line-height-1 bigger-170"> 7 </span>

													<br/>
													<span class="line-height-1 smaller-90"> Albums </span>
												</span>

                                <span class="btn btn-app btn-sm btn-primary no-hover">
													<span class="line-height-1 bigger-170"> 55 </span>

													<br/>
													<span class="line-height-1 smaller-90"> Contacts </span>
												</span>
                            </div>

                            <div class="space-12"></div>

                            <div class="profile-user-info profile-user-info-striped">
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 专业</div>

                                    <div class="profile-info-value">
                                        <span class="editable">${major.nameM}</span>
                                    </div>
                                </div>

                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 教师号</div>

                                    <div class="profile-info-value">
                                        <span class="editable">${teacher.idT}</span>
                                    </div>
                                </div>

                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 姓名</div>

                                    <div class="profile-info-value">
                                        <span class="editable">${teacher.nameT}</span>
                                    </div>
                                </div>

                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 性别</div>

                                    <div class="profile-info-value">
                                        <span class="editable">${user.sex}</span>
                                    </div>
                                </div>

                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 专业负责人</div>

                                    <div class="profile-info-value">
                                        <span class="editable">${teacher.majorleaderT}</span>
                                    </div>
                                </div>

                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 课程负责人</div>

                                    <div class="profile-info-value">
                                        <span class="editable">${teacher.courseleaderT}</span>
                                    </div>
                                </div>

                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 宣言</div>

                                    <div class="profile-info-value">
                                        <span class="editable" id="about">明德行远，交通天下！</span>
                                    </div>
                                </div>
                            </div>

                            <div class="space-20"></div>

                            <div class="widget-box transparent">
                                <div class="widget-header widget-header-small">
                                    <h4 class="blue smaller">
                                        <i class="icon-rss orange"></i>
                                        近期动态
                                    </h4>

                                </div>

                                <div class="widget-body">
                                    <div class="widget-main padding-8">
                                        <div id="profile-feed-1" class="profile-feed">
                                            <c:forEach items="${allbyidt}" var="a">
                                                <div class="profile-activity clearfix">
                                                    <div>
                                                        <img class="pull-left" alt="Alex Doe's avatar"
                                                             src="../assets/img/avatar5.png"/>
                                                        <a class="user" href="#"> ${a.student.nameS} </a>
                                                        进行了测评.
                                                        <a href="#">瞧一瞧</a>

                                                        <div class="time">
                                                            <i class="icon-time bigger-110"></i>
                                                            ${a.beginEr}
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="hr hr2 hr-double"></div>
                            <div class="space-6"></div>
                        </div>
                    </div>
                </div>
                <!-- PAGE CONTENT ENDS -->
            </div><!-- /.col -->
        </div><!-- /.row -->
    </div><!-- /.page-content -->
    <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
        <i class="icon-double-angle-up icon-only bigger-110"></i>
    </a>
</div><!-- /.main-container -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>" + "<" + "/script>");
</script>
<script src="../assets/js/bootstrap.min.js"></script>
<script src="../assets/js/jquery.gritter.min.js"></script>
<script src="../assets/js/jquery.slimscroll.min.js"></script>
<script src="../assets/js/bootstrap-wysiwyg.min.js"></script>
<script src="../assets/js/bootstrap-editable.min.js"></script>
<script src="../assets/js/ace-editable.min.js"></script>
<script src="../assets/js/ace-elements.min.js"></script>

<script type="text/javascript">
    if("${flag}"=="norecord") {
        alert("暂无学生测评，无记录！");
    }
    if("${flag}"=="tnoap") {
        alert("暂无学生测评，无记录！");
    }
    if("${flag}"=="tnopost") {
        alert("暂无学生测评，无记录！");
    }
</script>

<script type="text/javascript">
    jQuery(function ($) {

        //editables on first profile page
        $.fn.editable.defaults.mode = 'inline';
        $.fn.editableform.loading = "<div class='editableform-loading'><i class='light-blue icon-2x icon-spinner icon-spin'></i></div>";
        $.fn.editableform.buttons = '<button type="submit" class="btn btn-info editable-submit"><i class="icon-ok icon-white"></i></button>' +
            '<button type="button" class="btn editable-cancel"><i class="icon-remove"></i></button>';

        $('#about').editable({
            mode: 'inline',
            type: 'wysiwyg',
            name: 'about',
            wysiwyg: {
                //css : {'max-width':'300px'}
            },
            success: function (response, newValue) {
            }
        });


        // *** editable avatar *** //
        try {//ie8 throws some harmless exception, so let's catch it

            //it seems that editable plugin calls appendChild, and as Image doesn't have it, it causes errors on IE at unpredicted points
            //so let's have a fake appendChild for it!
            if (/msie\s*(8|7|6)/.test(navigator.userAgent.toLowerCase())) Image.prototype.appendChild = function (el) {
            }

            var last_gritter
            $('#avatar').editable({
                type: 'image',
                name: 'avatar',
                value: null,
                image: {
                    //specify ace file input plugin's options here
                    btn_choose: '点击选择头像',
                    droppable: true,
                    /**
                     //this will override the default before_change that only accepts image files
                     before_change: function(files, dropped) {
								return true;
							},
                     */

                    //and a few extra ones here
                    name: 'avatar',//put the field name here as well, will be used inside the custom plugin
                    max_size: 110000,//头像大小100kb
                    on_error: function (code) {//on_error function will be called when the selected file has a problem
                        if (last_gritter) $.gritter.remove(last_gritter);
                        if (code == 1) {//file format error
                            last_gritter = $.gritter.add({
                                title: '所选文件不是图片！',
                                text: '请选择一张 .jpg|.gif|.png 格式的图片！',
                                class_name: 'gritter-error gritter-center'
                            });
                        } else if (code == 2) {//file size rror
                            last_gritter = $.gritter.add({
                                title: '图片太大！',
                                text: '所选图片不能超过100KB！',
                                class_name: 'gritter-error gritter-center'
                            });
                        }
                        else {//other error
                        }
                    },
                    on_success: function () {
                        $.gritter.removeAll();
                    }
                },
                url: function (params) {

                    var deferred = new $.Deferred

                    var value = $('#avatar').next().find('input[type=hidden]:eq(0)').val();
                    if (!value || value.length == 0) {
                        deferred.resolve();
                        return deferred.promise();
                    }

                    //头像上传
                    setTimeout(function () {
                        if ("FileReader" in window) {
                            //for browsers that have a thumbnail of selected image
                            var thumb = $('#avatar').next().find('img').data('thumb');
                            if (thumb) $('#avatar').get(0).src = thumb;
                        }

                        deferred.resolve({'status': 'OK'});

                        if (last_gritter) $.gritter.remove(last_gritter);
                        last_gritter = $.gritter.add({
                            title: '更新成功！',
                            text: '您的用户头像已经成功更新！',
                            class_name: 'gritter-info gritter-center'
                        });

                    }, parseInt(Math.random() * 800 + 800))

                    return deferred.promise();
                },

                success: function (response, newValue) {
                }
            })
        } catch (e) {
        }

        //近期动态窗口显示
        $('#profile-feed-1').slimScroll({
            height: '250px',
            alwaysVisible: true
        });

    });
</script>

</body>
</html>
