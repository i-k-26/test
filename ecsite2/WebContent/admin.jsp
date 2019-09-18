<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">


<title>Admin画面</title>
</head>
<body>

	<div id="header"></div>

	<div id="main">
		<div id="top">
			<p>管理者画面</p>
		</div>

		<div>
			<p>
				ようこそ、
				<s:property value="session.adminname" />
				さん
			</p>
		</div>

		<table>
			<tr>
				<th colspan="2">管理者メニュー</th>
			</tr>
			<tr align="center">
				<td><s:form action="ItemCreateAction">
						<s:submit value="商品登録" />
					</s:form></td>
				<td><s:form action="UserCreateAction">
						<s:submit value="ユーザー登録" />
					</s:form></td>
			</tr>
			<tr align="center">
				<td><s:form action="ItemListAction">
						<s:submit value="商品一覧" />
					</s:form></td>
				<td><s:form action="UserListAction">
						<s:submit value="ユーザー一覧" />
					</s:form></td>
			</tr>
		</table>

		<div>
			<s:form action="LogoutAction">
				<s:submit value="ログアウト" />
			</s:form>
		</div>

	</div>

	<div id="footer"></div>

</body>
</html>