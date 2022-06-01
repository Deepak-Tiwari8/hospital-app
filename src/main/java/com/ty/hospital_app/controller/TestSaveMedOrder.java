package com.ty.hospital_app.controller;

import com.ty.hospital_app.dao.impl.MedOrderDaoimpl;
import com.ty.hospital_app.dto.MedOrder;

public class TestSaveMedOrder {

	public static void main(String[] args) {
    MedOrder medOrder = new MedOrder();
    
    medOrder.setPerscription("fever");
    MedOrderDaoimpl medOrderDaoimpl = new MedOrderDaoimpl();
    medOrderDaoimpl.saveMedOrder(1, medOrder);
	}

}
