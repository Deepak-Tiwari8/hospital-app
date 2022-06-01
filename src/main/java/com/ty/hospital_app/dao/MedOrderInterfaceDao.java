package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedOrderInterfaceDao {

	public abstract MedOrder saveMedOrder(int encounterId,MedOrder medOrder);

	public abstract MedOrder getMedOrder(int medOrderId);

	public abstract List<MedOrder> getAllMedOrders(int encounterId);

	public abstract MedOrder updateMedOrder(int medOrderId, MedOrder medOrder);

	public abstract boolean deleteMedOrder(int medOrderId);
}
