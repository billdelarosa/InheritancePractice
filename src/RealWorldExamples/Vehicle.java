package RealWorldExamples;


public class Vehicle extends TransportationMethod {
    private Integer numOfWheels;
    private String licensePlateNumber;
    private  String vehicleColor;
    
    public Vehicle(){
        numOfWheels = 2;
        licensePlateNumber = null;
        vehicleColor = "Red";
    }

    @Override
    public void start() {
        System.out.println("Starting vehicle"); 
    }

    @Override
    public void stop() {
        System.out.println("Stopping vehicle");
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }
    
}
