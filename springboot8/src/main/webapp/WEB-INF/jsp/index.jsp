<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body style="background-image: none;">
<div class="body_wrap">
    <div class="container">
        <div class=""  style="">Sptring Boot整合jsp</div>
        <hr/>
        <div>
        <table class="table table-striped table-bordered">
          
                <tr><td>姓名：</td><td>${friend.fname}</td></tr>
                <tr><td>性别：</td><td>${friend.sex}</td></tr>
                <tr><td>电话：</td><td>${friend.ftel}</td></tr>
          
         
        </table>
        </div>
    </div>
</div>
</body>
</html>