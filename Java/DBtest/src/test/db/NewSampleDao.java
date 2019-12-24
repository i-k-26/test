package test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewSampleDao {

	private final String JDBC_URL = "jdbc:mysql://localhost:3306/SampleDb?serverTimezone=JST";
	private final String DB_USER = "root";
	private final String DB_PASS = "admin";

//	List<User> list = new ArrayList<User>();

	public List<User> getAll(String name,int age) {
		List<User> list = new ArrayList<User>();

		Connection conn = null;

		String sql = "SELECT * FROM sampledb.user where name = ? and age = ?";

		try {
			//データベース準備
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
			//
			PreparedStatement pSmt = conn.prepareStatement(sql);

			pSmt.setString(1, name);
			pSmt.setInt(2,age);
			//
			ResultSet rs = pSmt.executeQuery();

			while (rs.next()) {
				var record = new User();
				record.setName(rs.getString("name"));
				record.setAge(rs.getInt("age"));
				list.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			return null;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
		return list;
	}
//
//	public List<User> getList() {
//		return list;
//	}



}
