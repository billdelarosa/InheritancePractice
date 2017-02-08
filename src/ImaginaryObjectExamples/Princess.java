
package ImaginaryObjectExamples;


public class Princess extends Female{
    public Boolean capturedStatus = false;
    public Integer amountOfTimesCaptured;
    
    public Princess(){
        super.countryOfResidence = "Japan";
        super.age = 17;
        super.isAlive = true;
        amountOfTimesCaptured = 0;
    }
    
    public void beCapturedByVillain(){
        capturedStatus = true;
        System.out.println("Waiting for Link to come to the rescue");
        amountOfTimesCaptured += 1;
    }
    
    public void beCompletelyUselessAtBeingAPrincess(){
        System.out.println("Being useless");
    }
    
}
