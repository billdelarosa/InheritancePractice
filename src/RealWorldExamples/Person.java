package RealWorldExamples;


public class Person extends Mammal{
    public String name;
    public String gender;

    public Person(){
        super.numberOfLegs = 2;
        super.speciesName = "Human";
    }
    
    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
        super.numberOfLegs = 2;
        super.speciesName = "Human";
    }
    public void speak(){
        System.out.println("Hello, I am a " + speciesName);
    }
}
