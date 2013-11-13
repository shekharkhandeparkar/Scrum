import java.util.ArrayList;
import java.util.List;

public class Organisation {
	
	List<Projects> projectList = new ArrayList<Projects>();
	Team team = new Team();
	
	public static void main(String[] args)
	{
		Projects project = new Projects("Scrum");
	}


	public List<Projects> getProjectList() {
		
		return this.projectList;
	}
}
