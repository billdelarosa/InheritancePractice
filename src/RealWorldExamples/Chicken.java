package RealWorldExamples;


public class Chicken extends Meat{
    public String seasoning;
    public String weight;
    
    public Chicken (){
        seasoning = "salt";
        super.setGramsOfFat(4);
        super.setGramsOfProtein(10);
    }
    
    public void season(){
        System.out.println("Season the chicken to perfection");
    }
       
    public void eat(){
        System.out.println("Eat the chicken");
    }
    public void serve(){
        System.out.println("Serve up the chicken");
    }
    public void disposeOf(){
        System.out.println("Dispose of the chicken");
    }
    public void cook(){
        System.out.println("Cook the chicken!");
    }

    public String getSeasoning() {
        return seasoning;
    }

    public void setSeasoning(String seasoning) {
        this.seasoning = seasoning;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    

    
}
