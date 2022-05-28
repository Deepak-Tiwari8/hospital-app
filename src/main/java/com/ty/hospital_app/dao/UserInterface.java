package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.User;

public interface UserInterface {

	public abstract User saveUser(User user);

	public abstract User updateUser(int userId, User user);

	public abstract boolean deleteUser(int userId);

	public abstract User getUserById(int userId);

	public abstract User getUserByRole(String userRole);

	public abstract User getUserByPhone(long userPhone);

	public abstract User validateUser(String userEmail, String userPassword);

	public abstract List<User> getAllUser();
}
