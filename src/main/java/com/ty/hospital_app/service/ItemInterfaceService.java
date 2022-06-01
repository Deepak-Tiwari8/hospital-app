package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.Observation;

public interface ItemInterfaceService {

	public abstract Item saveItem(int medOrderId,Item item);
	public abstract Item getItemById(int itemId);
	public abstract Item getItemByName(int itemName);
	public abstract Item updateItemById(int itemId,Observation observation,Item item);
	public abstract List<Item> getAllItemsByMedOrderId(int medOrderId);
	public abstract boolean deleteItemById(int itemId);
}
