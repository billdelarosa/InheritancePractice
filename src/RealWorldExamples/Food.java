package RealWorldExamples;


public class Food {
    public Integer calories;
    public Integer sugarAmountInGrams;
    public Boolean isExpired = false;
    
    public Food(){
        calories = 0;
        sugarAmountInGrams = 0;
    }
    
    public Food(Integer cal, Integer sug){
        calories = cal;
        sugarAmountInGrams = sug;
    }
    
    public void serve(){
        System.out.println("Food is served!");
    }
    
    public void disposeIfExpired(){
        if (isExpired){
            System.out.println("Food is expired, throwing it out");
        }
    }
}
