package Subsystems;

public class Shooter {
    
    public static int shooterResetMotorCanId= 19;
    public static double resetSpeed= .7;
    public static double resetTopLimit= 27.0;
    public static double resetBottomLimit= 0.0;

    public static int shooterLatchCanId= 20;
    public static double latchSpeed= .2;
    public static double latchTopLimit= 1.5;
    public static double latchBottomLimit= 0.0;

    public static String Shoot(){
        
        int thing= 99;
        
        //Shooty shoot shlshkfjhasdhvsakjdfhvikscva
        
        if( thing == (int)(Math.random()*100 ) ){ return "AGGGG WE EPLODED EVERTHING IS ON FIRE";}
        else{ return "Yay we shot";}

    }

}
