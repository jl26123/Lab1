import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test the functionality provided by the LifeForm class.
 * @author Jixiang
 *
 */
public class TestLifeForm 
{

	/**
	 * When a LifeForm is created, it should know its name and how
	 * many life points it has.
	 */
	@Test
	public void testInitialization() 
	{
		LifeForm entity;
		entity = new LifeForm("Bob",40);
		assertEquals("Bob",entity.getName());
		assertEquals(40,entity.getCurrentLifePoints());
		
		entity = new LifeForm("Bob",0);
		assertEquals(null,entity.getName());
		assertEquals(0,entity.getCurrentLifePoints());
	}

}
