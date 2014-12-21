package APCS.APCS.week1;

/**
 * Created by ziliangzhu on 12/21/14.
 */
public class Professor extends Person {
    private String subject;

    // Exercise
    // Write Cop class
    // Need methods get/set pID, get/set height
    public Professor(boolean inputGender, String inputName,
                     double inputW, double inputH, String inputSubject){
        super(inputGender, inputName, inputW, inputH);
        subject = inputSubject;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String newSubject){
        subject = newSubject;
    }

    public String getProfessorName(){
        return super.getName();
    }

    public void setProfessorName(String newName) {
        super.setName(newName);
    }
}
