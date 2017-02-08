package RealWorldExamples;


public class Vehicle extends TransportationMethod {
    public Integer numOfWheels;
    public String licensePlateNumber;
    
    public Vehicle(){
        super.transportMethodName = "Motorcycle";
        numOfWheels = 2;
        super.runningStatus = false;
    }

    @Override
    public void start() {
        System.out.println("Starting " + transportMethodName); 
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + transportMethodName);
    }
}
