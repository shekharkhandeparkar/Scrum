import java.util.ArrayList;
import java.util.List;


public class Story {

	public Story(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		this.priority=i;
		this.velocity=j;
		this.storyPoints=k;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public int getStoryPoints() {
		return storyPoints;
	}
	public void setStoryPoints(int storyPoints) {
		this.storyPoints = storyPoints;
	}
	public List<Task> getTask() {
		return task;
	}
	public void setTask(List<Task> task) {
		this.task = task;
	}
	int priority;
	int velocity;
	int storyPoints;
	List<Task> task = new ArrayList<Task>();
	
	public void addTask(String string, int i) {
		// TODO Auto-generated method stub
		this.task.add(new Task(string, i));
	}

}
