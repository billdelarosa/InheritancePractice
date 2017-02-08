package ImaginaryObjectExamples;


public class ElectricType extends Pokemon {
    public String ability;
       
    public ElectricType(){
        ability = "Thunderbolt";
        super.name = "Pikachu";
        super.type = "Electric";
    }

    @Override
    public void battle() {
        System.out.println("Battling with the electric type, " + super.name);
    }

    @Override
    public void heal() {
        System.out.println("Healing  " + name + " while trying not to get electrocuted!");
    }
    
}
