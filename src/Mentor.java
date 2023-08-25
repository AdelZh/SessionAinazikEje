public class Mentor {

    public static int idd;
    private int id;

    private String name;
    private Gender gender;
    private String email;
    private Group group;

    public Mentor(){

    }

    public Mentor(String name, Gender gender, String email, Group group) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.group = group;
        this.id=idd++;
    }
    public Mentor(String name, Gender gender, String email){
        this.name=name;
        this.gender=gender;
        this.email=email;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "\nid=" + id +
                "\nname='" + name + '\'' +
                "\ngender=" + gender +
                "\nemail='" + email + '\'' +
                "\ngroup=" + group +
                "\n}";
    }

}

