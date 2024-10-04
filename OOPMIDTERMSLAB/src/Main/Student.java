package Main;
import java.util.ArrayList;
import java.util.List;

public class Student extends People {
    private int student_number;


    //Constructor ng Students, Calls Super Constructor rin
    public Student(String FN, String LN, int sn){
        super(FN, LN);
        this.student_number = sn;
    }

    //Getters
    public int getStudent_number() {
        return this.student_number;
    }

    //Setters
    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    



}
