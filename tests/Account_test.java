package tests;

import static org.junit.Assert.*;
import todo.list.Account;


import org.junit.Before;
import org.junit.Test;

public class Account_test {

	
		Account account;
		
		@Before
		public void setup() {
		String username = "username";
		String password = "12345";
	

	}

	
	@Test
	public void shouldReturnUsernameWhenGivenUsername() {

		String result = account.getUsername();	

		assertEquals("username", result);

	}
	@Test
	public void shouldSetUsernameWhenMethodIsCalled() {
		String name="name";
		account.setUsername(name);
		assertEquals(account.getUsername(),name );
	}


	@Test
	public void shouldReturnPasswordWhenGivenPassword() {

		String result = account.getPassword();

		assertEquals("12345", result);
	}
	@Test
	public void shouldSetPasswordWhenMethodIsCalled() {
		String password = "12345";
		account.setPassword(password);
		assertEquals(account.getPassword(), password);
	}
	
	@Test
	public void shouldReturnStringWhenGivenString() {
		
		String result = account.toString();
		
		String expected = String.format("Username=" + "username" + 
				"\nPassword=" + "12345" 
						 );
		
		assertEquals(expected, result);
	}
	
}	



	



