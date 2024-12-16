import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride {
    private String rideName ;
    private String rideStatus ; //Open or close
    private Employee operator ;
    private Queue<Visitor> visitorQueue ;
    private LinkedList<Visitor> rideHistory;

    public Ride(){
        this.rideName = "None" ;
        this.rideStatus = "None" ;
        this.operator = null ;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, String rideStatus, Employee operator){
        this.rideName = rideName ;
        this.rideStatus = rideStatus ;
        this.operator = operator ;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
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
            System.out.println("------------------------------");
        }
    }

    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("There are currently no visitors in Queue.");
            System.out.println("------------------------------");
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

    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName()+" has been successfully added to ride history.");
        System.out.println("------------------------------");
    }

    public boolean checkVisitorFromHistory(Visitor visitor) {
        for (Visitor v : rideHistory) {
            if (v.equals(visitor)) {
                System.out.println(visitor.getName() + " is found in the ride history.");
                System.out.println("------------------------------");
                return true;
            }
        }    
        System.out.println("No History.");
        System.out.println("------------------------------");
        return false;
    }

    public int numberOfVisitors() {
        System.out.println("Total visitors in the ride history: " + rideHistory.size());
        System.out.println("------------------------------");
        return rideHistory.size();
    }
    
    public void printRideHistory() {
        if (!rideHistory.isEmpty()) {
            System.out.println("Ride History:");
            Iterator<Visitor> iterator = rideHistory.iterator();
            while (iterator.hasNext()) {
                Visitor visitor = iterator.next();
                System.out.println("Id: " + visitor.getId());
                System.out.println("Name: " + visitor.getName());
                System.out.println("Gender: " + visitor.getGender());
                System.out.println("Group: " + visitor.getGroup());
                System.out.println("TicketType: " + visitor.getTicketType());
                System.out.println("------------------------------");
            }
        }
        else {
            System.out.println("Ride History record is empty.");
            System.out.println("------------------------------");
            return;
        }
    }

    public void sortHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No History.");
            System.out.println("------------------------------");
            return;
        }
        Collections.sort(rideHistory, new VisitorSorting());
        System.out.println("Ride history has been successfully sorted.");
        System.out.println("------------------------------");
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
