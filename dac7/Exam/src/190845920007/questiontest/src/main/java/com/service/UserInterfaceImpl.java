package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;

@Service
public class UserInterfaceImpl implements UserInterface {

		@Autowired
		private UserDao udao;
		
		
	public UserInterfaceImpl() {
			super();
			this.udao = new UserDaoImpl();
		}


	public int insert(String fname, String lname, String cno, String email, String bdate, String city) {
		
		return udao.insertUser(fname,lname,cno,email,bdate,city);
	}

}
