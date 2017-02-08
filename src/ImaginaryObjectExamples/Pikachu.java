
package ImaginaryObjectExamples;


public class Pikachu extends ElectricType{
    public Integer attackPower;
    public Integer level;
    
    public Pikachu(){
         super.name = "Pikachu";
         super.ability = "Thunder";
         super.type = "Electric";
         level = 1;
         attackPower = 10;
    }

    @Override
    public void battle() {
        System.out.println("Battling with the level " + level + " " + name + "! " + ability + " attack deals " + (level*attackPower) + " damage");
    }
    
    public void evolve(){
        System.out.println("Pikachu is evolving into Raichu!");
        name = "Raichu";
    }
    
}
