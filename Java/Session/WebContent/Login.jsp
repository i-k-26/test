<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>サンプル</title>
</head>
<body>
<h1>ようこそ</h1>
<form action="/Session/Login" method="post">
<span style="text-align:justify;text-justify:inter-ideograph;">ユーザー名：</span>
<input type="text" name="name"><br>
<span style="text-align:justify;text-justify:inter-ideograph;">パスワード：</span>
<input type="password" name="pass"><br>
<input type="submit" value="ログイン">
</form>
</body>
</html>