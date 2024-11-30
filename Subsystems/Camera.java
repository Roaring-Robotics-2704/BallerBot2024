package Subsystems;
public class Camera {
    public static void Initialise(String ip) throws InterruptedException{
     System.out.println("Search Ethernet Interface for Camera on ip:" + ip);
     System.out.println("Connecting to camera on ip: " + ip);
     System.out.println("Initialise camera");
    }
    public static String ReadCameraPos(){
        return  "Calculated Position:\n x:"+ Math.random() + "\ny:" + Math.random() + "\nAngle:" + Math.random();
    }


}
