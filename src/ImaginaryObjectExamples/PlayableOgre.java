
package ImaginaryObjectExamples;


public class PlayableOgre extends HumanoidTypeCharacter {
    private String color;
    private String name;
    
    public PlayableOgre(String name){
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
    
    @Override
    public void create() {
        System.out.println("Creating playable Ogre character");
    }

    @Override
    public void delete() {
        System.out.println("Deleting playable Ogre Character");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
