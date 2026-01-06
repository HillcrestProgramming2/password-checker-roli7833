package org.hillcrest.chapter6.password;

/**
 * Checks criteria of the password and returns how many of them it meets.
 */

public class CriteriaChecker {
   // final static String NUMBERS = ("1234567890");
    private static int score = 0;

    /**
     * Grades Password criteria
     * @param password the inputted password
     * @return the score of the password
     */
    public static int evaluateCriteria(String password) {
        boolean lengthy = (password.length() >= 8);
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        //if(password.contains(NUMBERS)) {
        //hasNumber = true;
        //}
        if (lengthy) {
            score++;
        }
        for (int i = 0; i < password.length(); i++) {
            char character = (password.charAt(i));
            if (Character.isUpperCase(character)) {
                hasUpper = true;
                score++;
            }

            character = (password.charAt(i));
            if (Character.isLowerCase(character)) {
                hasLower = true;
                score++;
            }
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
                score++;
            }
            if (!(Character.isDigit(password.charAt(i))) && (!(Character.isLetter(password.charAt(i))))) {
                hasSpecial = true;
                score++;
            }


        }

        return score;


    }

    /**
     * Gives a description of the password based on score
     * @param score
     * @return
     */
    public static String determineStrength(int score) {
        if (score >=0 && score <=2) {
            return ("Weak Password...");
        }
        else if (score == 3) {
            return ("Moderate Password.");
        }
        else if (score > 3 && score <=5) {
            return ("Strong Password!");
        }
        return "N/A";
    }
}
