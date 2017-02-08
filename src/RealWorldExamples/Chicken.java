package RealWorldExamples;


public class Chicken extends Meat{
    public String seasoning;
    public String age;
    
    public Chicken (){
        seasoning = "salt";
        super.gramsOfFat = 4;
        super.gramsOfProtein = 10;
        super.isExpired = false;
        super.sugarAmountInGrams = 0;
    }

    @Override
    public void grill() {
        System.out.println("Grilling the chicken to perfection...");
    }
    
    @Override
    public void boil() {
        System.out.println("Boiling the chicken...");
    }

    
}
