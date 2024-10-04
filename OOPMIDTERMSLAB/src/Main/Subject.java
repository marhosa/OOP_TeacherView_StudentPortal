package Main;

public class Subject {
    private String Subject_Name;
    private int Subject_Code;
    private int Max_Students = 100;

    //First Row = Student Number
    //Second Row = Student Grade
    private int Subject_Grades[][];

    public Subject(String Subject_Name, int Subject_Code) {
        this.Subject_Name = Subject_Name;
        this.Subject_Code = Subject_Code;
        this.Subject_Grades = new int[2][Max_Students];

        for (int i = 0; i < Max_Students; i++) {
            Subject_Grades[0][i] = 0;
            Subject_Grades[1][i] = 0;
        }
    }

    public int enrolledStudentsTotal(){
        int enrolledtotal = 0;
        for (int i= 0; i <Max_Students; i++) {
            if (Subject_Grades[0][i] != 0) {
                enrolledtotal++;
            }
        }
        return enrolledtotal;
    }

    public int getMax_Students() {
        return Max_Students;
    }

    //returns 2d array of student + their grade
    public int[][] getStudentnumandgrade() {

        // Count how many students yung enrolled (may student number instead na zero)
        int enrolledtotal = 0;
        for (int i= 0; i <Max_Students; i++) {
            if (Subject_Grades[0][i] != 0) {
                enrolledtotal++;
            }
        }

        // Create an array that only holds the enrolled students
        int temp[][] = new int[2][enrolledtotal];
        int kount = 0;
        for (int i =0; i < Max_Students; i++) {
            if (Subject_Grades[0][i] != 0) {
                temp[0][kount] = Subject_Grades[0][i];
                temp[1][kount] = Subject_Grades[1][i];
                kount++;
            }
        }
        return temp;


    }

    public void changeGrade(int SN, int grade){
        for (int i = 0; i < Max_Students; i++) {
            if (Subject_Grades[0][i] == SN) {
                Subject_Grades[1][i] = grade;
                break;
            }
        }
    }


    //getters:
    public String getSubject_Name() {
        return Subject_Name;
    }

    public int getSubject_Code() {
        return Subject_Code;
    }

    //returnts true if student is enrolled in this course
    public boolean isEnrolled(int SN){
        for(int i = 0; i < Max_Students; i++){
            if(Subject_Grades[0][i] == SN){
                return true;
            }
        }
        return false;
    }

    public void removeStudent(int SN){
        for(int i = 0; i < Max_Students; i++){
            if(Subject_Grades[0][i] == SN){
                Subject_Grades[0][i] = 0;
                Subject_Grades[1][i] = 0;
            }
        }
    }


    public int getStudent_Grade(int SN) {
        for(int i= 0; i< Max_Students; i++){
            if(Subject_Grades[0][i] == SN){
                return Subject_Grades[1][i];
            }
        }
        //returns negative number if no student found
        return -10;
    }

    //setters:
    public void setSubject_Name(String Subject_Name) {

        this.Subject_Name = Subject_Name;
    }

    public void setSubject_Code(int Subject_Code) {

        this.Subject_Code = Subject_Code;
    }


    public void setStudent_Grades(int StudentNumber, int Grade) {
        for(int i = 0; i < this.Max_Students; i++){
            if(Subject_Grades[0][i] < 1000){
                Subject_Grades[0][i] = StudentNumber;
                Subject_Grades[1][i] = Grade;
                break;
            }
        }
    }


}
