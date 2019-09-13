package com.internousdev.login2.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login2.dto.LoginDTO;
import com.internousdev.login2.util.DBConnector;
import com.mysql.jdbc.Connection;

public class LoginDAO {

	public LoginDTO getLoginUserInfo(String loginUserName, String loginPassword) {

		DBConnector db = new DBConnector();
		Connection con = (Connection) db.getConnection();
		LoginDTO dto = new LoginDTO();

		String sql = "select * from user where user_name = ? AND password = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, loginUserName);
			ps.setString(2, loginPassword);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				dto.setUserName(rs.getString("user_name"));
				dto.setLoginPassword(rs.getString("password"));

				if (rs.getString("user_name") != null) {
					dto.setLoginFlg(true);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;

	}
}
