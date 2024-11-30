package Commands;
import Subsystems.*;


public class shooterCMD {
    
    Shooter launch= new Shooter();
    private boolean RTrigger= true;

    public void launcher () {
        if(RTrigger){
            String out= launch.Shoot();
            System.out.println(out);
        }
    }
    

    

}
