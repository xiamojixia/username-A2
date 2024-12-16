public class AssignmentTwo {
    public static void main(String[] args) {
        partFourB();
    }

    public void partThree(){
        Ride r1 = new Ride();

        Visitor v1 = new Visitor(1, "Xia1", "Female", "Child", "Group");
        Visitor v2 = new Visitor(2, "Xia2", "Male", "Child", "Family");
        Visitor v3 = new Visitor(3, "Xia3", "Female", "Child", "Family");
        Visitor v4 = new Visitor(4, "Xia4", "Male", "Adult", "Family");
        Visitor v5 = new Visitor(5, "Xia5", "Female", "Adult", "Individual");

        r1.addVisitorToQueue(v1);
        r1.addVisitorToQueue(v2);
        r1.addVisitorToQueue(v3);
        r1.addVisitorToQueue(v4);
        r1.addVisitorToQueue(v5);

        r1.removeVisitorFromQueue();

        r1.printQueue();
    }

    public void partFourA(){
        Ride r2 = new Ride();

        Visitor v1 = new Visitor(1, "Xia1", "Female", "Child", "Group");

        Visitor v6 = new Visitor(6, "Xia6", "Female", "Child", "Group");
        Visitor v7 = new Visitor(7, "Xia7", "Male", "Child", "Family");
        Visitor v8 = new Visitor(8, "Xia8", "Female", "Child", "Family");
        Visitor v9 = new Visitor(9, "Xia9", "Male", "Adult", "Family");
        Visitor v10 = new Visitor(10, "Xia10", "Female", "Adult", "Individual");

        r2.addVisitorToHistory(v6);
        r2.addVisitorToHistory(v7);
        r2.addVisitorToHistory(v8);
        r2.addVisitorToHistory(v9);
        r2.addVisitorToHistory(v10);

        r2.checkVisitorFromHistory(v10);
        r2.checkVisitorFromHistory(v1);

        r2.numberOfVisitors();

        r2.printRideHistory();
    }

    public static void partFourB(){
        Ride r3 = new Ride();

        Visitor v6 = new Visitor(6, "Xia6", "Female", "Child", "Group");
        Visitor v7 = new Visitor(7, "Xia7", "Male", "Child", "Family");
        Visitor v8 = new Visitor(8, "Xia8", "Female", "Child", "Family");
        Visitor v9 = new Visitor(9, "Xia9", "Male", "Adult", "Family");
        Visitor v10 = new Visitor(10, "Xia10", "Female", "Adult", "Individual");

        r3.addVisitorToHistory(v10);
        r3.addVisitorToHistory(v8);
        r3.addVisitorToHistory(v9);
        r3.addVisitorToHistory(v6);
        r3.addVisitorToHistory(v7);

        r3.printRideHistory();

        r3.sortHistory();

        r3.printRideHistory();
    }

    public void partFive(){

    }

    public void partSix(){

    }
    
    public void partSeven(){

    }
}
