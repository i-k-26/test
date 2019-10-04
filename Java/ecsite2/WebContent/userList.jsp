<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">


<title>User一覧</title>
</head>
<body>

	<div id="header"></div>

	<div id="main">
		<div id="top">
			<p>ユーザー一覧</p>
		</div>

		<div>
			<s:if test="userlist.isEmpty()">
				<h3>登録ユーザーは存在しません。</h3>
			</s:if>
			<s:elseif test="userlist != null">

				<h3>登録ユーザー</h3>
				<table border="1">
					<tr>
						<th>ID</th>
						<th>ログインID</th>
						<th>パスワード</th>
						<th>ユーザー名</th>
						<th>登録日時</th>
						<th>更新日時</th>
					</tr>
					<s:iterator value="userlist">
						<tr>

							<td><s:property value="id" /></td>
							<td><s:property value="loginId" /></td>
							<td><s:property value="loginPassword" /></td>
							<td><s:property value="userName" /></td>
							<td><s:property value="insertDate" /></td>
							<td><s:property value="updatedDate" /></td>
						</tr>
					</s:iterator>
				</table>
			</s:elseif>

			<div>
				<s:form action="GoAdminAction">
					<s:submit value="前のページへ戻る" />
				</s:form>

				<s:form action="LogoutAction">
					<s:submit value="ログアウト" />
				</s:form>
			</div>
		</div>
	</div>

	<div id="footer"></div>


</body>
</html>