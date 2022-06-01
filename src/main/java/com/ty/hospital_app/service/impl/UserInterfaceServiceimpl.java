package com.ty.hospital_app.service.impl;
import java.util.List;

import com.ty.hospital_app.dao.UserInterfaceDao;
import com.ty.hospital_app.dao.impl.UserDaoimpl;
import com.ty.hospital_app.dto.User;

public class UserInterfaceServiceimpl implements UserInterfaceDao {
	UserDaoimpl userDaoimpl = new UserDaoimpl();

	public User saveUser(User user) {
		return userDaoimpl.saveUser(user);
	}

	public User updateUser(int userId, User user) {
		return userDaoimpl.updateUser(userId, user);
	}

	public boolean deleteUser(int userId) {
		return userDaoimpl.deleteUser(userId);
	}

	public User getUserById(int userId) {
		return userDaoimpl.getUserById(userId);
	}

	public User getUserByRole(String userRole) {
		return userDaoimpl.getUserByRole(userRole);
	}

	public User getUserByPhone(long userPhone) {
		return userDaoimpl.getUserByPhone(userPhone);
	}

	public User validateUser(String userEmail, String userPassword) {
		return userDaoimpl.validateUser(userEmail, userPassword);
	}

	public List<User> getAllUser() {
		return userDaoimpl.getAllUser();
	}

}