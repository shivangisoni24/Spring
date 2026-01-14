package com.rays.autowirebyconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceByConstructor {
	
	@Autowired
	@Qualifier("userDaobyconstructor")
	private UserDAOInt userDaobyconstructor;

	public void testAdd() {
		userDaobyconstructor.add();
	}


}
