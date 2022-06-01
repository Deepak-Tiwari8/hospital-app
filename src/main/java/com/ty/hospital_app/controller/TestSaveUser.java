package com.ty.hospital_app.controller;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.impl.UserInterfaceServiceimpl;

public class TestSaveUser {

	public static void main(String[] args) {
     User user = new User();
     user.setUserName("munna");
     user.setUserEmail("munna44@gmail.com");
     user.setUserPassword("munna@123");
     user.setUserPhone(87654356789l);
     user.setUserRole("doctor");
     
     UserInterfaceServiceimpl userInterfaceServiceimpl = new UserInterfaceServiceimpl();
     userInterfaceServiceimpl.saveUser(user);
	}

}
