package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {
		BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
		//インスタンス化
		
		buyItemCompleteDAO.buyItemInfo(session.get("id").toString(), session.get("login_user_id").toString(),
				session.get("buyItem_price").toString(), session.get("stock").toString(),
				session.get("pay").toString());
		//toStringで文字列型に変換

		String result = SUCCESS;
		return result;
		//BuyItemActionのresultがSUCCESSでreturnされるので、struts.xmlによって次ページbuyItemComplete.jspに移動する
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
