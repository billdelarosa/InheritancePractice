package RealWorldExamples;


public class Employee extends Person {
    public String jobTitle;
    public Double wages;
    
    public Employee(String name, String job, Double pay){
        super.name = name;
        jobTitle = job;
        wages = pay;
    }
    
    
    @Override
    public void speak(){
        System.out.println("Hello, I am an employee named " + super.name + ". My species is " + super.speciesName);
    }
}
