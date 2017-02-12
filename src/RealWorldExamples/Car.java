/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealWorldExamples;


public class Car extends Vehicle {
    private String brand;
    private String engineType;
    private Boolean runningStatus = false;
    
    public Car(){
        super.setMaxSpeed("100 MPH");
    }
    
    @Override
    public void start(){
        System.out.println("Starting " + brand + " car with " + engineType + " type motor");
    }
    
    @Override
    public void stop(){
        System.out.println("Stopping " + brand + " car");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Boolean getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(Boolean runningStatus) {
        this.runningStatus = runningStatus;
    }
    
}
