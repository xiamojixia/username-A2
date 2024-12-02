public class Visitor extends Person {
    private String group ; //Child or adult
    private String ticketType ; //Individual, family, or group

    public Visitor() {
        super();
        this.group = "None";
        this.ticketType = "None";
    }

    public Visitor(int id, String name, String gender, String group, String ticketType) {
        super(id, name, gender);
        this.group = group;
        this.ticketType = ticketType;
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
