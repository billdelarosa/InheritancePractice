package RealWorldExamples;


public abstract class Mammal {
    private String age;
    private Integer numberOfLegs;

    public abstract void walk();
    public abstract void makeNoise();
    
    
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

}
