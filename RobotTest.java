

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
    public void Robot_test()
    {
        Robot robot1 = new Robot();
        robot1.RobotWalk(60, "green");
        robot1.setSignal("green");
        robot1.setSpeed(60);
        robot1.RobotWalk(60, "green");
        assertEquals(60.0, robot1.getSpeed(), 0.1);
        
        Robot robot2 = new Robot();
        robot2.setSignal("yellow");
        robot2.setSpeed(60);
        robot2.RobotWalk(60, "yellow");
        assertEquals(72.0, robot2.getSpeed(), 0.1);
        
        Robot robot3 = new Robot();
        robot3.setSignal("red");
        robot3.setSpeed(60);
        robot3.RobotWalk(60, "red");
        assertEquals(0.0, robot3.getSpeed(), 0.1);
    }
}

