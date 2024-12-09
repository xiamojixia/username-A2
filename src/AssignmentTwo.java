public class AssignmentTwo {
    public static void main(String[] args) {
        partThree();
    }

    public static void partThree(){
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

    }

    public void partFourB(){

    }

    public void partFive(){

    }

    public void partSix(){

    }
    
    public void partSeven(){

    }
}
