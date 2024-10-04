/*
NOTES:
this program is developed on intellij
how to run on apache netbeans?
copy Main folder (folder that includes Main.java, People.java, Student.java, Subject.java
then create a new apache netbeans project
after that, paste the Main folder in Source Packages

still not running?
here is the software run on apache netbeans ide 22:
https://github.com/marhosa/dump_javaoop/tree/main/JavaApplication24

 */



package Main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static void confirm(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPress Enter to continue... ");
        scan.nextLine();
    }

    static boolean studentExists(int SN, List<Student> students) {
        for (Student student : students) {
            if(student.getStudent_number() == SN){
                return true;
            }
        }
        return false;
    }

    static void listStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getLastName() + " " + student.getFirstName() + "  #" + student.getStudent_number());
        }
    }

    static void listSubjects(List<Subject> subjects) {
        for (Subject subject : subjects) {
            System.out.println(subject.getSubject_Name() + "  #" + subject.getSubject_Code());
        }
    }



    static void listsubmenu(){
        System.out.println("--- actions ---");
        System.out.println("[1] Add Student from course");
        System.out.println("[2] Remove Student from course");
        System.out.println("[3] Change Student Grade");
        System.out.println("[4] List registered students by Grade");
    }


    static void spacer(int x){
        for (int i = 0; i < x + 1; i++){
            System.out.println("");
        }
    }

    static void printMainMenu(){
        System.out.println("---------------------------------");
        System.out.println("STUDENT MANAGING PORTAL\n");
        System.out.println("[1] ADD/REMOVE STUDENT");
        System.out.println("[2] ADD/REMOVE SUBJECT");
        System.out.println("\n[3] MODIFY SUBJECT");
        System.out.println("\n[4] SEARCH STUDENT (frequently used)");
        System.out.println("\n[5] LIST STUDENTS RANKED BY GWA");
        System.out.println("[6] LIST ALL STUDENTS and their INFO");
        System.out.println("[7] LIST ALL SUBJECT INFO WITH HIGHEST/LOWEST MARK AND COURSE CODE");
        System.out.println("\n[8] help and test case guide");
        System.out.println("[9] EXIT THE PROGRAM (progress will be lost)");
        System.out.println("---------------------------------");
    }

    static void howtobasic(){
        spacer(50);
        System.out.println("---------------------------------------------");
        System.out.println("how to do the test cases?");
        System.out.println("     Test Case 1, Inputting a Student Grade for Multiple Subjects.");
        System.out.println("         - First Add Students (refer to mainmenu option 1)");
        System.out.println("         - Then Add Subjects (refer to mainmenu option 2)");
        System.out.println("         - Finally, enroll the STUDENTS to the created SUBJECTS manually");
        System.out.println("           (mainmenu option 3 --> submenu option 1\n");
        System.out.println("     Test Case 2, Search a student by name.");
        System.out.println("         - simply click on mainmenu option 4");
        System.out.println("         - then input either the FIRST NAME or LAST NAME or STUDENT NUMBER of the student\n");
        System.out.println("     Test Case 3, Adding a new Subject.");
        System.out.println("         - choose option 2 on mainmenu, then choose create a subject");
        System.out.println("         - you can add enroll the students manually to the subjects via mainmenu option 3\n");
        System.out.println("     Test Case 4, Ranking students by their average marks");
        System.out.println("         - choose option 5 on the mainmenu, automatically sorts the students in an descending order\n");
        System.out.println("     Test Case 5, Updating Student Marks");
        System.out.println("         - You can manually update certain grades of the student via mainmenu option 3");
        System.out.println("         - then go to submenu option 3\n");
        System.out.println("     Test Case 6, Validating input marks");
        System.out.println("         - everything on the mainmenu option 3 submenu only limits student grades from 0 to 100\n");
        System.out.println("     Test Case 7, Display Subject-Wise Highest and Lowest Marks");
        System.out.println("         - You can see the Highest and Lowest Marks per subject via mainmenu option 7\n");
        System.out.println("     Test Case 8, Search for a student not in a system.");
        System.out.println("         - You can try it on option 4, and even on option 3, submenus\n");
        System.out.println("     Test Case 9, Input validation for number of students and subjects");
        System.out.println("         - The program uses dynamic lists to store the objects of people and subjects\n");
        System.out.println("     Test Case 10, Search with case sensitivity");
        System.out.println("         - mainmenu option 4 offers this feature");
        System.out.println("           this feature on option 3 submenus are discouraged as there are chances that some students");
        System.out.println("           you can have the same last name and same first name, or even both.");
        System.out.println("           which is the purpose of the student number as a unique identifier\n\n");
        System.out.println("INFORMATION ABOUT THIS CODE");
        System.out.println("     Sorting Algorithm: Bubble Sort");
        System.out.println("     Search Algorithm: Linear Search");
        System.out.println("     More info at https://github.com/marhosa/OOP_TeacherView_StudentPortal\n\n\n (scroll up heheuheu)");

        confirm();
    }

    static int generateStudentNum(int x){
        return 2027000 + x;
    }

    static int generateCourseCode(int x){
        return 69000 + x;
    }

    public static void main(String[] args) {

        spacer(50);
        Scanner sc = new Scanner(System.in);
        int main_choice;

        //List that stores Subjects and Students
        List<Student> students = new ArrayList<>();
        List<Subject> subjects = new ArrayList<>();

        //declares temp variables
        String firstname;
        String lastname;
        int studentnumtemp;
        boolean tempflag;
        String subjectname;
        int numofstudentstemp;
        int subjectcodetemp;
        int studentgradetemp;
        String studentnametemp;
        float studentgwa;
        int studentsubcount;

        //iterator of the student number and subcount
        //notes: MUST NEVER DECREMENT!
        int studentcount = 1;
        int subjectcount = 1;


        while(true){
            spacer(50);
            printMainMenu();
            System.out.print("Input Choice: ");
            main_choice = sc.nextInt();
            switch (main_choice){

                case 1: //adds/removes student
                    System.out.println("[1]Add or [2]Remove?");
                    System.out.print("Choice: ");
                    main_choice = sc.nextInt();
                    sc.nextLine();

                    if (main_choice == 1){
                        System.out.print("First Name: ");
                        firstname = sc.nextLine();
                        System.out.print("Last Name : ");
                        lastname = sc.nextLine();
                        students.add(new Student(firstname, lastname, generateStudentNum(studentcount)));
                        studentcount++;
                        confirm();
                    }
                    else if (main_choice == 2){
                        if(students.isEmpty()){
                            System.out.println("Cannot remove, student list is empty...");
                            confirm();
                            break;
                        }
                        listStudents(students);
                        System.out.print("Input Student Number: ");
                        studentnumtemp = sc.nextInt();
                        sc.nextLine();
                        tempflag = false;
                        for (Student student : students) {
                            if(student.getStudent_number() == studentnumtemp){

                                for(Subject subs : subjects){
                                    subs.removeStudent(student.getStudent_number());
                                }

                                students.remove(student);
                                System.out.println("Student " + studentnumtemp + " has been removed");
                                tempflag = true;
                                confirm();
                                break;
                            }
                        }
                        if(!tempflag){
                            System.out.println("STUDENT NOT FOUND...");
                            confirm();
                        }
                        break;
                    }
                    else if (main_choice == 3){
                        System.out.println("Invalid Choice...");
                        confirm();
                    }
                    break;
                case 2:
                    System.out.println("[1]Add or [2]Remove?");
                    System.out.print("Choice: ");
                    main_choice = sc.nextInt();
                    sc.nextLine();

                    if (main_choice == 1){
                        System.out.print("Subject Name: ");
                        subjectname = sc.nextLine();
                        subjects.add(new Subject(subjectname, generateCourseCode(subjectcount)));
                        subjectcount++;
                        confirm();
                    }
                    else if (main_choice == 2){
                        if(subjects.isEmpty()){
                            System.out.println("Cannot remove, subject list is empty...");
                            confirm();
                            break;
                        }
                        spacer(3);
                        listSubjects(subjects);
                        spacer(1);
                        System.out.print("Subject Code Number: ");
                        subjectcodetemp = sc.nextInt();
                        tempflag = false;
                        for (Subject subs : subjects) {
                            if(subs.getSubject_Code() == subjectcodetemp){ //why error?
                                subjects.remove(subs);
                                System.out.println("Subject " + subjectcodetemp + " has been removed");
                                confirm();
                                tempflag = true;
                                break;
                            }
                        }
                        if(!tempflag){
                            System.out.println("SUBJECT NOT FOUND...");
                            confirm();
                        }
                        break;
                    }
                    else if (main_choice == 3){
                        System.out.println("Invalid Choice...");
                        confirm();
                    }
                    break;

                case 3:
                    spacer(5);
                    if(subjects.isEmpty()){
                        System.out.println("NO SUBJECTS...");
                        confirm();
                        break;
                    }
                    spacer(50);
                    listSubjects(subjects);
                    System.out.print("Input Subject Code: ");
                    subjectcodetemp = sc.nextInt();
                    spacer(50);
                    tempflag = false;
                    for (Subject subs : subjects) {
                        if(subs.getSubject_Code() == subjectcodetemp){
                            System.out.println("-------\nSubject " + subjectcodetemp + " Exists\nSubject Name is " +subs.getSubject_Name() + "\nWith a total of " + subs.enrolledStudentsTotal() + " ENROLLED students");
                            tempflag = true;

                            spacer(2);
                            listsubmenu();
                            System.out.print("Choice: ");
                            main_choice = sc.nextInt();

                            switch(main_choice){
                                //add student from course
                                case 1:
                                    spacer(5);
                                    if(subs.enrolledStudentsTotal() == subs.getMax_Students()){
                                        System.out.println("Cannot Add, COURSE has no more SLOTS");
                                        confirm();
                                        break;
                                    }
                                    boolean no_available_students_to_add = true;
                                    for (Student student : students) {
                                        if(!subs.isEnrolled(student.getStudent_number())) {
                                            System.out.println(student.getLastName() + " " + student.getFirstName() + "  #" + student.getStudent_number());
                                            no_available_students_to_add = false;
                                        }
                                    }

                                    if(no_available_students_to_add){
                                        System.out.println("ALL students are TAKING this subject!");
                                        confirm();
                                        break;
                                    }

                                    System.out.print("Enter Student Number to ADD: ");
                                    studentnumtemp = sc.nextInt();

                                    if(subs.isEnrolled(studentnumtemp)){
                                        System.out.println("Student Already Exists!");
                                        confirm();
                                        break;
                                    }
                                    if(!studentExists(studentnumtemp, students)){
                                        System.out.println("Student does not Exist!");
                                        confirm();
                                        break;
                                    }

                                    System.out.print("Enter Student Grade: ");
                                    studentgradetemp = sc.nextInt();
                                    while(studentgradetemp > 100 || studentgradetemp < 0){
                                        spacer(4);
                                        System.out.println("Student Grade is not valid! Range: 0 - 100 only");
                                        System.out.print("Try Again... Enter Student Grade: ");
                                        studentgradetemp = sc.nextInt();
                                    }
                                    subs.setStudent_Grades(studentnumtemp, studentgradetemp);
                                    System.out.println("Student " + studentnumtemp + " has been enrolled");
                                    confirm();
                                    break;

                                //remove student from course
                                case 2:
                                    spacer(5);
                                    for (Student student : students) {
                                        if(subs.isEnrolled(student.getStudent_number())) {
                                            System.out.println(student.getLastName() + " " + student.getFirstName() + "  #" + student.getStudent_number());
                                        }
                                    }
                                    System.out.print("Enter Student Number to REMOVE: ");
                                    studentnumtemp = sc.nextInt();

                                    if(!studentExists(studentnumtemp, students)){
                                        System.out.println("Student does not Exist!");
                                        confirm();
                                        break;
                                    }
                                    if(!subs.isEnrolled(studentnumtemp)){
                                        System.out.println("Student not ENROLLED!");
                                        confirm();
                                        break;
                                    }

                                    subs.removeStudent(studentnumtemp);
                                    System.out.println("Student " + studentnumtemp + " has been REMOVED");
                                    confirm();
                                    break;

                                //change existing student grade
                                case 3:
                                    spacer(5);
                                    for (Student student : students) {
                                        if(subs.isEnrolled(student.getStudent_number())) {
                                            System.out.println(student.getLastName() + " " + student.getFirstName() + "  #" + student.getStudent_number());
                                        }
                                    }
                                    System.out.print("Enter Student Number to CHANGE GRADE: ");
                                    studentnumtemp = sc.nextInt();

                                    if(!studentExists(studentnumtemp, students)){
                                        System.out.println("Student does not Exist!");
                                        confirm();
                                        break;
                                    }
                                    if(!subs.isEnrolled(studentnumtemp)){
                                        System.out.println("Student not ENROLLED!");
                                        confirm();
                                        break;
                                    }


                                    System.out.print("Enter NEW Student Grade: ");
                                    studentgradetemp = sc.nextInt();
                                    while(studentgradetemp > 100 || studentgradetemp < 0){
                                        System.out.println("Student Grade is not valid! Range: 0 - 100 only");
                                        System.out.print("Try Again... Enter Student Grade: ");
                                        studentgradetemp = sc.nextInt();
                                    }
                                    subs.changeGrade(studentnumtemp, studentgradetemp);
                                    System.out.println("Student " + studentnumtemp + " grade has been changed");
                                    confirm();
                                    break;

                                //list registered students and their grade
                                case 4:
                                    int temparr[][] = subs.getStudentnumandgrade();
                                    for(int i=0; i < temparr[0].length; i++){
                                        for(Student student : students){
                                            if(student.getStudent_number() == temparr[0][i]){
                                                System.out.println("GRADE: " + temparr[1][i] + "  NAME: " + student.getLastName() + " " + student.getFirstName());
                                            }
                                        }
                                    }
                                    confirm();
                                    break;
                                default:
                                    System.out.println("Invalid Input...");
                                    confirm();
                                    break;
                            }
                            break;
                        }
                    }
                    if(!tempflag){
                        System.out.println("\n-------\nSUBJECT NOT FOUND...");
                        confirm();
                        break;
                    }
                    break;

                case 4:
                    spacer(5);
                    if(students.isEmpty()){
                        System.out.println("NO STUDENTS");
                        confirm();
                        break;
                    }
                    studentgwa = 0;
                    tempflag = false;
                    studentnumtemp = 0;
                    tempflag = false;
                    studentsubcount = 0;
                    System.out.print("Input Student Number or Name to Specifically Search: ");
                    sc.nextLine();
                    studentnametemp = sc.nextLine();
                    for(Student student : students){
                        if ((studentnametemp.matches("\\d+")&& student.getStudent_number() == Integer.parseInt(studentnametemp)) || (student.getLastName().equalsIgnoreCase(studentnametemp)) || (student.getFirstName().equalsIgnoreCase(studentnametemp))) {
                            spacer(50);
                            System.out.print("----------------\nStudent Found! Here is the info of the student: \n");
                            System.out.println("First Name: " + student.getFirstName());
                            System.out.println("Last Name: " + student.getLastName());
                            System.out.println("Student Number: " + student.getStudent_number());
                            spacer(2);
                            System.out.println("Student Grades per subject: ");
                            for(Subject sub : subjects){
                                if(sub.isEnrolled(student.getStudent_number())){
                                    tempflag = true;
                                    System.out.println("Subject: " + sub.getSubject_Name() + " Grade: " + sub.getStudent_Grade(student.getStudent_number()));
                                    studentgwa += sub.getStudent_Grade(student.getStudent_number());
                                    studentsubcount++;
                                }
                            }
                            break;
                        }

                    }


                    if(!tempflag){
                        System.out.println(" EMPTY...");
                        confirm();
                    }
                    else{
                        System.out.println("Student GWA: " + (studentgwa/studentsubcount));
                        System.out.println("\nif you want to change the student grade, please go to the subject list menu...");
                        confirm();
                    }
                    break;


                case 5:
                    spacer(50);
                    //creates a 2d array containing
                    float temparr [][] = new float[2][students.size()];

                    for(int i=0; i < students.size(); i++){
                        temparr[0][i] = 0;
                        temparr[1][i] = 0;
                    }

                    for(int k = 0; k < students.size(); k++){
                        studentgwa = 0;
                        studentsubcount= 0;
                        Student student = students.get(k);
                        for(int i = 0; i < subjects.size(); i++){
                            Subject sub = subjects.get(i);
                            if(sub.isEnrolled(student.getStudent_number())){
                                studentgwa += sub.getStudent_Grade(student.getStudent_number());
                                studentsubcount++;
                            }
                        }
                        temparr[0][k] = student.getStudent_number();

                        if(studentsubcount > 0) {
                            temparr[1][k] = studentgwa / studentsubcount;
                        }
                    }

                        /*
                        at this point, meron ng 2d array ng float, row 1 = SN, row 2 = GWA,
                        SN is in float, dont forget to convert to integer,
                        bubble sort next
                         */

                    //tempvariables
                    float row1temp = 0;
                    float row2temp = 0;
                    for(int i = 0; i < students.size() - 1; i++){
                        for(int j = 0; j < students.size() - i - 1; j++){

                            //swapping condition, if current is less than next
                            if(temparr[1][j] < temparr[1][j + 1]){

                                //swap for in order
                                row1temp = temparr[0][j];
                                row2temp = temparr[1][j];

                                temparr[0][j] = temparr[0][j + 1];
                                temparr[1][j] = temparr[1][j + 1];

                                temparr[0][j + 1] = row1temp;
                                temparr[1][j + 1] = row2temp;

                            }
                        }
                    }//sorting alg last bracket '}'


                    //sout na lahat ng data ng mga students and their grade

                    System.out.println("--------------\n\nAbbreviations: LN = Last name, FN = First Name, GWA = General Weighted Average\n----");
                    for(int i = 0; i < students.size(); i++){
                        System.out.println("GWA: "+ temparr[1][i]);
                        for(Student student : students){
                            if(student.getStudent_number() == temparr[0][i]){
                                System.out.print(" | LN: " + student.getLastName() + "   FN: " + student.getFirstName());
                                System.out.println(" ");
                            }
                        }
                    }
                    confirm();
                    break;


                /*
                    list all students and their info
                    for each loop?
                 */
                case 6:
                    spacer(50);
                    if(students.isEmpty()){
                        System.out.println("NO STUDENTS");
                        confirm();
                        break;
                    }
                    else{
                        System.out.println("-------------\nSTUDENTS INFO BELOW:");
                    }
                    for(Student student : students){
                        tempflag = true;
                        spacer(2);
                        System.out.println("-----\nStudent Number: " + student.getStudent_number());
                        System.out.println("Last Name: " + student.getLastName());
                        System.out.println("First Name:" + student.getFirstName());
                        System.out.println("Subjects: ");
                        for(Subject sub : subjects){
                            if(sub.isEnrolled(student.getStudent_number())){
                                tempflag = false;
                            }
                            if(sub.isEnrolled(student.getStudent_number())){
                                System.out.println("Subject: " + sub.getSubject_Name() + " Grade: " + sub.getStudent_Grade(student.getStudent_number()));

                            }
                        }
                        if(tempflag){
                            System.out.println("STUDENT NOT ENROLLED TO ANY SUBJECT");
                        }
                    }
                    confirm();
                    break;



                case 7:
                    spacer(50);
                    if(subjects.isEmpty()){
                        System.out.println("NO SUBJECTS ADDED YET...");
                        confirm();
                        break;
                    }


                    /*
                    row 1: course
                    row 2: highest grade
                    row 3: lowest grade
                     */
                    //algorithm derived lng sa student ranking sorting algorithm

                    //final array na gagamitin sa pag output ng results
                    float persub[][] = new float[3][subjects.size()];

                    //sets all variables to zero initially for cleanup
                    for(int i=0; i < subjects.size(); i++){
                        persub[0][i] = 0;
                        persub[1][i] = 0;
                        persub[2][i] = 0;
                    }

                    //temp array that stores the grades of the students per subject, and will be sorted later
                    int tempgrades[][];

                    //temp variable for bubble sort
                    int tempint;

                    for(int i = 0; i < subjects.size(); i++){
                        Subject subs = subjects.get(i);
                        tempgrades = subs.getStudentnumandgrade();

                        for(int j = 0; j < tempgrades[0].length; j++){
                            for(int k = 0; k < tempgrades[0].length - j - 1; k++){
                                if(tempgrades[1][k] < tempgrades[1][k + 1]){

                                    tempint = tempgrades[1][k];
                                    tempgrades[1][k] = tempgrades[1][k + 1];
                                    tempgrades[1][k + 1] = tempint;

                                }
                            }
                        }


                        //at this point, tempgrades array is now sorted

                        if(subs.enrolledStudentsTotal() > 0) {
                            persub[1][i] = tempgrades[1][0];
                            if(subs.enrolledStudentsTotal() == 1){
                                persub[2][i] = tempgrades[1][0];
                            }
                            else{
                                persub[2][i] = tempgrades[1][tempgrades[0].length - 1];
                            }

                        }
                    }

                    //prints the subjects itself


                    System.out.println("-------------\nSUBJECT INFO\n---");
                    for(int i = 0; i < subjects.size(); i++){
                        Subject subs = subjects.get(i);
                        System.out.println("Subject: " + subs.getSubject_Name() + "   CODE: " + subs.getSubject_Code());
                        System.out.println("Highest Grade: " + persub[1][i]);
                        System.out.println("Lowest Grade: " + persub[2][i]);
                        spacer(2);
                    }
                    confirm();
                    break;





                case 8:
                    howtobasic();
                    break;

                case 9:
                    spacer(5);
                    sc.close();
                    System.out.println("EXITING MAIN PROGRAM... THANK YOU FOR USING!");
                    return;
                default:
                    System.out.println("Invalid Choice, Try Again...");
            }
        }//whiletrue
    }//psvm
}//pcm
