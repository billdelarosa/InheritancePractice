
package ImaginaryObjectExamples;


public class Pokemon {
    
    public String type;
    public String name;
    
    public Pokemon(){
        
    }
    
    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
    }
    
    public void battle(){
        System.out.println("Now battling with " + name + " who is an " + type + " type Pokemon");
    }
    
    public void heal(){
        System.out.println("Using a Potion on " + name);
    }
    
}
