package tests;

import static org.junit.Assert.*;
import todo.list.Account;
import todo.list.TaskManager;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;


public class TaskManager_test {

	TaskManager manager;
	Account acc;
	ArrayList<Account> accounts = new ArrayList<>();
	
	@Before
	public void setUp() {
		manager = new TaskManager();
		acc = new Account("20", "1234");
		accounts.add(acc);
		
	}

	
	
	@Test
	public void shouldReturnTrueWhenPasswordMatchOnLogIn() {
		boolean condition = manager.logIn("20", "1234", accounts);
		assertTrue(condition);
	
	
		
	}

}
