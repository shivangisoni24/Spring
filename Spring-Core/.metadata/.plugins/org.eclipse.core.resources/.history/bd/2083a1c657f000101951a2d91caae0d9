package com.rays.autowirebysetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class UserServiceBySetter {
	
	@Autowired
	@Qualifier("userDaobysetter")
	private UserDAOInt userDaobysetter;

	public void testAdd() {
		userDaobysetter.add();
	}

}
