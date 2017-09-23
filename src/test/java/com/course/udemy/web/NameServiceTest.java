package com.course.udemy.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Test;

public class NameServiceTest {

	@Test
	public void testSomeMethod() {
		assertThatThrownBy(new NameService()::someMethod).isInstanceOf(RuntimeException.class)
				.hasMessage("Runtime exception occurred").hasNoCause();
	}

	@Test
	public void testSomeOtherMethod() {
		assertThatThrownBy(() -> new NameService().someOtherMethod(null)).isInstanceOf(NullPointerException.class)
				.hasMessage("b must not be null").hasNoCause();
	}
	
	@Test
	public void testSomeOtherMethodValid() {
		assertThat(new NameService().someOtherMethod(true)).isEqualTo(true);
	}
}
