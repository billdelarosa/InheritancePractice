/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImaginaryObjectExamples;

/**
 *
 * @author Billy-Mac
 */
public class PrincessZelda extends Princess {
    private String magicAbility;
    private Boolean hasThePowerToSaveWorld;
    
    public PrincessZelda(){
        magicAbility = "Fireball";
        hasThePowerToSaveWorld = true;
    }

    @Override
    public void dressUp() {
        System.out.println("Putting on Princess Zelda's signature dress");
    }

    @Override
    public void doMakeup() {
        System.out.println("Putting on Princess Zelda's weird makeup");
    }

    @Override
    public void beCompletelyUselessAtBeingAPrincess() {
        System.out.println("Being useless at being a video game character princess");
    }

    @Override
    public void beCapturedByVillain() {
        System.out.println("Got captured again");
    }

    public Boolean getHasThePowerToSaveWorld() {
        return hasThePowerToSaveWorld;
    }

    public void setHasThePowerToSaveWorld(Boolean hasThePowerToSaveWorld) {
        this.hasThePowerToSaveWorld = hasThePowerToSaveWorld;
    }
    
   
}
