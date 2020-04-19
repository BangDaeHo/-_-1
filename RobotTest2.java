import java.util.Scanner;
/**
 * Write a description of class hi here.
 *
 * @author (2018315021 방대호, 2018315051 야마모토 요시카)
 * @version (20200409)
 */
public class RobotTest2
{
    public static void main(String [] args){
        double speed;
        String signal;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("신호를 입력하세요: ");
        signal = scanner.next();
        
        System.out.print("속도를 입력하세요: ");
        speed = scanner.nextDouble();
        
        Robot r = new Robot();
        r.RobotWalk(speed , signal);
        System.out.println(r.getSpeed());
    }
}
