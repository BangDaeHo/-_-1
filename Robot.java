
/**
 * Write a description of class Robot here.
 *
 * @author (2018315021 방대호, 2018315051 야마모토 요시카)
 * @version (20200409)
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
