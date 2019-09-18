package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite2.dto.UserListDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class UserListDAO {

	public ArrayList<UserListDTO> getUserListInfo() throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<UserListDTO> userlistDTO = new ArrayList<UserListDTO>();

		String sql = "select * from login_user_transaction";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				UserListDTO dto = new UserListDTO();

				dto.setId(rs.getString("id"));
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpdatedDate(rs.getString("updated_date"));

				userlistDTO.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return userlistDTO;

	}

}
