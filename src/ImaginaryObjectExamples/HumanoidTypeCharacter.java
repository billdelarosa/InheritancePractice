
package ImaginaryObjectExamples;


public class HumanoidTypeCharacter extends PlayableCharacter {
    private Integer numberOfLimbs = 4;
    private Boolean aliveStatus = true;
    
    public HumanoidTypeCharacter(){
       
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

    @Override
    public void create() {
        System.out.println("Creating new humanoid character");
    }

    @Override
    public void delete() {
        System.out.println("Deleting Humanoid character");
    }

    public Integer getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(Integer numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public Boolean getAliveStatus() {
        return aliveStatus;
    }

    public void setAliveStatus(Boolean aliveStatus) {
        this.aliveStatus = aliveStatus;
    }
    
    
    
}
