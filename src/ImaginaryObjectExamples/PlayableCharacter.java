package ImaginaryObjectExamples;


public abstract class PlayableCharacter {
    private String gender;
    private String race;
    
    public PlayableCharacter(){
        gender = null;
        race = "Human";
    }
    
    public abstract void create();
    public abstract void delete();

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    
}
