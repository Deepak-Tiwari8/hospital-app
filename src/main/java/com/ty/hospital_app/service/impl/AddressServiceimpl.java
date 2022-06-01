package com.ty.hospital_app.service.impl;

import com.ty.hospital_app.dao.AddressInterfaceDao;
import com.ty.hospital_app.dao.impl.AddressDaoimpl;
import com.ty.hospital_app.dto.Address;

public class AddressServiceimpl implements AddressInterfaceDao
{
	AddressDaoimpl addressDaoimpl = new AddressDaoimpl();
	@Override
	public Address saveAddress(Address address) {
		return addressDaoimpl.saveAddress(address);
	}

	@Override
	public boolean deleteAddress(int addressId) {
		return addressDaoimpl.deleteAddress(addressId);
	}

	@Override
	public Address updateAddress(int addressId, Address address) {
		return addressDaoimpl.updateAddress(addressId, address);
	}

	@Override
	public Address getAddressById(int addressId) {
		return addressDaoimpl.getAddressById(addressId);
	}

}
