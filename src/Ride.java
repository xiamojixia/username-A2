import java.util.LinkedList;
import java.util.Queue;

public class Ride {
    private String rideName ;
    private String rideStatus ; //Open or close
    private Employee operator ;
    private Queue<Visitor> visitorQueue ;

    public Ride(){
        this.rideName = "None" ;
        this.rideStatus = "None" ;
        this.operator = null ;
        this.visitorQueue = new LinkedList<>();
    }

    public Ride(String rideName, String rideStatus, Employee operator){
        this.rideName = rideName ;
        this.rideStatus = rideStatus ;
        this.operator = operator ;
        this.visitorQueue = new LinkedList<>();
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


    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            visitorQueue.add(visitor);
            System.out.println(visitor.getName()+" has been successfully added.");
        }
        else {
            System.out.println("Add failed.");
        }
    }

    public void removeVisitorFromQueue() {

    }

    
    public interface RideInterface {
        void addVisitorToQueue(Visitor visitor);
    
        void removeVisitorFromQueue();
    
        void printQueue();
    
        void runOneCycle();
    
        void addVisitorToHistory(Visitor visitor);
    
        boolean checkVisitorFromHistory(Visitor visitor);
    
        int numberOfVisitors();
    
        void printRideHistory();
    }
}
