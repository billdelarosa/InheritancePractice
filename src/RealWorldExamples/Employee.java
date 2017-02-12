package RealWorldExamples;


public class Employee extends Person {
    public String jobTitle;
    public Double wages;
    
    public Employee(String name, String job, Double pay){
        jobTitle = job;
        wages = pay;
    }
    
    public void quitJob(){
        System.out.println(super.getName() + " is no longer an employee");
    }
    
    public void walk(){
        System.out.println("Employee is going for a walk instead of working");
    }
    public void makeNoise(){
        System.out.println("Employee is talking, probably to coworkers");
    }
    
}
