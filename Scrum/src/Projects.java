import java.util.ArrayList;
import java.util.List;


public class Projects {
	
	String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Projects(String string) {
		this.projectName=string;
	}
	
	public void assignTeam()
	{
		Team team = new Team();
		List<Member> members = new ArrayList<Member>();
		Employee ProductOwner = new ProductOwner();
		Employee ScrumMaster = new ScrumMaster();
		Employee Customer = new Customer();
		team.assign(members, ProductOwner, ScrumMaster, Customer);
	}

}
