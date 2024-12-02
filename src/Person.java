public abstract class Person {
    private int id ;
    private String name ;
    private String gender ;

    public Person(int id, String name, String gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    
    public Person(){
        this.id = 0;
        this.name = "None";
        this.gender = "None";
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
}
