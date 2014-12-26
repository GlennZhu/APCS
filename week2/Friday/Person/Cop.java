package APCS.APCS.week2.Friday.Person;

/**
 * Created by ziliangzhu on 12/26/14.
 */
public class Cop extends APerson {
    private String pid;

    public Cop(String name, String pid) {
        super(name);
        this.pid = pid;
    }

    public String getPID(){
        return pid;
    }
}
