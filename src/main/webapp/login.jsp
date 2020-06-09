<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="zh-CN">
  <head>
    <meta charset="GB18030">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="keys" content="">
    <meta name="author" content="">
	<link rel="stylesheet" href="${App}/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${App}/css/font-awesome.min.css">
	<link rel="stylesheet" href="${App}/css/login.css">
	<style>

	</style>
  </head>
  <body>
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <div><a class="navbar-brand" href="index.html" style="font-size:32px;">平台</a></div>
        </div>
      </div>
    </nav>

    <div class="container">

      <form action="users/loginDo" id="loginForm" class="form-signin" role="form">
        <h2 class="form-signin-heading"><i class="glyphicon glyphicon-user"></i> 用户登录</h2>
		  <div class="form-group has-success has-feedback">
			<input type="text" class="form-control" id="uname" name="uname" placeholder="请输入登录账号" autofocus>
			<span class="glyphicon glyphicon-user form-control-feedback"></span>
		  </div>
		  <div class="form-group has-success has-feedback">
			<input type="text" class="form-control" id="upwd" name="upwd" placeholder="请输入登录密码" style="margin-top:10px;">
			<span class="glyphicon glyphicon-lock form-control-feedback"></span>
		  </div>
		  
        <a class="btn btn-lg btn-success btn-block" type="button" onclick="dologin()" > 登录</a>
      </form>
    </div>
    <script src="${App}/jquery/jquery-2.1.1.min.js"></script>
    <script src="${App}/bootstrap/js/bootstrap.min.js"></script>
    <script src="${App}/layer/layer.js"></script>
    <script>
    function dologin() {
       var unameVal=$("#uname").val();
       if(unameVal==null||unameVal==""){
    	   layer.msg("用户名不能为空",{time:2000,icon:5,shift:6},function(){})
    	   return;
       }
       var upwd=$("#upwd").val();
       if(upwd==null||upwd==""){
    	   layer.msg("密码不能为空",{time:2000,icon:5,shift:6},function(){})
    	   return;
       
    }
       window.location.href="users/main";
    }
    </script>
  </body>
</html>
