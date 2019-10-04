package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite2.dao.ItemListDAO;
import com.internousdev.ecsite2.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport {

	private ItemListDAO itemlistDAO = new ItemListDAO();
	private ArrayList<ItemListDTO> itemlist = new ArrayList<ItemListDTO>();

	public String execute() throws SQLException {

		itemlist = itemlistDAO.getItemListInfo();

		String result = SUCCESS;

		return result;

	}

	public ArrayList<ItemListDTO> getItemlist() {
		return this.itemlist;
	}

	public void setItemlist(ArrayList<ItemListDTO> itemlist) {
		this.itemlist = itemlist;
	}

}
