package todo.list;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class ToDo_Main {

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);
		ArrayList<Account> accounts = new ArrayList<>();
		ArrayList<Tasks> tasks = new ArrayList<>();
		int choice = -1;
        try {
        
		while (choice != 0) {
			System.out.println("\nSelect :\n" + "\n1 -> create account " + "\n2 -> login " + "\n0 -> end \n");
			choice = input.nextInt();

			if (choice == 1) {
				System.out.print("Enter your username: ");
				String username = input.next();
				System.out.print("Enter your password (5 characters): ");
				String password = input.next();
				while (password.length() != 5  ) {
					System.out.print("Password must contain 5 characters! Try again : ");
						password = input.next();
				}
				Account acc = new Account(username, password);
              
				accounts.add(acc);
				System.out.println("\nYou have successfully registered!");

			} else if (choice == 2) {

				System.out.print("\nEnter your username:  ");
				String username = input.next();
				System.out.print("Enter your password :  ");
				input.nextLine();
				String password = input.next();
				
				
				int select = -1;

				if (TaskManager.logIn(username, password, accounts)) {
					System.out.println("\nYou've been successfully logged in.");
				}
				while (select != 7) {
					System.out
							.println("1 -> create task" + "\n2 -> edit task" + "\n3 -> tag task " + "\n4 -> delete task"
									+ "\n5 -> list all tasks " + "\n6 -> list taged tasks" + "\n7 -> exit account");
					select = input.nextInt();

					switch (select) {
					case 1:
						System.out.print("Enter username: ");
						String name = input.next();
						System.out.print("Enter task description: ");
						String description = input.nextLine();
						input.nextLine();

						System.out.println("Enter date of task creation (dd-mm-yyyy):  ");
						DateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
						String creationDate = input.nextLine();
						Date dateTaskCreated = myFormat.parse(creationDate);
						boolean tagged = false;
						Tasks task = new Tasks(name, description, dateTaskCreated, tagged);
						tasks.add(task);
						break;

					case 2:
						System.out.print("Enter index of the task you want to edit :  ");
						TaskManager.showAllTasks();
						int taskNumber = input.nextInt();
						System.out.println("Enter new description for the task:  ");
						input.nextLine();
						String taskDescription = input.nextLine();
						TaskManager.editTasks(taskNumber, taskDescription, tasks);
						System.out.println("\nTask has been successfully edited.");
						break;
					case 3:
						System.out.print("Enter index of the task you want to tag :");
						TaskManager.showAllTasks();
						taskNumber = input.nextInt();
						TaskManager.addTag(taskNumber);
						System.out.println("Task number " + taskNumber + " has been tagged.");
						break;

					case 4:
						System.out.print("Enter index of the task you want to delete :  ");
						TaskManager.showAllTasks();
						taskNumber = input.nextInt();
						TaskManager.deleteExistingTask(taskNumber, tasks);
						System.out.println("\nTask has been successfully deleted.");
						break;
					case 5:
						if (tasks.size() != 0) {
							TaskManager.showAllTasks();
						} else System.out.println("ToDo list is empty!");
						
						break;
					case 6:
						if (tasks.size() != 0)
							TaskManager.showTaggedTasks();
						else System.out.println("ToDo list is empty!");
						break;
					}

				}

			}

		}
        } 
        catch (Exception ex) {
        	System.out.print("There was an error! ");
        } finally {
        	input.close();
        	
        }System.out.println("Have a nice day!");
        
	}

}
