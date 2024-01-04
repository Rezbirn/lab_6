public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String group;

    public Student(String firstName, String lastName, String group) {
        setFirstName(firstName);
        setLastName(lastName);
        setGroup(group);
    }

    public Student(int id, String firstName, String lastName, String group) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setGroup(group);
    }

    public void setGroup(String group) {
        if(!group.isEmpty()) {
            this.group = group;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setFirstName(String firstName) {
        if(!firstName.isEmpty()) {
            this.firstName = firstName;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setLastName(String lastName){
        if(!lastName.isEmpty()) {
            this.lastName = lastName;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setId(int id) {
        if(id>=0) {
            this.id = id;
            return;
        }
        throw new IllegalArgumentException();

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGroup(){
        return group;
    }

    public int getId(){
        return id;
    }

    public String showInfo(){
        return "Name: " + firstName + ". Surname: " + lastName + ". Group: " + group + ".";
    }
}
