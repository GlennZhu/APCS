package APCS.APCS.week1;

/**
 * Created by ziliangzhu on 12/21/14.
 */
public class ScrambleWord {
    public static String scrambleWord(String word) {
        // review array
        //        char[] wordArray = {'a', 'b', 'c'};
        //        char[] array2 = new char[10];

        // How to convert a String to an array
//        char[] wordArray = word.toCharArray();

        // How to swap letters. Swap index 2nd and 4th
//        char[] exampleArray = {'a', 'b', 'c', 'd', 'e', 'f'};
//        char record2nd = exampleArray[2];
//        exampleArray[2] = exampleArray[4];
//        exampleArray[4] = record2nd;

        // How to convert char array to String
//        String converted = new String(exampleArray); // "abcdef"

        // How to use char array
//        char[] example = {'a', 'b', 'c'};
//        char extracted = example[2];

        // How to use not equal
        // !=
        // ============================================
        char[] convertedCharArray = word.toCharArray();
        int currentIndex = 0;
        while (currentIndex < word.length() - 1) {
            char currentChar = convertedCharArray[currentIndex];
            if (currentChar == 'A') {
                if (convertedCharArray[currentIndex + 1] == 'A') {
                    currentIndex++;
                } else {
                    char temp = convertedCharArray[currentIndex];
                    convertedCharArray[currentIndex] = convertedCharArray[currentIndex + 1];
                    convertedCharArray[currentIndex + 1] = temp;
                    currentIndex += 2;
                }
            } else {
                currentIndex++;
            }
        }
        return new String(convertedCharArray);
    }
}
