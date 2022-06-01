package com.ty.hospital_app.service.impl;

import java.util.List;

import com.ty.hospital_app.dao.MedOrderInterfaceDao;
import com.ty.hospital_app.dao.impl.MedOrderDaoimpl;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderServiceimpl implements MedOrderInterfaceDao
{
	MedOrderDaoimpl medOrderDaoimpl = new MedOrderDaoimpl();
	@Override
	public MedOrder saveMedOrder(int encounterId, MedOrder medOrder) {
		return medOrderDaoimpl.saveMedOrder(encounterId, medOrder);
	}

	@Override
	public MedOrder getMedOrder(int medOrderId) {
		return medOrderDaoimpl.getMedOrder(medOrderId);
	}

	@Override
	public List<MedOrder> getAllMedOrders(int encounterId) {
		return medOrderDaoimpl.getAllMedOrders(encounterId);
	}

	@Override
	public MedOrder updateMedOrder(int medOrderId, MedOrder medOrder) {
		return medOrderDaoimpl.updateMedOrder(medOrderId, medOrder);
	}

	@Override
	public boolean deleteMedOrder(int medOrderId) {
		return medOrderDaoimpl.deleteMedOrder(medOrderId);
	}

}
