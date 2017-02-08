package RealWorldExamples;


public class Meat extends Food {
    public Integer gramsOfProtein;
    public Integer gramsOfFat;
    
    public Meat(){
        gramsOfProtein = 0;
        gramsOfFat = 0;
        super.calories = 0;
        super.sugarAmountInGrams = 0;
      
    }
    
    public void grill(){
        System.out.println("Grilling meat...");
    }
    
    public void boil(){
        System.out.println("Boiling meat...");
    }

    @Override
    public void disposeIfExpired() {
        if (isExpired){
            System.out.println("Throwing out the slimy chicken...");
        }
    }
    

    
    
    
    
}
