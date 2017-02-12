
package ImaginaryObjectExamples;


public class Princess extends Female{
    public Boolean capturedStatus;
    public Integer amountOfTimesCaptured;
    
    public Princess(){
        capturedStatus = false;
        amountOfTimesCaptured = 0;
    }
    
    public void beCapturedByVillain(){
        capturedStatus = true;
        System.out.println("Waiting for a prince to come to the rescue");
        amountOfTimesCaptured += 1;
    }
    
    public void beCompletelyUselessAtBeingAPrincess(){
        System.out.println("Being useless");
    }

    @Override
    public void doMakeup() {
        System.out.println("Putting on fancy Princess level makeup");
    }

    @Override
    public void dressUp() {
        System.out.println("Putting on a fancy Princess level dress");
    }
    
    
    
}
