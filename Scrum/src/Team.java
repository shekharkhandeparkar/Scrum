import java.util.ArrayList;
import java.util.List;


public class Team {
	List<Member> members = new ArrayList<Member>();
	Employee ProductOwner;
	Employee ScrumMaster;
	Employee Customer;
	

	public void assign(List<Member> members2, Employee productOwner2,
			Employee scrumMaster2, Employee customer2) {
		// TODO Auto-generated method stub
		
		this.members=members2;
		this.ProductOwner=productOwner2;
		this.ScrumMaster=scrumMaster2;
		this.Customer=customer2;		
	}
}
