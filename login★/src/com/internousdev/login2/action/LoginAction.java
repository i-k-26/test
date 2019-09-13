package com.internousdev.login2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.login2.dao.LoginDAO;
import com.internousdev.login2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String loginUserName;
	private String loginPassword;

	private Map<String, Object> session;

	public String execute(){
		String result = ERROR;
		
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		
		dto = dao.getLoginUserInfo(loginUserName,loginPassword);
		
		session.put("loginUser",dto);
		
		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			
			result = SUCCESS;
			session.put("user_name",dto.getUserName());
			session.put("login_password",dto.getLoginPassword());
			
			return result;
			
		}
		return result;
	
	}

	public String getLoginUserName() {
		return loginUserName;
	}

	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
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
