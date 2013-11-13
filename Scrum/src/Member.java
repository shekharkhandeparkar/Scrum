import java.util.ArrayList;
import java.util.List;


public class Member implements Employee{

	String memberType;
	List<String> task = new ArrayList<>();
	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.memberType="Member";
	}

}
