package ImaginaryObjectExamples;


public class ElectricTypePokemon extends Pokemon {
    private String ability;
    private Integer timesAbilityCanBeUsed;
       
    public ElectricTypePokemon(){
        ability = "Thunderbolt";
        timesAbilityCanBeUsed = 10;
    }

    @Override
    public void battle() {
        System.out.println("Battling with the electric type");
    }

    @Override
    public void heal() {
        System.out.println("Healing electric type Pokemon");
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Integer getTimesAbilityCanBeUsed() {
        return timesAbilityCanBeUsed;
    }

    public void setTimesAbilityCanBeUsed(Integer timesAbilityCanBeUsed) {
        this.timesAbilityCanBeUsed = timesAbilityCanBeUsed;
    }
    
}
