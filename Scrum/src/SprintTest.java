import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SprintTest {

	Sprint sprint = new Sprint();
	
	@Before
	public void setUp() throws Exception {
		sprint.stories.add(new Story(1,5,5));
		sprint.stories.add(new Story(2,5,5));
		sprint.stories.add(new Story(3,5,5));
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(1, sprint.stories.get(0).priority);
		assertEquals(2, sprint.stories.get(1).priority);
		assertEquals(3, sprint.stories.get(2).priority);
	}

}
