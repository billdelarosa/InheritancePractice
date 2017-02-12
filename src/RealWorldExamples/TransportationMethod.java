package RealWorldExamples;


public abstract class TransportationMethod {
    private String maxSpeed;
    public Boolean runningStatus = false;
    
    public abstract void start();
    public abstract void stop();

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Boolean getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(Boolean runningStatus) {
        this.runningStatus = runningStatus;
    }
    
    
}
