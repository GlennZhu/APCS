package APCS.APCS.week1;

/**
 * Created by ziliangzhu on 12/21/14.
 */
public class Student extends Person {
    private long studentID;

    public Student(boolean inputGender, String inputName,
                   double inputW, double inputH, long newID){
        // First line need to call abstract class's constructor

        // new Person()
        super(inputGender, inputName, inputW, inputH);
        studentID = newID;
    }

    public void studentTest(){
        test();
        //the same as super.test();;
    }

    public boolean getStudentGender(){
        return getGender();
    }

    public void setStudentGender(boolean newGender){
        setGender(newGender);
    }

    public void onlyStudentHasThis(){

    }
}
