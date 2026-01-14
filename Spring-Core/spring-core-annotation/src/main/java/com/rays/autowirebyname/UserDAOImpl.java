package com.rays.autowirebyname;

import org.springframework.stereotype.Repository;

@Repository("userDaobyname")
//@Repository annotation is use for create DAO(CRUD) layer and also create bean
public class UserDAOImpl implements UserDAOInt {

	public void add() {
		System.out.println("Name Add method.....");
	}

}
