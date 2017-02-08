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
public class Zelda extends Princess {
    
    public Zelda(){
        super.amountOfTimesCaptured = 0;
        super.age = 17;
        super.capturedStatus = false;
        super.isAlive = true;
    }

    @Override
    public void dressUp() {
        System.out.println("Putting on a nice princess dress");
    }

    @Override
    public void doMakeup() {
        System.out.println("Putting on pretty princess makeup");
    }

    @Override
    public void beCompletelyUselessAtBeingAPrincess() {
        System.out.println("Being useless at being a video game character princess");
    }

    @Override
    public void beCapturedByVillain() {
        System.out.println("Got captured again");
    }
   
}
