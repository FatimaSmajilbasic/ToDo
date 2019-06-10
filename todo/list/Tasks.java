package todo.list;
import java.util.Date;
public class Tasks {

	private String accUsername;
	private String taskDescription;
	private Date date;
	private boolean tagged;

	public Tasks(String accUsername, String taskDescription, Date date, boolean tagged) {
		this.accUsername = accUsername;
		this.taskDescription = taskDescription;
		this.date = date;
		this.tagged = tagged;
	}

	public String getAccountUser() {
		return accUsername;
	}

	public void setAccountUser(String accountOwner) {
		this.accUsername = accountOwner;
	}

	public Date getDate() {
		return date;
	}


	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public boolean isTagged() {
		return tagged;
	}

	public void setTagged(boolean tagged) {
		this.tagged = tagged;
	}

	@Override
	public String toString() {
		return "TaskToDo [Username=" + accUsername + ", taskDescription=" + taskDescription + ", date="
				+ date + ", tagged=" + tagged + "]";
	}

	

}


