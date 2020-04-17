

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RobotTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RobotTest
{
    /**
     * Default constructor for test class RobotTest
     */
    public RobotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Robor_yellow_Test()
    {
        Robot robot2 = new Robot();
        robot2.setSingal("yellow");
        robot2.setSpeed(60);
        assertEquals(72.0, robot2.RobotWalk(60, "yellow"), 0.1);
        
        Robot robot3 = new Robot();
        robot3.setSingal("green");
        robot3.setSpeed(60);
        assertEquals(60, robot3.RobotWalk(60, "green"), 0.1);
        
        Robot robot4 = new Robot();
        robot4.setSingal("red");
        robot4.setSpeed(60);
        assertEquals(0.0, robot4.RobotWalk(60, "red"), 0.1);
    }
}

