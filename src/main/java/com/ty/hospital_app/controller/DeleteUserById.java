package com.ty.hospital_app.controller;

import com.ty.hospital_app.service.impl.UserInterfaceServiceimpl;

public class DeleteUserById {

	public static void main(String[] args) {
		 UserInterfaceServiceimpl userInterfaceServiceimpl = new UserInterfaceServiceimpl();
		 userInterfaceServiceimpl.deleteUser(1);
	}
}
