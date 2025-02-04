package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private int count;
	private String pay;
	// buyItem.jspに入力された情報がsetされる

	public String execute() {
		String result = SUCCESS;

		session.put("count", count);
		// countというkeyで、変数countという要素をsessionする

		int intCount = Integer.parseInt(session.get("count").toString());
		// session.getで整数型のstockをgetし、toStringで文字列型へと変換する
		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());

		session.put("total_price", intCount * intPrice);
		// 新しくbuyItem_price(合計金額)をoverrideさせる

		String payment;

		if (pay.equals("1")) {
			// buyItem.jspから送られたpayの値が1であれば、sessionが実行される
			payment = "現金払い";
			session.put("pay", payment);
		} else {
			// buyItem.jspから送られたpayの値が1以外であれば、sessionが実行される
			payment = "クレジットカード";
			session.put("pay", payment);
		}
		return result;
		// BuyItemActionのresultがSUCCESSでreturnされるので、struts.xmlによって次ページbuyItemConfirm.jspに移動する
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
