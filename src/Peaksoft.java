import java.util.Arrays;

public class Peaksoft {

    private String address;
    private Mentor[] mentors;
    private Group[] groups;
    private Students[] students;

    public Peaksoft(String address, Mentor[] mentors, Group[] groups, Students[][] Mystudents) {
        this.address = address;
        this.mentors = mentors;
        this.groups = groups;
        students = new Students[Mystudents.length * Mystudents[0].length];
        int index = 0;

        for (int i = 0; i < Mystudents.length; i++) {
            for (int j = 0; j < Mystudents[i].length; j++) {
                students[index] = Mystudents[i][j];
                index++;
            }
        }

    }




    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Group[] getGroups() {
        return groups;
    }
    public Students[] getStudents() {
        return students;
    }



    @Override
    public String toString() {
        return "Peaksoft{" +
                "address='" + address + '\'' +
                ", mentors=" + Arrays.toString(mentors) +
                ", groups=" + Arrays.toString(groups) +
                ", students=" + Arrays.toString(students) +
                '}';
    }

}


