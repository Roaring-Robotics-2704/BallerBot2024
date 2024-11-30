package Subsystems;

public class Drivetrain {
    int FrontLeftMovingMotorCanID = 1;
    int FrontRightMovingMotorCanID = 2;
    int BackLeftMovingMotorCanID = 3;
    int BackRightMovingMotorCanID = 4;
    int FrontLeftTurningMotorCanID = 5;
    int FrontRightTurningMotorCanID = 6;
    int BackLeftTurningMotorCanID = 7;
    int BackRightTurningMotorCanID = 8;

    double SpeedLimits = 0;
    double AngularLimits = 0;
    double Speed = 0;

    public String giveDirection() {
        System.out.println("direction");
        return "direction";
    }
}
