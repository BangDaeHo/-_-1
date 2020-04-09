import java.util.Scanner;
/**
 * Write a description of class hi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String [] args){
        int speed = 60;
        String signal;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("신호를 입력하세요: ");
        signal = scanner.next();
        
        if(signal.equals("green")){
            green.Green(speed);
        }
        else if(signal.equals("yellow")){
            
        }
        else{
            
        }
    }
}
