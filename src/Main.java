import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Students student1 = new Students("Davran", Gender.MALE, "davran@gmail.com");
        Students student2 = new Students("Erjan", Gender.MALE, "Erjan@gmail.com");
        Students students90 = new Students("Elina", Gender.FEMALE, "Elina@gmail.com");


        Students[] Java11Students = {student1, student2};

        Students student3 = new Students("Aigerim", Gender.FEMALE, "aigerim@gmail.com");
        Students student4 = new Students("Farida", Gender.FEMALE, "farida@gmail.com");

        Students[] Java10Students = {student3, student4};

        Students student5 = new Students("Zalkar", Gender.MALE, "zalkar@gmail.com");
        Students student6 = new Students("Alina", Gender.FEMALE, "alina@gmail.com");

        Students[] Js10Students = {student5, student6};

        Students student7 = new Students("Nuraida", Gender.FEMALE, "nuraida@gmail.com");
        Students student8 = new Students("Elnura", Gender.FEMALE, "elnura@gmail.com");

        Students[] Js11Students = {student7, student8};

        Group group = new Group(GroupsName.Java11, Java11Students, Java11Students.length);
        Group group1 = new Group(GroupsName.Java10, Java10Students, Java11Students.length);
        Group group2 = new Group(GroupsName.Js10, Js10Students, Js10Students.length);
        Group group3 = new Group(GroupsName.Js11, Js11Students, Js11Students.length);


        Group[] groups = new Group[]{group, group1, group2};

        Students[][] students = new Students[][]{Js11Students, Js10Students, Java10Students, Java11Students};

        Mentor mentor=new Mentor("Elina", Gender.FEMALE, "zuli@gmail.com", group);
        Mentor mentor1=new Mentor("Aidana", Gender.FEMALE, "aidana@gmail.com", group1);
        Mentor mentor2=new Mentor("Alina", Gender.MALE, "alina@gmail.com", group2);
        Mentor mentor3=new Mentor("Aziz", Gender.MALE, "aziz@gmail.com", group3);
        Mentor[] mentors=new Mentor[]{mentor, mentor1, mentor2, mentor3};

        Peaksoft peaksoft=new Peaksoft("Dubai", mentors, groups, students);


        /*Peaksoft peaksoft1 = new Peaksoft(
                "vostok5",
                new Mentor[]{
                        new Mentor("Zulipa", Gender.FEMALE, "zuli@gmail.com", group),
                        new Mentor("Aidana", Gender.FEMALE, "aidanaMentor@gmail.com", group1),
                        new Mentor("Bilal", Gender.MALE, "bilalMentor@gmail.com", group2),
                        new Mentor("Trash.Kandybek", Gender.MALE, "kandybekMentor@gmail.com", group2)},
                groups, students);

         */
        GroupService groupService = new GroupService(peaksoft);
        MentorService mentorService = new MentorService(groupService);
        StudentService studentService = new StudentService(mentorService);


        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Delete mentor By Id");
        System.out.println("2. Create mentor");
        System.out.println("3. Find mentor by id");
        System.out.println("4. Get mentor by email");
        System.out.println("5. Get all mentor");
        System.out.println("55. Update Mentor");
        System.out.println("---------------------------");
        System.out.println("6. Get all Student");
        System.out.println("7. Search student by name");
        System.out.println("8. Find student by id");
        System.out.println("9. Delete Student by id ");
        System.out.println("10 Create student");
        System.out.println("---------------------------");
        System.out.println("11. Get all groups");
        System.out.println("12. Find group by id");
        System.out.println("13. Delete group by id");
        System.out.println("14. Create group");
        System.out.println("15. Update by id");
        while (true) {
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Delete mentor by id: "+"choose-0, 1, 2, 3");
                    int id= scanner.nextInt();
                    System.out.println(mentorService.deleteMentorById(id));
                    break;
                case 2:
                    System.out.println("Put name");
                    String name= scanner.next();
                    System.out.println("Put email");
                    String email=scanner.next();
                    System.out.println(mentorService.createMentor(new Mentor(name, Gender.MALE, email)));
                    break;
                case 3:
                    System.out.println("Find mentor by id: "+ "choose-0, 1, 2, 3");
                    int id1=scanner.nextInt();
                    mentorService.findById(id1);
                    break;
                case 4:
                    System.out.println("Put email to find mentor");
                    String name1=scanner.next();
                    System.out.println(mentorService.getMentorByEmail(name1));
                    break;
                case 5:
                    System.out.println(Arrays.toString(mentorService.getAllMentors()));
                    break;
                case 6:
                    System.out.println(Arrays.toString(studentService.getAllStudents()));
                    break;
                case 7:
                    System.out.println("Put name to find student");
                    String name2=scanner.next();
                    System.out.println(Arrays.toString(studentService.searchStudentByName(name2)));
                    break;
                case 8:
                    System.out.println("Put id to find student: "+"choose-0, 1, 2, 3, 4, 5, 6, 7");
                    int id2=scanner.nextInt();
                    studentService.findById(id2);
                    break;
                case 9:
                    System.out.println("Delete student by id: "+ "choose-0, 1, 2, 3, 4, 5, 6, 7");
                    int id3=scanner.nextInt();
                    studentService.deleteStudentById(id3);
                    break;
                case 10:
                    System.out.println(studentService.createStudent(students90));
                    System.out.println("Put name");
                    String name22=scanner.next();
                    System.out.println("Put email");
                    String email1=scanner.next();
                    System.out.println(studentService.createStudent(new Students(name22, Gender.FEMALE, email1)));
                    break;
                case 11:
                    System.out.println(Arrays.toString(groupService.getAllGroups()));
                    break;
                case 12:
                    System.out.println("Put id: "+"0, 1, 2, 3");
                    int num3=scanner.nextInt();
                    System.out.println(groupService.findById(num3));
                    break;
                case 13:
                    System.out.println("Delete group put id: "+"0, 1, 2, 3");
                    int num4=scanner.nextInt();
                    groupService.deleteGroupById(num4);
                    break;
                case 14:
                    groupService.createGroup(group3);
                    break;
                case 15:
                    System.out.println("Put any number to update the id of the group");
                    int num5=scanner.nextInt();
                    System.out.println(groupService.updateById(num5, group3));
                case 55:
                    System.out.println(studentService.updateById(8, student1));
            }}}
}