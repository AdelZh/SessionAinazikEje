import java.util.Arrays;

public class Group {

    public static int idd;
    private int id;
    private GroupsName name;
    private Students[] students;
    private int count;

    public Group(GroupsName name, Students[] students, int count) {
        this.name = name;
        this.students = students;
        this.count = count;
        this.id=idd++;
    }



    public int getId() {
        return id;
    }


    public GroupsName getName() {
        return name;
    }

    public void setName(GroupsName name) {
        this.name = name;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name=" + name +
                ", students=" + Arrays.toString(students) +
                ", count=" + count +
                '}';
    }

}











