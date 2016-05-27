$(function(){
	
	var basePath = getCentext();
	
	//登陆按钮
	$("#long_button").click(function(){
		var account = $("#login_account").val();
		var passWord = $("#login_passWord").val();
		
		if(account.length > 5 && passWord.length > 5){
			var join = {join_account:account,join_password:strEnc(passWord,"1","2","3")};
			$.post(basePath+"/user/joinLogin",join,function(msg){
				if(msg != null){
					if(msg == 1 || msg == "1"){
						location.href=basePath+"/user/login";
					}else{
						alert("账号或密码错误！");
					}
				}else{
					alert("账号或密码错误！");
				}
			});
		}else{
			alert("请输入正确的账号密码！");
		}
	});
})