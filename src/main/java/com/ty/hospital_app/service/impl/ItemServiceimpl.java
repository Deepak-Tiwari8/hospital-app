package com.ty.hospital_app.service.impl;

import java.util.List;


import com.ty.hospital_app.dao.ItemInterfaceDao;
import com.ty.hospital_app.dao.impl.ItemDaoimpl;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.Observation;

public class ItemServiceimpl implements ItemInterfaceDao
{
	ItemDaoimpl itemDaoimpl = new ItemDaoimpl();
	public Item saveItem(int medOrderId, Item item) {
		return itemDaoimpl.saveItem(medOrderId, item);
	}

	public Item getItemById(int itemId) {
		return itemDaoimpl.getItemById(itemId);
	}

	public Item getItemByName(int itemName) {
		return itemDaoimpl.getItemByName(itemName);
	}

	public Item updateItemById(int itemId, Observation observation, Item item) {
		return itemDaoimpl.updateItemById(itemId, observation, item);
	}

	public List<Item> getAllItemsByMedOrderId(int medOrderId) {
		return itemDaoimpl.getAllItemsByMedOrderId(medOrderId);
	}

	public boolean deleteItemById(int itemId) {
		return itemDaoimpl.deleteItemById(itemId);
	}
	
}
