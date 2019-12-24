<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% //セッションスコープからユーザー情報を取得
    String loginUser = (String) session.getAttribute("loginUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>認証結果</title>
</head>
<body>

<h1>どこつぶログイン</h1>
<% if(loginUser != null){ %>
<p>ログインに成功しました</p>
<p>ようこそ<%=loginUser %>さん</p>
<a href="/Session/MyPage.jsp">マイページへ</a>
<% } else { %>
<p><span style="color:red">ログインに失敗しました</span></p>
<a href="/Session/Login.jsp">TOPへ</a>
<% } %>

</body>
</html>