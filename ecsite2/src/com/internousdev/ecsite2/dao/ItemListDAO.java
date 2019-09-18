package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite2.dto.ItemListDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class ItemListDAO {

	public ArrayList<ItemListDTO> getItemListInfo() throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<ItemListDTO> itemlistDTO = new ArrayList<ItemListDTO>();

		String sql = "select * from item_info_transaction";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ItemListDTO dto = new ItemListDTO();

				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getString("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpdateDate(rs.getString("update_date"));

				itemlistDTO.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return itemlistDTO;
	}
}
