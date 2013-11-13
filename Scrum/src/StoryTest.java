import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StoryTest {

	Story story1 = new Story(1,5,5);
	Story story2 = new Story(2,5,5);
	Story story3 = new Story(3,5,5);
	Story story4 = new Story(4,5,5);
	@Before
	public void setUp() throws Exception {
		story1.addTask("Create Chart", 5);
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(1, story1.getPriority());
		assertEquals(5, story1.getVelocity());
		assertEquals(5, story1.getStoryPoints());
			
		assertEquals("Create Chart", story1.getTask().get(0).Task.toString());
		assertEquals(5, story1.getTask().get(0).noOfHours);
		
	}

}
