<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2018/5/19
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>练习测评</title>

    <link rel="stylesheet" href="../assets/css/bootstrap.css">
    <style type="text/css">
        .testCon {
            padding: 5px 15px;
        }

        h4.tesTitle {
            color: #00B895;
        }

        .test-form-box {
            max-height: 660px;
            overflow: auto;
        }

        .assignment {
            margin: 30px 0 60px;
            text-align: center;
        }

        .assignment .btn {
            background: #00B895;
            width: 120px;
            font-size: 18px;
            border-color: #00B895;
        }

        #testForm .testCon:nth-child(odd) {
            background: #eee;
        }

        label {
            font-weight: normal;
        }

        .jxz-title {
            text-align: justify;
        }

        .topic-answer {
            display: none;
        }
    </style>

</head>
<body>

<div class="container">
    <div class="row clearfix" id="testArea">
        <div class="page-header">
            <h3 class="text-center">正式测评</h3>
        </div>
        <form method="post" action="/question/examlianxiupload.do">
            <div style="float: right">
                <label>Time:<input type="text" id="timelabel" value="0" disabled></label>
            </div>
            <input type="hidden" value="${stu}" name="idS">
            <input type="hidden" value="${tea.get(0).idT}" name="idT">
            <c:forEach items="${examlist}" var="que" varStatus="i">
                <div class="testCon">
                        <%--<input type="hidden" value="${que.answerQ}">--%>
                    <input type="hidden" name="idQ" value="${que.idQ}">
                    <h4 class="jxz-title">第${i.index+1}题 ${que.contextQ} (分值${que.scoreQ})</h4>
                    <c:choose>
                        <c:when test="${que.styleQ=='1'}">
                            <c:forEach items="${que.questionsO}" var="op">
                                <div class="am-u-lg-6">
                                    <div class="jxz-option">
                                        <input type="radio" id="istrueO" name="istrueO">
                                        <input type="text" id="contextO" class="am-form-field"
                                               value="${op.contextO}">
                                        <input type="hidden" value="${op.idO}" name="idO">
                                    </div>
                                </div>
                            </c:forEach>
                            <input type="hidden" name="answerHtp" value="A">
                        </c:when>
                        <c:when test="${que.styleQ=='3'}">
                            <div class="am-u-lg-6">
                                <div class="jxz-option">
                                    <input type="radio" id="istrue" name="panduan" >对
                                    <input type="radio" id="isfalse" name="panduan" >错
                                    <input type="hidden" value="错" name="answerHtp">
                                </div>
                            </div>
                        </c:when>
                        <c:otherwise>
                        <textarea name="answerHtp" class="form-control" style="width: 50%" rows="5"
                                  placeholder="在此填写回答">
                        </textarea>
                        </c:otherwise>
                    </c:choose>

                </div>
            </c:forEach>
            <div class="form-group assignment">
                <button type="submit" class="btn btn-primary">交卷</button>
            </div>
        </form>

    </div>
</div>

<script type="text/javascript" src="../assets/js/jquery.min.js"></script>
<script type="text/javascript" src="../assets/js/test.js"></script>
<script type="text/javascript">
    var c=0;
    var t;
    function timeCount() {
        $('#timelabel').val(c);
        c=c+1;
        t=setTimeout("timeCount()",1000);
    }
    $(function () {
        timeCount();
    });
</script>
</body>
</html>
