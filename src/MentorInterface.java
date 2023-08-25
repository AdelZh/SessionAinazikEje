public interface MentorInterface {
    Mentor getMentorByEmail(String email);
    Students[] getAllMentors();
    String deleteMentorById(int id);
    String createMentor(Mentor mentor);
    Mentor updateById(int id, Mentor mentor);
    void findById(int id);

}
