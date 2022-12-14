package com.finance.Service;

import java.util.List;

import com.finance.Model.User;

public interface AuthenticateUserService {
	public List<User> getUserdetails();

		public boolean updateUser(long regid);
		
		public User findUser(long regid);
		public boolean deleteUser(long regid);
		
		public boolean addUser(User user);

}
