package APCS.week1;

/**
 * Created by ziliangzhu on 12/19/14.
 */
public class Stairs {
    public int wayToReach(int k) {
        if (k == 1) {
            return 1;
        }
        if (k == 2) {
            return 2;
        }
        if (k == 3) {
            return 4;
        }
        return wayToReach(k - 1) + wayToReach(k - 2) + wayToReach(k - 3);
    }
}
