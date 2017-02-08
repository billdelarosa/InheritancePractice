
package ImaginaryObjectExamples;


public class Humanoid extends PlayableCharacter {
    public final Integer numberOfLimbs = 4;
    public Boolean aliveStatus = true;
    
    public Humanoid(){
        super.factionOfCharacter = "Alliance";
    }
    
    public void run(){
        System.out.println("Humanoid being is now running...");
    }
    
    public void checkIfAlive(){
        if (aliveStatus){
            System.out.println("Humanoid is still alive");
        } else {
            System.out.println("Humanoid is not alive");
        }
    }
}
