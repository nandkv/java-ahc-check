package com.course.udemy.web;

import org.apache.commons.lang3.Validate;

public class NameService {

	public void someMethod() {
		throw new RuntimeException("Runtime exception occurred");
	}
	
	public boolean someOtherMethod(Boolean b) {
		//assert b instanceof Boolean;
		//Validate.notNull(b, "b cannot be null");
		//Validate.isTrue(b instanceof Boolean, "Boolean type expected");
		Validate.notNull(b, "b must not be %s", b);
		//Validate.isTrue(b instanceof Boolean, "b must be of type Boolean", b);
		//Validate.isAssignableFrom(Boolean.class, b.getClass());
		//Assert.notNull(b, "Boolean type expected");
		return true;
	}
}
