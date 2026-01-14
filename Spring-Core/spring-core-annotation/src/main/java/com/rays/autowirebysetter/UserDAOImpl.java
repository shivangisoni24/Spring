package com.rays.autowirebysetter;

import org.springframework.stereotype.Repository;

@Repository("userDaobysetter")
//@Repository annotation is use for create DAO(CRUD) layer and also create bean
public class UserDAOImpl implements UserDAOInt {

	public void add() {
		System.out.println("Setter Add method.....");

	}

}
