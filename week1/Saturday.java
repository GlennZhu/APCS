package APCS.week1;

/**
 * Created by ziliangzhu on 10/23/14.
 */
public class Saturday {
    public static void main(String[] args) {
//        int i = 3;
//        if (i == 3) {
//            System.out.println("heaha");
//        } else if (i == 5){
//            // Do somthign
//        } else{
//
//        }

//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }

//        System.out.println(3 == 3);
//        float l1 = 5678945.56788F;
//        float l2 = 67976789.23423524F;
//        System.out.println(Math.abs(l1 - l2) < 0.0001);

//        System.out.println(!!true);

//        char c = 97;
//        System.out.println(c);
//        c = 98;
//        System.out.println(c);
//
//        char a = 'k', b = 'k';
//        System.out.println(a == b);
//
//        String s = "asdfasdf", s2 = "asdfasdf";
//        System.out.println(s.equals(s2));
//        String s3 = new String("asdfasdf");
//
//        String s4 = s3 + " " + s2;
//        System.out.println(s4);
//
//        System.out.println(s + 3);
//        System.out.println(s + 'a');
//
//        String s5 = null;
//
//        Integer i = 5;
//        Integer j = null;

        // String to int
//        String toConvert = "5";
//        int converted = Integer.parseInt(toConvert);
//        System.out.println(converted);

//        String toConvert = "a";
//        char result = toConvert.charAt(0);

//        int toConvert = 5;
//        String result = 5 + "";

//        int toConvert = 5;
//
//
//        char result = '0' + 4;
//        System.out.println(result);
//
//        char example = 'a';
//        char example2 = 97;

//        a --- 97
//          char intoChar = 97;

        // char to String
//        String result = "" + 'b'; // "b"

//        char toConvert = 'a';
//        int result = (int) toConvert;

//        String example = "abc", example1 = "abcd";
//        example.charAt(0);
//        boolean result = example.equals(example1);
//        result = example.contains("bc");
//        example.indexOf("c");
//        int len = example.length();
//        String s = example.substring(1, 2);

//        Random rand = new Random();
//        System.out.println(rand.nextInt(6));
//
//
//        for (int j = 0; j < 50; j++) {
//
//        }

//        int[] example = new int[100];
//        double[] example2 = new double[100];
//        String[] example3 = new String[100];
//        System.out.println(example3[10]);
//        char[] example5 = new char[50];
//        System.out.println(example5[12]); // ' '
//
//        int[] example4 = {4, 2, 3, 4, 5, 6, 78};
//        System.out.println(example4[3]);
//        example4[3] = 101;
//        System.out.println(example4.length);
//
//        for (int i = 0; i < example4.length; i++) {
//            System.out.println(example4[i]);
//        }

        // Deep copy an array
//        int[] a = new int[100];
//        int[] b = new int[100];
//        for (int i = 0; i < 100; i++) {
//            b[i] = a[i];
//        }


        // 2D array
//        int[][] my2D = new int[4][3];
//        int[][] my2D2 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12},
//        };
//
//        for (int col = 0; col < my2D2[0].length; col++) {
//            for (int row = 0; row < my2D2.length; row++) {
//                System.out.println(my2D2[row][col]);
//            }
//        }

        // ArrayList example
//        ArrayList<Integer> myList = new ArrayList<>();
////        System.out.println(myList.size());
//        myList.add(1);
//        myList.add(3);
//        myList.add(2);
//        myList.add(4);
        // To get size use .size()
        // Exercise: print 1324 using for loop

//        System.out.println(myList.size());
//        // for Array, you do myArray[x]
//        System.out.println(myList.get(2));
//        myList.remove(1);
//        System.out.println(myList.get(2));
//        System.out.println(myList);
//        myList.set(1, 3);
//        System.out.println(myList);
//
//        int i = 10;
//        Integer actual = new Integer(i);
//        myList.add(actual);

        //auto unboxing
//        int j = myList.get(0);

        // For array use .length no ()
        // For String use .length(), with ()
        // For ArrayList use .size()


        // my2D2.length how many rows
        // my2D2[0].length how many columns

        // exercise: print 1 4 7 10 2 5 8 11 3 6 9 12
//        System.out.println(my2D2[3][2]);

        // generate 100 integers in the range of -10 to -5
//                ASCII table '1'


        // How to use Switch
//        int input0 = 3;
//        if (input0 == 1){
//
//        } else if(input0 == 2){
//
//        } else if (input0 == 3) {
//
//        } else {
//
//        }
//
//        int input = 3;
//        switch(input) {
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
//                System.out.println("default");
//        }

        // break loop
//        for (int j = 0; j < 30; j++) {
//            for (int i = 0; i < 50; i++) {
//                if (i == 30){
//                    break;
//                }
//            }
//        }
//
//        int k = 3;
//        while(true){
//            if (k > 20){
//                break;
//            }
//            k += 5;
//        }

        // continue loop
//        for (int j = 0; j < 30; j++) {
//            // j = 12
//            for (int i = 0; i < 50; i++) {
//                // i = 30
//                if (i == 30) {
//                    System.out.println("i = " + i + " here");
//                    // j = 12, i = 30
//                    continue;
//                }
//                System.out.println(i);
//            }
//        }

//        int k = 3;
//        while(true){
//            if (k > 20){
//                break;
//            }
//            k += 5;
//        }

        // Exercise use while and continue
        // to print 1-10 except 3 and 9

        // Try-catch
//        try {
//            int[] myArray = {1, 2, 3, 4};
//            System.out.println(myArray[100]);
//            System.out.println("here");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("caught exception");
//            e.printStackTrace();
//        }

        Computer myComputer = new Computer("green", 9);
        int returnedValue = myComputer.getSize(); // have return value
        myComputer.setSize(10); // no return value--void
        System.out.println(myComputer.getSize());
        myComputer.setSize(12);
        System.out.println(myComputer.getSize());

        IntegerWrapper myWrapper = new IntegerWrapper(10);
//        System.out.println(myWrapper.value);
        System.out.println(myWrapper.getValue());

        // Use static field
        System.out.println(IntegerWrapper.brand);
        System.out.println(Integer.MAX_VALUE);

        // Static method usage
        IntegerWrapper.printMe();
        Math.abs(3);
    }
}
