package APCS.APCS.week2.Friday.Person;

/**
 * Created by ziliangzhu on 12/26/14.
 */
public abstract class APerson implements IPerson{
    private String name;

    public APerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getPID();
    // All the methods appeared in the interface have
    // to appear in the Abstract class, either as
    // abstract method(like getPID()) or concrete method
    // (like getName() and setName(String name))
}
