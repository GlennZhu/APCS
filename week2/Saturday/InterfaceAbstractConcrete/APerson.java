package APCS.APCS.week2.Saturday.InterfaceAbstractConcrete;

/**
 * Created by ziliangzhu on 12/27/14.
 */
public abstract class APerson implements IPerson{
    protected String name;

    public APerson(String name) {
        this.name = name;
    }

    public abstract String getName();

    public abstract void setName(String name);

}
