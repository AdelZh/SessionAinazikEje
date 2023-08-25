import java.util.Arrays;

public class GroupService implements GroupInterface {
    private Peaksoft peaksoft;


    public GroupService(Peaksoft peaksoft) {
        this.peaksoft = peaksoft;
    }


    public Peaksoft getPeaksoft() {
        return peaksoft;
    }

    public void setPeaksoft(Peaksoft peaksoft) {
        this.peaksoft = peaksoft;
    }


    @Override
    public Group[] getAllGroups() {
        Group[] newGroup = getPeaksoft().getGroups();
        for (int i = 0; i < newGroup.length; i++) {
            System.out.println("This is my groups");
            break;
        }
        return newGroup;
    }

    @Override
    public Group getGroupByName(String name) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {
        int indexToRemove = -1;
        Group[] groups = getPeaksoft().getGroups();
        for (int i = 0; i < groups.length; i++) {
            if (groups[i].getId() == id) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            Group[] newGroup = new Group[groups.length + 1];
            int j = 0;
            for (int i = 0; i < groups.length; i++) {
                if (i != indexToRemove) {
                    newGroup[i] = groups[i];
                    j++;
                }
            }
            groups = Arrays.copyOf(newGroup, newGroup.length - 1);


        }

        System.out.println(Arrays.toString(groups));


        }


    @Override
    public Group [] createGroup(Group group) {
        boolean isExist=false;
        Group [] groups=getPeaksoft().getGroups();
        for(int i=0; i<groups.length; i++){
            if(groups[i].equals(group)){
                isExist=true;
                break;
            }
        }if(!isExist){
            Group [] newGroup=Arrays.copyOf(groups, groups.length+1);
            newGroup[groups.length]=group;
            groups=newGroup;
            getPeaksoft().setGroups(groups);
            System.out.println(Arrays.toString(groups));
        }
        System.out.println(Arrays.toString(groups));
        return groups;
    }




    @Override
    public Group updateById(int id, Group group) {
        for (int i = 0; i < peaksoft.getGroups().length; i++) {
            if (peaksoft.getGroups()[i].getId()==id){
                peaksoft.getGroups()[i].setName(group.getName());
                peaksoft.getGroups()[i].setStudents(group.getStudents());
                peaksoft.getGroups()[i].setCount(group.getCount());
                return peaksoft.getGroups()[i];

            }
        }
        return group;
    }


    @Override
    public Group findById(int id) {
       Group [] groups=getPeaksoft().getGroups();
       for(int i=0; i<groups.length; i++){
           if(groups[i].getId()==id){
               System.out.println(groups[i]);
           }
       }
       return null;
    }
}























