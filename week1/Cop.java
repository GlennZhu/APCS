package APCS.APCS.week1;

/**
 * Created by ziliangzhu on 12/21/14.
 */
public class Cop extends Person {
    private int pID;

    public Cop(boolean inputGender, String inputName,
               double inputW, double inputH, int inputPID){
        super(inputGender, inputName, inputW, inputH);
        pID = inputPID;
    }

    public int getCopPID(){
        return pID;
    }

    public void setCopPID(int newPID){
        pID = newPID;
    }

    public double getCopHeight(){
        return super.getHeight();
    }

    public void setCopHeight(double newHeight) {
        super.setHeight(newHeight);
    }
}
