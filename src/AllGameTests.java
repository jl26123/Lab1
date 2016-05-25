import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Runs all of the tests in this project
 * @author Jixiang Lu
 *
 */

@RunWith(Suite.class)
@SuiteClasses({ 
	TestCell.class, 
	TestLifeForm.class,
	TestEnvironment.class})
public class AllGameTests
{
}
