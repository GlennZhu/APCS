package APCS.APCS.week2.Saturday.InterfaceAbstractConcrete;

import APCS.APCS.week2.Saturday.InterfaceAbstractConcrete.APerson;
import APCS.APCS.week2.Saturday.InterfaceAbstractConcrete.Cop;
import APCS.APCS.week2.Saturday.InterfaceAbstractConcrete.IPerson;

/**
 * Created by ziliangzhu on 12/27/14.
 */
public class Main {
    public static void main(String[] args) {
//        APerson myCoooo = new Cop("David");
//
//        IPerson myCop = new Cop("David");
//
//
//        IAnimal tiger = new Tiger("Yellow", 5);
//        IAnimal cat = new Cat("White", 3);
//
//        Search s = new Search();
//        int[] data = {1, 3, 4, 7, 10, 11};
//        System.out.println(s.binarySearch(data, 3));
//        System.out.println("        ".trim());
        // no "no, don't do it. " "ohnono."
        // mother. "smother"
        // "mother loves you."
        // "you love your mother?" not a-z
        // phrase.charAt(psn - 1) + "";
        // smother searchPos 1
        // 2
        System.out.println(searchWord("mother dad no", "mother"));
        System.out.println(searchWord("mother dad no", "dad"));
        System.out.println(searchWord("mother dad no.", "daddy"));
        System.out.println(searchWord("mother dad no", "no"));
        System.out.println(searchWord("you want me", "me"));
        System.out.println(searchWord("you want me", "you"));
//        System.out.println(getWantedThing("Mom, I want sugar"));
        System.out.println(getVerb("you haha me"));
    }

    /**
     * ex. for "you something me", get "something"
     * @param statement
     * @return
     */
    public static String getVerb(String statement) {
        int you = searchWord(statement, "you");
        int me = searchWord(statement, "me");
        if (you == -1 || me == -1 || you > me) return "";
        return statement.substring(you + 4, me - 1);
    }

    public static int searchWord(String statement, String goal) {
        statement = statement.trim().toLowerCase();
        goal = goal.trim().toLowerCase();
        statement = statement.replaceAll("[^a-z]", " ");
        statement = " " + statement + " ";
        return statement.indexOf(" " + goal + " ");
    }

    public static String getWantedThing(String statement) {
        statement = statement.replaceAll("[^a-zA-Z]", " ");
        statement = statement.toLowerCase().trim();
        return statement.substring(statement.indexOf("i want") + 7);
    }

//    http://media.collegeboard.com/
// digitalServices/pdf/ap/
// ap-compscia-magpie-lab-student-guide.pdf
}
