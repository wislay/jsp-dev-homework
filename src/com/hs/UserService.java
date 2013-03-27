package com.hs;

import java.util.List;

public class UserService implements UserServiceIF {

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		UserDAO dao = UserDAOFactory.getDaoInstance();
		if (dao.queryById(u.getId()) == null) {
			dao.insert(u);
		}
		else {
			System.out.println("Fail to execute UserService.addUser");
		}
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		UserDAO dao = UserDAOFactory.getDaoInstance();
		if (dao.queryById(id) != null) {
			dao.delete(id);
		}
		else {
			System.out.println("Fail to execute UserService.deleteUser");
		}
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		UserDAO dao = UserDAOFactory.getDaoInstance();
		if (dao.queryById(u.getId()) != null) {
			dao.update(u);
		}
		else {
			System.out.println("Fail to execute UserService.addUser");
		}
	}

	@Override
	public List queryAllUser() {
		// TODO Auto-generated method stub
		UserDAO dao = UserDAOFactory.getDaoInstance();
		return dao.queryAll();
	}

	@Override
	public User queryById(String id) {
		// TODO Auto-generated method stub
		UserDAO dao = UserDAOFactory.getDaoInstance();
		return dao.queryById(id);
	}

}
