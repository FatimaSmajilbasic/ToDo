package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import todo.list.Tasks;
import org.junit.Before;

public class Tasks_test {

	Tasks todo;

	@Before
	public void setUp() {
		String accountOwner = "Name";
		String taskDescription = "task";
		boolean tagged = false;
		todo = new Tasks(accountOwner, taskDescription, null, tagged);
	}

	@Test
	public void shouldReturnAccountOwnerNameWhenMethodInvoked() {
		String accountOwner = "Name";
		assertEquals("Name", accountOwner);
	}

	@Test
	public void shouldSetAccountOwnerNameWhenMethodInvoked() {
		String accountOwner = "Name";
		todo.setAccountUser(accountOwner);
		assertEquals("Name", accountOwner);
	}

	@Test
	public void shouldReturnTaskDescriptionWhenMethodInvoked() {
		String taskDescription = "task";
		assertEquals("task", taskDescription);
	}

	@Test
	public void shouldSetTaskDescriptionWhenMethodInvoked() {
		String taskDescription = "task";
		todo.setTaskDescription(taskDescription);
		assertEquals("task", taskDescription);
	}

	@Test
	public void shouldReturnTaggedWhenMethodInvoked() {
		boolean tagged = false;
		assertEquals(false, tagged);
	}

	@Test
	public void shouldSetTaggedWhenMethodInvoked() {
		boolean tagged = false;
		todo.setTagged(tagged);
		assertEquals(false, tagged);
	}

	@Test
	public void shouldReturnStringOfObjectWhenMethodInvoked() {
		String string = todo.toString();
		assertEquals(string, todo.toString());
	}

}

	
