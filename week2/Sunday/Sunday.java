package APCS.APCS.week2.Sunday;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

/**
 * Created by ziliangzhu on 12/28/14.
 */
public class Sunday {
    public static void main(String[] args) {
//        String test = "abcdef";
//        int count = 0;
//        for (int i = 0; i < test.length(); i++) {
//            if (test.charAt(i) < 'c') count ++;
//        }
//        System.out.println(count);
//
//        String c = count + "";
//        char stringToChar = c.charAt(0);
//        char intToChar = (char)('0' + count);
//        int charToInt = intToChar - '0';
//        int stringToInt = Integer.parseInt(c);
//
//        String c2 = "3.2";
//        boolean bool = c.equals(c2);
//        bool = (c.compareTo(c2) == 0);
//
//        if (!bool && 2 > 5) {
//            System.out.println("hehe");
//        }
//
//        float f = 1.9f;
//        // 1
//        int[] a = {1, 2, 3};
//        // 2
//        a = new int[]{1, 2, 3};
//        // 3
//        a = new int[3];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
//        a[1] = 4;
//
//        int[][] two = {
//                {1, 4, 3, 7},
//                {5, 9, 2, 10},
//                {6, 3, 1, 11}
//        };
//        int sum2 = 0;
//        for (int i = 0; i < two.length; i++) {
//            for (int j = 0; j < two[0].length; j++) {
//                sum2 += two[i][j];
//            }
//        }
//
//        int sum3 = two[1][2] + two[2][3];
//
//        for (int i = 1; i <= 10; i++) {
//            if (i == 6) continue;
//            System.out.println(i);
//        }
//
//        for (int i = 20 / 3 * 3; i >= 0; i -= 3) {
//            if (i == 3) break;
//            System.out.println(i);
//        }
//
//        Random rand = new Random();
//        for (int i = 0; i < 50; i++) {
//            System.out.println(rand.nextInt(6) - 2);
//        }
//
//        List<Integer> l = new ArrayList<>();
//        l.add(3);
//        l.add(1);
//        l.add(4);
//        // this
//        l.set(1, 3);
//        // equals to
//        l.remove(1);
//        l.add(1, 3);
//
//        int sum4 = 0;
//        for (int i = 0; i < l.size(); i++) {
//            sum4 += l.get(i);
//        }
//
//        int input = 56789;
//        switch(input){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println(0);
//        }
//
//        boolean[] ha = new boolean[5];
//        try {
//            System.out.println(ha[100]);
//        } catch (Exception e) {
//            System.out.println("error");
//        }

//        ToStringExample t = new ToStringExample();
//        System.out.println(t);

//        ComparableExample c1 = new ComparableExample(1);
//        ComparableExample c2 = new ComparableExample(2);
//        ComparableExample c3 = new ComparableExample(3);
//        List<ComparableExample> l = new ArrayList<>();
//        l.add(c1);
//        l.add(c2);
//        l.add(c3);
//        Collections.sort(l);
//        System.out.println(l);

//        AOverrideExample a = new Override();
//        System.out.println(a.toBeOverriden());

//        OverloadExample o = new OverloadExample();
//        System.out.println(o.overload());
//        System.out.println(o.overload("asdf"));
//        int[] test = {1, 2, 3, 4, 5};
//        for (int i = 0; i < test.length; i++) {
//            System.out.print(test[i]);
//            System.out.print(" index is " + i);
//        }
//        System.out.println();
//        for (int retrived : test) {
//            System.out.print(retrived);
//        }

        List<Integer> test = new ArrayList<>();
        test.add(4);
        test.add(2);
        test.add(1);
        for (int retrived : test){
            System.out.println(retrived);
        }
    }
}
