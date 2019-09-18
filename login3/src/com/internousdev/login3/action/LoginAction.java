package com.internousdev.login3.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.login3.dao.LoginDAO;
import com.internousdev.login3.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String loginId;
	private String loginPassword;

	private Map<String, Object> session;

	public String execute() {

		String result = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		dto = dao.getLoginUserInfo(loginId, loginPassword);

		if (dto.isLoginFlg()) {

			result = SUCCESS;

			session.put("Login_Id", dto.getLogin_id());
			session.put("Login_id", dto.getLogin_pass());

			return result;
		}
		return result;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
