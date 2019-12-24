<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% //セッションスコープからユーザー情報を取得
    String loginUser = (String) session.getAttribute("loginUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>マイページ</h1>
<% if(loginUser != null){ %>
<p>ログインユーザー:<%= loginUser %>さん</p>
<p>管理画面</p>
<a href="/Session/Login.jsp">TOPへ</a>
<% } else { %>
<p><span style="color:red">ユーザー情報が確認できません</span></p>
<p>ログインしてください</p>
<a href="/Session/Login.jsp">ログインへ</a>
<% } %>

</body>
</html>