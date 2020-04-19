
/**
 * Write a description of class Robot here.
 *
 * @author (2018315021 방대호, 2018315051 야마모토 요시카)
 * @version (20200409)
 */
public class Robot
{
    double speed;
    String signal;

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public void setSingal(String signal){
        this.signal = signal;
    }
    
    public double getSpeed(){
       return this.speed;
    }

    public void RobotWalk(double speed, String signal){
        if(signal.equals("green")){
            
        }
        else if(signal.equals("yellow")){
            this.speed *= 1.2;
        }
        else{
            this.speed = 0;
        }
    }
}
