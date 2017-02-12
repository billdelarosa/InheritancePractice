package RealWorldExamples;


public class Meat extends Food {
    private Integer gramsOfProtein;
    private Integer gramsOfFat;
    
    public Meat(){
        gramsOfProtein = 0;
        gramsOfFat = 0;
    }

    @Override
    public void eat() {
        System.out.println("Eat the meat");
    }

    @Override
    public void serve() {
        System.out.println("Serve the meat");
    }

    @Override
    public void disposeOf() {
        System.out.println("Dispose of the meat");
    }

    @Override
    public void cook() {
        System.out.println("Cook meat");
    }

    public Integer getGramsOfProtein() {
        return gramsOfProtein;
    }

    public void setGramsOfProtein(Integer gramsOfProtein) {
        this.gramsOfProtein = gramsOfProtein;
    }

    public Integer getGramsOfFat() {
        return gramsOfFat;
    }

    public void setGramsOfFat(Integer gramsOfFat) {
        this.gramsOfFat = gramsOfFat;
    }
    
    
}
