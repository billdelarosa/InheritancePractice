
package ImaginaryObjectExamples;


public abstract class Pokemon {
    
    private String pokedexId;
    private String name;
    
    public Pokemon(){
        
    }
    
    public Pokemon(String name, String pokedex){
        this.name = name;
        this.pokedexId = pokedex;
    }
    
    public abstract void battle();
    public abstract void heal();

    public String getPokedexId() {
        return pokedexId;
    }

    public void setPokedexId(String pokedexId) {
        this.pokedexId = pokedexId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
