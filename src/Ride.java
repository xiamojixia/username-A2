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
        visitorQueue.add(visitor);
        boolean isAdded = false;
        for (Visitor v : visitorQueue) {
            if (v.getName().equals(visitor.getName())) {
                isAdded = true;
                break;
            }
        }
        if (isAdded == true){
            System.out.println(visitor.getName()+" has been successfully added.");
            System.out.println("------------------------------");
        }
        else {
            System.out.println(visitor.getName()+" add failed.");
            System.out.println("------------------------------");
        }
    }

    public void removeVisitorFromQueue() {
        if (!visitorQueue.isEmpty()) {
            Visitor removedVisitor = visitorQueue.poll();
            System.out.println(removedVisitor.getName() + " has been removed from the queue.");
            System.out.println("------------------------------");
        }
        else {
            System.out.println("No visitors in the queue to remove.");
        }
    }

    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("There are currently no visitors in Queue.");
            return;
        }
        System.out.println("The current visitors are as follows:");
        for (Visitor visitor : visitorQueue) {
            System.out.println("Id: " + visitor.getId());
            System.out.println("Name: " + visitor.getName());
            System.out.println("Gender: " + visitor.getGender());
            System.out.println("Group: " + visitor.getGroup());
            System.out.println("TicketType: " + visitor.getTicketType());
            System.out.println("------------------------------");
        }
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
