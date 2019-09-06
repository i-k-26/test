<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">


<title>BuyItem画面</title>
</head>
<body>

	<div id="header"></div>

	<div id="main">
		<div id="top">
			<p>BuyItem</p>
		</div>

		<div>
			<s:form action="BuyItemAction">
				<table>
					<tr>
						<td><span>商品名</span></td>
						<td><s:property value="session.buyItem_name" /></td>
						<!-- LoginActionでBuyItemDTOからMapによってsessionされた要素を取り出す -->
					</tr>
					<tr>
						<td><span>値段</span></td>
						<td><s:property value="session.buyItem_price" /> <span>円</span>
						<!-- LoginActionでsessionされたbuyItem_priceというkeyの中身、intStock*intPriceを取り出す -->
						</td>
					</tr>
					<tr>
						<td><span>在庫</span></td>
						<td><select name="stock">
						<!-- 選択したvalueが、stockに代入されてBuyItemActionに送られる -->
								<option value="1" selected="selected">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
						</select></td>
					</tr>
					<tr>
						<td><span>支払い方法</span></td>
						<td><input type="radio" name="pay" value="1"
							checked="checked">現金払い 
							<input type="radio" name="pay"
							value="2" checked="checked">クレジットカード</td>
						<!-- 現金払いを選択するとpayの値に1が入る -->
						<!-- クレジットを選択するとpayの値に2が入る -->
					</tr>
					<tr>
						<td><s:submit value="購入" /></td>
						<!-- 購入を押すことで、各値がBuyItemActionに送られる -->
					</tr>
				</table>
			</s:form>
			<div>
				<span>前の画面に戻る場合は</span> <a href='<s:url action="HomeAction"/>'>こちら</a>
			</div>

		</div>
	</div>

	<div id="footer"></div>
</body>
</html>