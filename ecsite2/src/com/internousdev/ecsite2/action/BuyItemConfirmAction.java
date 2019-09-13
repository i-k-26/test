package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	// インスタンス化

	public String execute() throws SQLException {
		buyItemCompleteDAO.buyItemInfo(session.get("id").toString(), session.get("count").toString(),
				session.get("total_price").toString(), session.get("login_user_id").toString(),
				session.get("pay").toString());
		// toStringで文字列型に変換

		String result = SUCCESS;
		return result;
		// BuyItemActionのresultがSUCCESSでreturnされるので、struts.xmlによって次ページbuyItemComplete.jspに移動する
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
