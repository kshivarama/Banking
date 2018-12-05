package com.customer.controllers;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.customer.dao.impl.CustomerDaoImpl;
import com.customer.pojo.Customer;
import com.customer.validation.CustomerValidation;

@Controller
public class CustomerController {
	
	@RequestMapping(value="/register")
	public String registerCustomer(Model model,Customer cust) {
		System.out.println("entered into register");
		CustomerValidation validation=new CustomerValidation();
		
		boolean result =validation.isTextEmpty(cust.getName());
		
		if(result) {
			System.out.println(1);
			model.addAttribute("message", "Name should not be empty");
			model.addAttribute("customer", cust);
			return "register";
		}
		result =validation.isTextEmpty(cust.getEmail());
		if(result) {
			System.out.println(2);
			model.addAttribute("message", "email id should not be empty");
			model.addAttribute("customer", cust);
			return "register";
		}
		result =validation.isTextEmpty(cust.getPassword());
		if(result) {
			System.out.println(3);
			model.addAttribute("message", "Password field should not be empty");
			model.addAttribute("customer", cust);
			return "register";
		}
		result =validation.isTextEmpty(cust.getContactNumber());
		if(result) {
			System.out.println(4);
			model.addAttribute("message", "contact number should not be empty");
			model.addAttribute("customer", cust);
			return "register";
		}
		/*result =validation.isTextEmpty(cust.getIncome());
		if(result) {
			model.addAttribute("message", "Income field cannot not be empty");
			model.addAttribute("customer", cust);
			return "register";
		}*/
		
		
		try {
			System.out.println(5);
			CustomerDaoImpl custDao=new CustomerDaoImpl();
			custDao.customerRegistration(cust);
		}catch(ConstraintViolationException cve){
			model.addAttribute("message", "Already registered");
			return "register";
		}catch(Exception e) {
			model.addAttribute("message", "Please try after sometime something went right");
			return "register";
		}
		System.out.println("CustomerController::registerCustomer()method!!");
		
		return "login";
	}

}

