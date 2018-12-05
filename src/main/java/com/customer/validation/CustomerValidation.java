package com.customer.validation;

public class CustomerValidation {
	
		public boolean isTextEmpty(String text) {
			if(text==null||text.isEmpty())
				return true;
			return false;
		
	}

}
