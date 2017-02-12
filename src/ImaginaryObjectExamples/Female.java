
package ImaginaryObjectExamples;


public abstract class Female {
    private String hairColor;
    private Integer age;
    
    public Female(){
        age = 18;
        hairColor = "Blonde";
    }
    
    public abstract void doMakeup();
    public abstract void dressUp();

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    
}
