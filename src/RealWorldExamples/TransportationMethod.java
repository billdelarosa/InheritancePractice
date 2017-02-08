package RealWorldExamples;


public class TransportationMethod {
    private String travelSpeed;
    public String transportMethodName;
    public Boolean runningStatus = false;
    
    public void start(){
        runningStatus = true;
        System.out.println("Starting transport to destination");
    }
    
    public void stop(){
        runningStatus = false;
        System.out.println("Stopping transportation to destination");
    }
    
    
}
