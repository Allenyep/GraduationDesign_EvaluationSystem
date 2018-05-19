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
    <title>jQuery在线考试答题代码</title>

    <link rel="stylesheet" href="../assets/css/bootstrap.css">
    <style type="text/css">
        .testCon{padding: 5px 15px;}
        h4.tesTitle{color: #00B895;}
        .test-form-box{max-height: 660px;overflow: auto;}
        .assignment{margin: 30px 0 60px;text-align: center;}
        .assignment .btn{background: #00B895;width: 120px;font-size: 18px;border-color: #00B895;}
        #testForm .testCon:nth-child(odd){background: #eee;}
        label{font-weight: normal;}
        .jxz-title{text-align: justify;}
        .topic-answer{display: none;}
    </style>

</head>
<body>

<div class="container">
    <div class="row clearfix" id="testArea">
        <div class="page-header">
            <h3 class="text-center">测评练习</h3>
        </div>
        <form method="post" action="">
            <c:forEach items="${examlist}" var="que" varStatus="i">
                <div class="testCon" >
                    <input type="hidden" value="${que.answerQ}">
                </div>
                <h4 class="jxz-title">第${i.index+1}题 ${que.contextQ} (分值${que.scoreQ})</h4>
                <div class="jxz-option">
                <textarea name="test" class="form-control" style="width: 50%" rows="5" placeholder="在此填写回答">
                </textarea>
                </div>
            </c:forEach>
            <div class="form-group assignment">
                <button type="button" class="btn btn-primary" onclick="assignment()">交卷</button>
            </div>
        </form>

    </div>
</div>

<script type="text/javascript" src="../assets/js/jquery.min.js"></script>
<script type="text/javascript" src="../assets/js/test.js"></script>
<script type="text/javascript">
    $(function(){
        //题型    1单选2多选3判断4填空5问答8论述题6完型填空7阅读理解
        //json    格式参照data/test.json
        //交卷    点击交卷后可查看对错
        var test_id = 'get a test id';
        //TODO:ajax获取数据
//        $.ajax({
//
//        });
        test(test_id);
    });
</script>
</body>
</html>
