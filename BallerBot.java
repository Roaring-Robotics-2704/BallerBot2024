import Subsystems.ConfettiLauncher;
import Subsystems.Drivetrain;

public class BallerBot{
    private static ConfettiLauncher confettiLauncher=new ConfettiLauncher();
    private static Drivetrain Swerve = new Drivetrain();
    public static void main(String[]args){
        confettiLauncher.ConfettiLaunched();
        Swerve.giveDirection();
    }
}
