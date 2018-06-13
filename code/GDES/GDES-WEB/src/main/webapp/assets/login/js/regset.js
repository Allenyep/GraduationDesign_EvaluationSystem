
$(function(){ 
    // 验证  
    $("#submitBtn").click(function(){
        // 做表单输入校验  
        var username = $("#username").val();  
        var sfzh = $("#sfzh").val();  
        var ckcode = $("#ckcode").val();  
        var msg = "";  
        if (username == ""){
        	//$("#usernameTips").addClass("u-tips-err");
        	//$("#usernameTips span").text("用户名不能为空！");
            msg = "用户名不能为空！";  
        }
		if (sfzh == ""){  
            msg = "身份证号不能为空！";  
        }else{  
        	var t = false;
        	var len = sfzh.length;
        	if(len==15){
        		t = isValidityBrithBy15IdCard(sfzh);
        	}else if(len==18){
        		t = isValidityBrithBy18IdCard(sfzh);
        	}
        	if(t==false){
        		 msg = "身份证格式不正确！";
        	}           
        }
         if (ckcode == ""){  
            msg = "验证码不能为空！";   
        }
        if (msg != ""){  
           alert(msg);
        }else{ 
		    $.ajax({
		           type: "post",
		           url: "/xgxt/home/findPwd.action",
		           data: {username:username,sfzh:sfzh,ckcode:ckcode},
		           async : false,
		           dataType : 'json',
		           success: function (response) {
		           	if (response.success) {
		           		window.location.href = basePath + "bzb/student/resetPwdIdSucc.jsp";
		           	}else{
	     				alert(response.msg);
	     			}
		   		}
		       }); 
        }  
          
    });  

}); 
    
function loadimage(){ 
	document.getElementById("randImage").src = "image.jsp?"+Math.random(); 
}  