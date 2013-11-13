import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class organisationTest {

	
	Organisation organisation = new Organisation();
	List<Projects> projectList = new ArrayList();
	
	@Before
	public void setUp() throws Exception {
		
		projectList = organisation.getProjectList();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(0,projectList.size());
	}

}
