package APCS.week1;

/**
 * Created by ziliangzhu on 12/19/14.
 */
public class PrintArray {
    public void print(int[] input, int indexFrom) {
        // Base
        if(indexFrom == input.length){
            return;
        }
        System.out.println(input[indexFrom]);
        print(input, indexFrom + 1);
        System.out.println(indexFrom + 1 + " print finish");
    }
}
