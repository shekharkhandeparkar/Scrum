import static org.junit.Assert.*;

import org.junit.Test;


public class clientTest {

	Member member = new Member();
	ProductOwner productOwner = new ProductOwner();
	ScrumMaster scrumMaster = new ScrumMaster();
	Customer customer = new Customer();
	
	Team team = new Team(member, productOwner, scrumMaster, customer);
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
