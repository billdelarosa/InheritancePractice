
package ImaginaryObjectExamples;


public class Ogre extends Humanoid {
    public String color;
    public String name;
    
    public Ogre(String name){
        super.factionOfCharacter = "Horde";
        super.aliveStatus = true;
        this.name=name;
        color = "green";
    }

    @Override
    public void run() {
        System.out.println("Ogres cannot run, they are too big.");
    }
    
    public void fightAlliance(){
        System.out.println("Now fighting against the Alliance faction");
    }
}
