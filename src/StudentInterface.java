public interface StudentInterface {

    Students[] getAllStudents();
    Students[] searchStudentByName(String name);
    Students[] sortByStudentName(String ascDesc);
    void deleteStudentById(int id);
    String createStudent(Students students);
    Students updateById(int id, Students students);
    Students [] findById(int id);
}
