package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.MyPageDTO;
import com.internousdev.ecsite.util.DBConnector;

public class MyPageDAO {

	public ArrayList<MyPageDTO> getMyPageUserInfo(String item_transaction_id, String user_master_id)
			throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();
		// ArrayList<MyPageDTO>をインスタンス化してMyPageDAOクラスで使用できるようにする

		String sql = "SELECT " + "ubit.id," + "iit.item_name," + "ubit.total_price," + "ubit.total_count," + "ubit.pay,"
				+ "ubit.insert_date " + "FROM " + "user_buy_item_transaction ubit " + "LEFT JOIN "
				+ "item_info_transaction iit " + "ON " + "ubit.item_transaction_id=iit.id " + "WHERE "
				+ "ubit.item_transaction_id =? AND ubit.user_master_id=? " + "ORDER BY insert_date DESC";
		// SQLを動かすためのSELECT文
		// iit=item_info_transactionの頭文字を取った略称
		// ubit=user_buy_item_uransactionの頭文字を取った略称
		// 複数のtableのフィールドをSELECTしている
		// iitで指定したidフィールドと、ubitで指定したitem_transaction_idフィールドをLEFT
		// JOIN(テーブル結合)している

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);
			ResultSet rs = ps.executeQuery();
			// SQLのSELECT文を実行して、実行結果をResultSetの変数rsに代入
			// 変数rsには、item_name・total_price・total_count・pay・item_transaction_id・user_master_idが代入されている

			while (rs.next()) {
				MyPageDTO dto = new MyPageDTO();
				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setTotalPrice(rs.getString("total_price"));
				dto.setTotalCount(rs.getString("total_count"));
				dto.setPayment(rs.getString("pay"));
				dto.setInsert_date(rs.getString("insert_date"));
				// next()メソッドによって、ResultSetの変数rsから順にgetし、dtoにsetされる

				myPageDTO.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return myPageDTO;
	}

	public int buyItemHistoryDelete(String item_transaction_id, String user_master_id) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM user_buy_item_transaction WHERE item_transaction_id=? AND user_master_id=?";
		// SQLのDELETE文

		PreparedStatement ps;
		int result = 0;
		// 初期値を0にしておくことで不本意な動作を防ぐ

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);
			// user_buy_item_transactionのtableにあるitem_transactionとuser_master_idの値をDELETEする

			result = ps.executeUpdate();
			// SQL文を実行した回数が、resultに代入される
			// Int型のbuyItemHistoryDeleteの中身は、SQL文が実行されると0以外の整数が入る

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}

}
