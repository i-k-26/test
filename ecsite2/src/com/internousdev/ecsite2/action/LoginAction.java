package com.internousdev.ecsite2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemDAO;
import com.internousdev.ecsite2.dao.LoginDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	// login.jspから送られた情報が格納される

	private Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	// LoginDTOというプロジェクト型を変数loignDTOという型に変えている

	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	// LoginDAO・LoginDTO・BuyItemDAOをインスタンス化しLoginActionで使えるようにする

	public String execute() {
		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		// loginDAOのgetLoginUserInfoメソッドを呼び出し、loginUserIdとloginPasswordをloginDTOに代入(loginDAOの処理へ)

		if (loginDTO.getLoginFlg()) {
			// session.getでkey=loginUserの要素であるloginDTOをgetし、変数loginDTOをプロジェクト型のLoginDTOに戻す処理を行う
			// LoginDTOクラスにsetされているLoginFlg()メソッドの中身をgetする
			// if文は()内がtrueの場合のみ、その先の処理を行う

			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			// tableに登録されている全ての商品情報をbuyItemDTOに代入している

			session.put("login_user_id", loginDTO.getLoginId());
			// login_user_idをkey、loginDTOからgetしたLoginIdを要素とするsessionをputする
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());
			// sessionを使用する理由は、ログインを通さずに直接このページに飛んできたときに商品情報を表示させないため
			// session.putされた情報をbuyItem.jspに表示させる

			result = SUCCESS;

			if (loginDTO.getAdminFlg()) {
				session.put("adminname", loginDTO.getUserName());

				result = LOGIN;
				return result;
			}
			return result;
			// resultにはSUCCESSが代入されているため、SUCCESSがreturnされる
			// LoginActionがSUCCESSの場合、struts.xmlの指示によって次のページbuyItem.jspへと飛ばされる
		}
		return result;
		// falseの場合は、defaultでsetされているERRORがreturnされるので、ログインできない
		// LoginActionがERRORの場合、struts.xmlの指示によって次のページhome.jspへと飛ばされる
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
