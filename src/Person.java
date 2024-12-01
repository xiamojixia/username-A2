public class Person {
    private int id ;
    private String name ;
    private String gender ;
    private String group ; //Child or adult
    private String ticketType ; //Individual, family, or group
    
    public Person(int id, String name, String gender, String group, String ticketType){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.group = group;
        this.ticketType = ticketType;
    }
    
    public Person(){
        this.id = 0;
        this.name = "None";
        this.gender = "None";
        this.group = "None";
        this.ticketType = "None";
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}
