package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Address;

public interface AddressInterface {

	public abstract Address saveAddress(Address address);

	public abstract boolean deleteAddress(int addressId);

	public abstract Address updateAddress(int addressId, Address address);

	public abstract Address getAddressById(int addressId);

}
