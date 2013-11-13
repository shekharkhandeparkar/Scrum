import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class projectTest {

	Projects project = new Projects("Scrum");
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testProjectName() {
		//fail("Not yet implemented");
		
		assertEquals("Scrum", project.getProjectName());
	}
}
