package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Address;

public interface AddressInterfaceService {

	public abstract Address saveAddress(Address address);

	public abstract boolean deleteAddress(int addressId);

	public abstract Address updateAddress(int addressId, Address address);

	public abstract Address getAddressById(int addressId);

}
