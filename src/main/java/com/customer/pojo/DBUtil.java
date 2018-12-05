package com.customer.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {
	@SuppressWarnings("deprecation")
	public static SessionFactory getsf() {
		return new Configuration().configure().buildSessionFactory();
	}
}
