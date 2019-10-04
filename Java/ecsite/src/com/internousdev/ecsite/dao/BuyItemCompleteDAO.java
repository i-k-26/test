package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemCompleteDAO {
	public void buyItemInfo(String item_transaction_id, String total_price, String total_count, String user_master_id,
			String pay) throws SQLException {
		// buyItemInfoメソッドをBuyItemCompleteDAO内で定義する

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil = new DateUtil();
		// dateUtilをインスタンス化して、date(日付)をINSERTできるようにする

		String sql = "INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date)VALUES(?,?,?,?,?,?)";
		// user_buy_item_transactionのtableに6つの項目のvaluseをINSERTするためのsql

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, total_count);
			ps.setString(4, user_master_id);
			ps.setString(5, pay);
			ps.setString(6, dateUtil.getDate());
			// 各変数をINSERT文の?に代入

			ps.execute();
			// 6つの情報をINSERT文でデータベースに追加する。

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
