package RealWorldExamples;


public class Mammal {
    public String speciesName;
    public Integer numberOfLegs;

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    
    public void walk(){
        System.out.println("Going for a walk");
    }
}
