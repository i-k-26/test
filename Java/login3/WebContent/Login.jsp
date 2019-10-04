<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
	<h3>ログイン</h3>
	<s:form action="LoginAction">
		<s:textfield name="loginId" />
		<s:password name="loginPassword" />
		<s:submit value="ログイン" />
	</s:form>

</body>
</html>