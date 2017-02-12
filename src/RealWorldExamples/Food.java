package RealWorldExamples;


public abstract class Food {
    private Integer calories;
    private Integer sugarAmountInGrams;
    private Boolean isExpired = false;
    
    public Food(){
        calories = 0;
        sugarAmountInGrams = 0;
    }
    
    public Food(Integer cal, Integer sug){
        calories = cal;
        sugarAmountInGrams = sug;
    }
    
    public abstract void eat();
    public abstract void serve();
    public abstract void disposeOf();
    public abstract void cook();

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getSugarAmountInGrams() {
        return sugarAmountInGrams;
    }

    public void setSugarAmountInGrams(Integer sugarAmountInGrams) {
        this.sugarAmountInGrams = sugarAmountInGrams;
    }

    public Boolean getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
    }
    
    
    }

