package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	public BuyItemDTO getBuyItemInfo() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		BuyItemDTO buyItemDTO = new BuyItemDTO();
		// インスタンス化

		String sql = "SELECT id, item_name,item_price FROM item_info_transaction";
		// Mysqlを操作するためのSELECT文
		// id、item_name、item_price、item_info_transactionの4つをSELECT文で照合する

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			// SELECT文が実行され、実行結果である4つの照合された要素がResultSetに代入される

			if (rs.next()) {
				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
				// next()メソッドで、ResultSetに代入された要素を順番にgetし、buyItemDTOにsetする
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buyItemDTO;
	}

}
