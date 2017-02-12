package RealWorldExamples;


public class Person extends Mammal{
    private String name;
    private String gender;

    public Person(){
        name = "Bob";
        gender = "Male";
    }
    
    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    
    public void liveLife(){
        System.out.println("Living life, doing normal Person things");
    }

    @Override
    public void walk() {
        System.out.println("Person is going for a walk");
    }

    @Override
    public void makeNoise() {
        System.out.println("Person is making ambiguous noises");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
