package APCS.APCS.week2.Saturday.InterfaceAbstractConcrete;

/**
 * Created by ziliangzhu on 12/27/14.
 */
public class Cop extends APerson {
    // Field...

    public Cop(String name) {
        super(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        super.name = name;
    }
}
