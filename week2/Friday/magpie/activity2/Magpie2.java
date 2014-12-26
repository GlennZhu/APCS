package APCS.APCS.week2.Friday.magpie.activity2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    private String greeting = "Hello, let's talk";
    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
//        String response = "";
//        if (statement.indexOf("no") >= 0)
        if (statement.contains("no"))
        {
            return "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0 // smother
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            return "Tell me more about your family.";
        }
        // ===============answer======================
        else if (statement.contains("dog")
                || statement.contains("cat")){
            return "Tell me more about your pets.";
        }
        else if (statement.contains("Fin")) {
            return "He sounds like a good teacher.";
        }
        else if (statement.trim().isEmpty()) {
            return "Say something, please.";
        }
        // ===============answer======================
        else {
            return getRandomResponse();
        }
//        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random(); // 0 ~ .99999
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES); // 0 ~ 3
//        String response = "";

        if (whichResponse == 0)
        {
            return "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            return "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            return "Do you really think so?";
        }
        else
        {
            return "You don't say.";
        }

//        return response;
    }
}