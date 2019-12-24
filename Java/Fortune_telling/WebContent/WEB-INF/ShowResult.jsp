<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//リクエスト・スコープから値を取り出す。
String today = (String)request.getAttribute("today");
String luck = (String)request.getAttribute("luck");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
今日<%= today %>の運勢は<%= luck %>です。
</body>
</html>