
/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot
{
    public static void RobotWalk(int speed, String signal){
        if(signal.equals("green")){
            System.out.println(speed);
        }
        else if(signal.equals("yellow")){
            System.out.println(speed * 1.2);
        }
        else{
            System.out.println(0);
        }
    }
}
