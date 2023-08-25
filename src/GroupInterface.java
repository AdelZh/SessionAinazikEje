public interface GroupInterface {

    Group[] getAllGroups();
    Group getGroupByName(String name);
    void deleteGroupById(int id);
    Group [] createGroup(Group group);
    Group updateById(int id, Group group);
    Group findById(int id);
}

