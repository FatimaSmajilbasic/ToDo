package todo.list;
import java.util.ArrayList;
import java.util.Collections;
public class TaskManager {
	
	Tasks todo;
	public static ArrayList<Tasks> tasks = new ArrayList<>();
	public static ArrayList<Tasks> todoTag = new ArrayList<>();
	
	public static boolean logIn(String username, String password, ArrayList<Account> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getUsername() == username) {
				if (accounts.get(i).getPassword().equals(password)) {
					return true;
				}
			}
		}

		return false;
	}
	
	
	public static void editTasks(int taskNumber, String newDescription, ArrayList<Tasks> tasks) {
		if (tasks.size() > 0) {
			tasks.get(taskNumber - 1).setTaskDescription(newDescription);
				
		}
	}

	public static void showAllTasks() {
		Collections.reverse(tasks);
		if (tasks.size() == 0) {
			System.out.println("ToDo list is empty.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ". Username:  " + tasks.get(i).getAccountUser() + ", Task description: "
						+ tasks.get(i).getTaskDescription() + ", created on:  " + tasks.get(i).getDate());
						
			}
		}
	}

	
	public static void deleteExistingTask(int taskNumber, ArrayList<Tasks> tasks) {
		if (tasks.size() != 0) {
			tasks.remove(taskNumber - 1);
			System.out.println("\nTask has been successfully deleted.");
		} else
			System.out.println("\nToDo list is empty.");
	}
		
		
		public static void addTag(int indexOfTodo) {
			todoTag.add(tasks.get(indexOfTodo));
			tasks.remove(tasks.get(indexOfTodo));

		}

		public static void showTaggedTasks() {
			if (todoTag.isEmpty()) {
				System.out.println("There is no tagged tasks!");
			} else {
				for (Tasks e : todoTag) {
					System.out.println("XXXXXXXX " + e + " XXXXXXXX");
				}
			}
		

	}
}
