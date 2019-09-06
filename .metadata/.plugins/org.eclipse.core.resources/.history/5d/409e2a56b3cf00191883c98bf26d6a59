package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MyPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private String deleteFlg;
	private String result;

	public String execute() {
		MyPageDAO myPageDAO = new MyPageDAO();
		MyPageDTO myPageDTO = new MyPageDTO();

		// 商品履歴を削除しない場合
		if (deleteFlg == null) {
			String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();
			//String型に変換したsessionを代入

			myPageDTO = myPageDAO.getMyPageUserInfo(item_transaction_id, user_master_id);

			session.put("buyItem_name", myPageDTO.getItemName());
			session.put("total_price", myPageDTO.getTotalPrice());
			session.put("total_count", myPageDTO.getTotalCount());
			session.put("total_payment", myPageDTO.getPayment());
			session.put("message", "");
			//messageの要素は空になり、myPage.jspの分岐条件となる
			
			// 商品履歴を削除する場合
		} else if (deleteFlg.equals("1")) {
			delete();
			//myPage.jspでvalueに1が入った場合、下記のdelete()メソッドが実行される
		}
		result = SUCCESS;
		//tableのdeleteFlgがnullでも1でもない場合、SUCCESSがreturnされmyPage.jspが表示される
		return result;
	}

	public void delete() {

		MyPageDAO myPageDAO = new MyPageDAO();

		String item_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);
		//myPageDAOのbuyItemHistoryDeleteを、resに代入
		//MyPageDAOのbuyItemHistoryDeleteでSQL文が実行されている場合、resには0以外の整数が入る

		if (res > 0) {
			session.put("message", "商品情報を正しく削除しました。");
			//resに0以外の整数が入っている場合、sessionにkey:message、要素:商品情報を正しく～の文がputされる。
		} else if (res == 0) {
			session.put("message", "商品情報の削除に失敗しました。");
			//いわゆるエラーが起きた場合の処理内容
		}
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
