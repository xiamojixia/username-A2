public class Employee extends Person {
    private String employmentType ; //Regular or temporary
    private String operate ; //The name of the machine operated by this person

    public Employee() {
        super();
        this.employmentType = "None";
        this.operate = "None";
    }

    public Employee(int id, String name, String gender, String employmentType, String operate) {
        super(id, name, gender);
        this.employmentType = employmentType;
        this.operate = operate;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }
}
