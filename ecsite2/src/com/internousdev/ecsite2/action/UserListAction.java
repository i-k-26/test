package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite2.dao.UserListDAO;
import com.internousdev.ecsite2.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport {

	private UserListDAO userlistDAO = new UserListDAO();
	private ArrayList<UserListDTO> userlist = new ArrayList<UserListDTO>();

	public String execute() throws SQLException {

		userlist = userlistDAO.getUserListInfo();

		String result = SUCCESS;

		return result;

	}

	public ArrayList<UserListDTO> getUserlist() {
		return this.userlist;
	}

	public void setUserlist(ArrayList<UserListDTO> userlist) {
		this.userlist = userlist;
	}

}
