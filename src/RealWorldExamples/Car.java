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
        super.transportMethodName = "Car";
        super.numOfWheels = 4;
    }
    
    @Override
    public void start(){
        System.out.println("Starting " + transportMethodName);
    }
    
    @Override
    public void stop(){
        System.out.println("Stopping " + transportMethodName);
    }
}
