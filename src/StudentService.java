import java.util.Arrays;

public class StudentService implements StudentInterface {


    private MentorService mentorService;
    private Peaksoft peaksoft;




    public StudentService(MentorService mentorService) {
        this.mentorService = mentorService;
    }




    @Override
    public Students[] getAllStudents() {
        Students [] newStudents=mentorService.getGroupService().getPeaksoft().getStudents();
        for(int i=0; i<newStudents.length; i++){
            System.out.println("My students");
            break;
        }
        return newStudents;
    }

    @Override
    public Students[] searchStudentByName(String name) {
        boolean found=false;
        Students [] newStudent=mentorService.getGroupService().getPeaksoft().getStudents();
        for(int i=0; i<newStudent.length; i++){
            if(newStudent[i].getName().equals(name)){
                found=true;
                System.out.println(newStudent[i]);
            }
        }if(!found){
            System.out.println("Not found");
        }
        return null;
    }

    @Override
    public Students[] sortByStudentName(String ascDesc) {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {
        int indexToRemove = -1;
        Students[] oldStudents = mentorService.getGroupService().getPeaksoft().getStudents();
        for (int i = 0; i < oldStudents.length; i++) {
            if (oldStudents[i].getId() == id) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            Students[] newStudent = new Students[oldStudents.length + 1];
            int j = 0;
            for (int i = 0; i < oldStudents.length; i++) {
                if (i != indexToRemove) {
                    newStudent[i] = oldStudents[i];
                    j++;
                }
            }
            oldStudents = Arrays.copyOf(newStudent, newStudent.length - 1);
            System.out.println(Arrays.toString(oldStudents));

        }
       // for (int j = 0; j < mentorService.getGroupService().getPeaksoft().getStudents().length; j++) {
          //  mentorService.getGroupService().getPeaksoft().getStudents()[j].setId(j);



        }

        @Override
    public String createStudent(Students students) {
        boolean isExist = false;
        Students[] oldStudents = mentorService.getGroupService().getPeaksoft().getStudents();
        for (int i = 0; i < oldStudents.length; i++) {
            if (oldStudents[i].equals(students)) {
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            Students[] newStudent = Arrays.copyOf(oldStudents, oldStudents.length + 1);
            newStudent[oldStudents.length] = students;
            oldStudents = newStudent;
            mentorService.getGroupService().getPeaksoft().setStudents(newStudent);
           // System.out.println(Arrays.toString(oldStudents));

            }
        System.out.println(Arrays.toString(oldStudents));
       // for (int j=0; j<mentorService.getGroupService().getPeaksoft().getStudents().length; j++){
          //  mentorService.getGroupService().getPeaksoft().getStudents()[j].setId(j);
            return "Added";

        }

        @Override
    public Students updateById(int id, Students students) {
       Students [] oldStudent=mentorService.getGroupService().getPeaksoft().getStudents();
       for(int i=0; i<oldStudent.length; i++){
           if(oldStudent[i].getId()==id){
               mentorService.getGroupService().getPeaksoft().getStudents()[i].setName(students.getName());
               mentorService.getGroupService().getPeaksoft().getStudents()[i].setGender(students.getGender());
               mentorService.getGroupService().getPeaksoft().getStudents()[i].setEmail(students.getEmail());
              return mentorService.getGroupService().getPeaksoft().getStudents()[i];
           }
       }
       return students;
    }

    @Override
    public Students [] findById(int id) {
        Students[] students = mentorService.getGroupService().getPeaksoft().getStudents();
       for(int i=0; i<students.length; i++){
           if(students[i].getId()==id){
               System.out.println(students[i]);
           }
       }
       return students;
    }
}

