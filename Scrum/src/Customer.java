import java.util.ArrayList;
import java.util.List;


public class Customer implements Employee{
	String memberType;
	List<String> task = new ArrayList<String>();
	String role;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.memberType = "Customer";
	}
	@Override
	public void assignRole(String role) {
		// TODO Auto-generated method stub
		this.role = role;
	}

}
