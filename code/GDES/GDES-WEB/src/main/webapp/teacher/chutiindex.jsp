<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    session.setAttribute("basePath", basePath);
%>
<html>
<head>
    <meta charset="utf-8">
    <title>教师出题</title>


    <link rel="stylesheet" type="text/css" href="../assets/css/wenjuan_ht.css">

    <script src="../assets/js/chutijquery.min.js"></script>
    <script src="../assets/js/index.js"></script>


</head>
<body>

<div class=" all_660">
    <div class="yd_box"></div>
    <div class="but" style="padding-top: 20px">
        <select id="addquerstions" class="addquerstions " name="">
            <option value="-1">添加问题</option>
            <option value="0">单选题</option>
            <option value="1">多选题</option>
            <option value="2">填空题</option>
            <option value="2">主观题</option>
        </select>
        <%--<button class="btn" onclick="addquestion()">提交问题</button>--%>
    </div>
    <!--选项卡区域  模板区域---------------------------------------------------------------------------------------------------------------------------------------->
    <div class="xxk_box">
        <div class="xxk_conn hide">
            <!--单选----------------------------------------------------------------------------------------------------------------------------------------->
            <div class="xxk_xzqh_box dxuan ">
                <form action="/teacher/addshiti2.do" id="danxuanform" method="post">
                <textarea name="contextQ" cols="" rows="" class="input_wenbk btwen_text btwen_text_dx"
                          placeholder="单选题目"></textarea>
                    <div class="title_itram">
                        <div class="kzjxx_iteam">
                            <input name="istrueO1" type="radio" value="" class="dxk">
                            <input name="nameO" type="text" class="input_wenbk" value="" placeholder="选项1">

                        </div>
                        <div class="kzjxx_iteam">
                            <input name="istrueO2" type="radio" value="" class="dxk">
                            <input name="nameO" type="text" class="input_wenbk" value="" placeholder="选项2">

                        </div>
                        <div class="kzjxx_iteam">
                            <input name="istrueO3" type="radio" value="" class="dxk">
                            <input name="nameO" type="text" class="input_wenbk" value="" placeholder="选项3">
                        </div>
                        <div class="kzjxx_iteam">
                            <input name="istrueO4" type="radio" value="" class="dxk">
                            <input name="nameO" type="text" class="input_wenbk" value="" placeholder="选项4">
                        </div>
                        <div class="kzjxx_iteam">
                            <label class="dxk">&nbsp;分</label>
                            <input name="scoreQ" type="text" class="input_wenbk" value="0" placeholder="分数">
                        </div>
                        <div class="kzjxx_iteam">
                            <label class="dxk">&nbsp;答案</label>
                            <input name="answerQ" type="text" class="input_wenbk" value="0" placeholder="答案">
                        </div>
                    </div>
                    <%--<a href="javascript:void(0)" class="zjxx">增加选项</a> --%>
                    <!--完成编辑-->
                    <div class="bjqxwc_box">
                        <a href="javascript:void(0);" class="qxbj_but">取消编辑</a>
                        <a href="javascript:$('#danxuanform').submit()" class="swcbj_but">完成编辑</a>
                    </div>
                </form>
            </div>
            <!--多选----------------------------------------------------------------------------------------------------------------------------------------->
            <div class="xxk_xzqh_box duoxuan hide">
                <form action="/teacher/addshiti2.do" method="post" id="duoxuanform">
                <textarea name="" cols="" rows="" class="input_wenbk btwen_text btwen_text_duox"
                          placeholder="多选题目"></textarea>
                    <div class="title_itram">
                        <div class="kzjxx_iteam">
                            <input name="istrueO1" type="checkbox" value="" class="dxk">
                            <input name="nameO" type="text" class="input_wenbk" value="选项" placeholder="选项">

                        </div>
                        <div class="kzjxx_iteam">
                            <input name="istrueO2" type="checkbox" value="" class="dxk">
                            <input name="nameO" type="text" class="input_wenbk" value="选项" placeholder="选项">

                        </div>
                        <div class="kzjxx_iteam">
                            <input name="istrueO3" type="checkbox" value="" class="dxk">
                            <input name="nameO" type="text" class="input_wenbk" value="选项" placeholder="选项">

                        </div>
                        <div class="kzjxx_iteam">
                            <input name="istrueO4" type="checkbox" value="" class="dxk">
                            <input name="nameO" type="text" class="input_wenbk" value="选项" placeholder="选项">
                        </div>
                        <div class="kzjxx_iteam">
                            <label class="dxk">&nbsp;分</label>
                            <input name="scoreQ" type="text" class="input_wenbk" value="0" placeholder="分数">
                        </div>
                    </div>
                    <!--完成编辑-->
                    <div class="bjqxwc_box">
                        <a href="javascript:void(0);" class="qxbj_but">取消编辑</a>
                        <a href="javascript:$('#duoxuanform').submit()" class="swcbj_but">完成编辑</a>
                    </div>
                </form>
            </div>
            <!-- 填空----------------------------------------------------------------------------------------------------------------------------------------->
            <div class="xxk_xzqh_box tktm hide">
                <form action="/teacher/addshiti1.do" id="tiankongform" method="post">
                    <textarea name="contextQ" cols="" rows="" class="input_wenbk btwen_text btwen_text_tk" value="题目填写"
                              placeholder="题目填写"></textarea>
                    <textarea name="answerQ" cols="" rows="" class="input_wenbk btwen_text btwen_text_tk" value="答案填写"
                              placeholder="答案填写"></textarea>
                    <div class="kzjxx_iteam">
                        <label class="dxk">&nbsp;分</label>
                        <input name="scoreQ" type="text" class="input_wenbk" value="0" placeholder="分数">
                    </div>
                    <!--完成编辑-->
                    <div class="bjqxwc_box">
                        <a href="javascript:void(0);" class="qxbj_but">取消编辑</a>
                        <a href="javascript:$('#tiankongform').submit()" class="swcbj_but">完成编辑</a>
                    </div>
                </form>
            </div>
            <!-- 矩阵----------------------------------------------------------------------------------------------------------------------------------------->
            <div class="xxk_xzqh_box  hide">
                <div class="line_dl"></div>
                <div class="jztm">
                    <textarea name="" cols="" rows="" class="input_wenbk btwen_text" placeholder="题目"></textarea>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tbody>
                        <tr valign="top">
                            <td width="135">
                                <h4 class="ritwenz_xx">左标题</h4>
                                <textarea name="" cols="" rows="" class="leftbtwen_text"
                                          placeholder="例子：CCTV1，CCTV2，CCTV3"></textarea>
                            </td>
                            <td>
                                <h4 class="ritwenz_xx  ">
                                    右侧选项文字 <input type="radio" name="xz" value="0"
                                                  checked="checked" class="xzqk">单选<input
                                        type="radio" value="1" name="xz" class="xzqk">多选
                                </h4>
                                <div class="title_itram">
                                    <div class="kzjxx_iteam">
                                        <input name="" type="text" class="input_wenbk jzwent_input" value="选项"
                                               onBlur="if(!this.value)this.value='选项'"
                                               onClick="if(this.value&amp;&amp;this.value=='选项' )  this.value=''">
                                        <label>
                                            <input name="" type="checkbox" value="" class="fxk">
                                            <span>可填空</span></label> <a href="javascript:void(0);" class="del_xm">删除</a>
                                    </div>
                                    <div class="kzjxx_iteam">
                                        <input name="" type="text" class="input_wenbk jzwent_input" value="选项"
                                               onBlur="if(!this.value)this.value='选项'"
                                               onClick="if(this.value&amp;&amp;this.value=='选项' )  this.value=''">
                                        <label>
                                            <input name="" type="checkbox" value="" class="fxk">
                                            <span>可填空</span></label> <a href="javascript:void(0);" class="del_xm">删除</a>
                                    </div>
                                    <div class="kzjxx_iteam">
                                        <input name="" type="text" class="input_wenbk jzwent_input" value="选项"
                                               onBlur="if(!this.value)this.value='选项'"
                                               onClick="if(this.value&amp;&amp;this.value=='选项' )  this.value=''">
                                        <label>
                                            <input name="" type="checkbox" value="" class="fxk">
                                            <span>可填空</span></label> <a href="javascript:void(0);" class="del_xm">删除</a>
                                    </div>
                                </div>
                                <a href="javascript:void(0)" class="zjxx" style="margin-left: 0;">增加选项</a>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                    <!--完成编辑-->
                    <div class="bjqxwc_box">
                        <a href="javascript:void(0);" class="qxbj_but">取消编辑</a> <a href="javascript:void(0);"
                                                                                   class="swcbj_but"> 完成编辑</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</div>
<script type="text/javascript">
    function addquestion() {
        setTimeout(function () {
            alert("添加成功");
        }, 3000);
    }
</script>
</body>
</html>