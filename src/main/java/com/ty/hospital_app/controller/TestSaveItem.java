package com.ty.hospital_app.controller;

import com.ty.hospital_app.dao.impl.ItemDaoimpl;
import com.ty.hospital_app.dto.Item;

public class TestSaveItem {

	public static void main(String[] args) {
    Item item = new Item();
    item.setItemName("aspirin");
    item.setItemQuantity(2);
    item.setItemCost(600);
    ItemDaoimpl itemDaoimpl = new ItemDaoimpl();
    itemDaoimpl.saveItem(1, item);
	}

}
