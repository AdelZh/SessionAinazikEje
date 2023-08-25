public class Students {

    private int id;
    private static int idd;
    private String name;
    private Gender gender;
    private String email;

    public Students(String name, Gender gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.id=idd++;
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

    @Override
    public String toString() {
        return "Students{" +
                "\nid=" + id +
                "\nname='" + name + '\'' +
                "\ngender=" + gender +
                "\nemail='" + email + '\'' +
                "\n}";
    }

}





















