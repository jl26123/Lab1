/**
 * Keeps track of the information associated with a simple life form. Also
 * provides the functionality related to the life form.
 * 
 * @author Jixiang Lu
 *
 */
public class LifeForm 
{
	private String myName;
	private int currentLifePoints;

	/**
	 * Create an instance
	 * 
	 * @param name
	 *            the name of the life form
	 * @param point
	 *            the current starting life points of the life form
	 */
	public LifeForm(String name, int point) 
	{
		if (point > 0) 
		{
			this.myName = name;
			this.currentLifePoints = point;
		} 
		else 
		{
			System.out.println("Bad value");
		}
	}

	/**
	 * @return the name of the life form
	 */
	public String getName() 
	{

		return this.myName;
	}

	/**
	 * @return the amount of current life points the life form has.
	 */
	public int getCurrentLifePoints() 
	{

		return this.currentLifePoints;
	}

}
