
public class Task {

	String Task;
	int noOfHours;
	
	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}


	public Task(String string, int i) {
		// TODO Auto-generated constructor stub
		this.Task=string;
		this.noOfHours=i;
	}

	public String getTask() {
		return Task;
	}

	public void setTask(String task) {
		Task = task;
	}
}
