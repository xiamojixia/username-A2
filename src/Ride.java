public class Ride {
    private String rideName ;
    private String rideStatus ; //Open or close
    private Employee operator ;

    public Ride(){
        this.rideName = "None" ;
        this.rideStatus = "None" ;
        this.operator = null ;
    }

    public Ride(String rideName, String rideStatus, Employee operator){
        this.rideName = rideName ;
        this.rideStatus = rideStatus ;
        this.operator = operator ;
    }

    public String getRideName() {
        return rideName ;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName ;
    }

    public String getRideStatus() {
        return rideStatus ;
    }

    public void setRideStatus(String rideStatus) {
        this.rideStatus = rideStatus ;
    }

    public Employee getOperator() {
        return operator ;
    }

    public void setOperator(Employee operator) {
        this.operator = operator ;
    }
}
