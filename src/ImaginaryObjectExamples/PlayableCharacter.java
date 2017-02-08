package ImaginaryObjectExamples;


public class PlayableCharacter {
    public String factionOfCharacter;
    public String realmOfCharacter;
    
    public PlayableCharacter(){
        factionOfCharacter = null;
        realmOfCharacter = "Beginner";
    }
    
    public void create(){
        System.out.println("Creating a playable character on the " + realmOfCharacter + " realm");
    }
    
    public void delete(){
        System.out.println("Deleting character");
    }
}
