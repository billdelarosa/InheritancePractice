
package ImaginaryObjectExamples;


public class Pikachu extends ElectricTypePokemon{
    private Integer attackPower;
    private Integer level;
    
    public Pikachu(){
         level = 1;
         attackPower = 10;
    }

    @Override
    public void battle() {
        System.out.println("Battling with level " + level + " Pikachu!");
    }
    
    public void evolve(){
        System.out.println("Pikachu is evolving into Raichu!");
        attackPower *= 10;
        setName("Raichu");
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    
}
