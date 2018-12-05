package com.customer.dao.impl;

import org.hibernate.Session;

import com.customer.pojo.Customer;
import com.customer.pojo.DBUtil;

public class CustomerDaoImpl {
	
	public void customerRegistration(Customer c) {
		System.out.println(6);
		Session ss = DBUtil.getsf().openSession();
		ss.save(c);
		ss.beginTransaction().commit();
		ss.close();
	}

}
