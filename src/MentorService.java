import java.util.Arrays;

public class MentorService implements MentorInterface {


    private GroupService groupService;
    private Mentor[] mentors;
    private int mentorCount = 0;

    public MentorService(GroupService groupService) {

        this.groupService = groupService;
    }


    public GroupService getGroupService() {
        return groupService;
    }


    @Override
    public Mentor getMentorByEmail(String email) {
        Mentor[] oldMentor = groupService.getPeaksoft().getMentors();
        for (int i = 0; i < oldMentor.length; i++) {
            if (oldMentor[i].getEmail().equals(email)) {
                System.out.println(oldMentor[i]);
            }
        }
        return null;

    }

    @Override
    public Students[] getAllMentors() {
        Mentor[] oldMentor = groupService.getPeaksoft().getMentors();
        for (int i = 0; i < oldMentor.length; i++) {
            System.out.println(oldMentor[i]);
        }

        return null;
    }

    @Override
    public String deleteMentorById(int id) {
        boolean trueLine = false;
        Mentor[] oldMentors = Arrays.copyOf(groupService.getPeaksoft().getMentors(), groupService.getPeaksoft().getMentors().length);
        Mentor[] mentors = new Mentor[oldMentors.length - 1];
        for (int i = 0; i < oldMentors.length - 1; i++) {
            if (!trueLine && oldMentors[i].getId() != id) {
                mentors[i] = oldMentors[i];
            } else {
                trueLine = true;
            }
            if (trueLine) {
                mentors[i] = oldMentors[i + 1];
            }
        }
        groupService.getPeaksoft().setMentors(mentors);
        for (int j = 0; j < groupService.getPeaksoft().getMentors().length; j++) {
            groupService.getPeaksoft().getMentors()[j].setId(j);
            Mentor.idd = j + 1;

        }
        return Arrays.toString(mentors);
    }

    @Override
    public String createMentor(Mentor mentor) {
        Mentor[] newMassive;
        newMassive = Arrays.copyOf(groupService.getPeaksoft().getMentors(), groupService.getPeaksoft().getMentors().length + 1);
        newMassive[newMassive.length - 1] = mentor;
        groupService.getPeaksoft().setMentors(newMassive);

        for (int j = 0; j < newMassive.length; j++) {
            groupService.getPeaksoft().getMentors()[j].setId(j);
            Mentor.idd = j + 1;
        }
        return Arrays.toString(newMassive);
    }


    @Override
    public Mentor updateById(int id, Mentor mentor) {
        Mentor [] oldMentor=groupService.getPeaksoft().getMentors();
        for(int i=0; i<oldMentor.length; i++){
            if(oldMentor[i].getId()==id){
                oldMentor[i].setEmail(oldMentor[i].getEmail());
                oldMentor[i].setName(oldMentor[i].getName());
                oldMentor[i].setGender(oldMentor[i].getGender());
                oldMentor[i].setGroup(oldMentor[i].getGroup());
                return groupService.getPeaksoft().getMentors()[i];
            }
        }
        return mentor;
    }

    @Override
    public void findById(int id) {
        Mentor [] oldMentor=groupService.getPeaksoft().getMentors();
      for(int i=0; i<oldMentor.length; i++){
          if(oldMentor[i].getId()==id){
              System.out.println(oldMentor[i]);
          }
      }

    }

}
