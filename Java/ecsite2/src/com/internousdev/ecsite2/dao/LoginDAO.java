package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite2.dto.LoginDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword) {
		// LoginActionに格納されたloginUserIdとloginPasswordを取得する

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO loginDTO = new LoginDTO();
		// Mysqlのログイン状態が格納されたconとloginDTOをインスタンス化してLoginDAOクラスで使えるようにする

		String sql = "SELECT * from login_user_transaction where login_id = ? AND login_pass = ?";
		// Mysqlを操作するためのSELECT文

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			// PreparedStatementでプリコンパイル

			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);
			// Login.jspで入力されLoginActionからLoginDAOに渡されたloginUserIdとloginPasswordは上記箇所にsetされる
			// setされたloginUserIdとloginPasswordをSELECT文の?の箇所に当て、データベースと照合させる条件にする

			ResultSet rs = ps.executeQuery();
			// executeQuery()メソッドによって、javaベースのSELECT文が実行され、実行結果がResultSetに代入される

			if (rs.next()) {
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));
				loginDTO.setInsertDate(rs.getString("insert_date"));
				// ResultSetに代入された検索結果を元に、next()メソッドで上から順に値をgetしloginDTOのメソッドへ順にsetする//

				if (rs.getString("login_id") != null) {
					loginDTO.setLoginFlg(true);
					// Resultsetからgetしたlogin_idがnullじゃないならば、loginDTOのsetLoginFlgメソッドをtrueにする

					if (rs.getString("insert_date") == null) {
						loginDTO.setAdminFlg(true);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginDTO;

	}
}
