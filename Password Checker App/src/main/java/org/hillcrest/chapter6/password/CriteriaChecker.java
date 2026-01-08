package org.hillcrest.chapter6.password;

/**
 * Checks criteria of the password and returns how many of them it meets.
 */

public class CriteriaChecker {
   // final static String NUMBERS = ("1234567890");
    private static int score = 0;

    private static boolean lengthy;
    private static boolean hasUpper;
    private static boolean hasLower;
    private static boolean hasNumber;
    private static boolean hasSpecial;

    /**
     * Grades Password criteria
     * @param password the inputted password
     * @return the score of the password
     */
    public static int evaluateCriteria(String password) {
        lengthy = (password.length() >= 8);
        hasUpper = false;
        hasLower = false;
        hasNumber = false;
        hasSpecial = false;


        //if(password.contains(NUMBERS)) {
        //hasNumber = true;
        //}

        for (int i = 0; i < password.length(); i++) {
            char character = (password.charAt(i));
            if (Character.isUpperCase(character)) {
                hasUpper = true;
            }

            character = (password.charAt(i));
            if (Character.isLowerCase(character)) {
                hasLower = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
            }
            if (!(Character.isDigit(password.charAt(i))) && (!(Character.isLetter(password.charAt(i))))) {
                hasSpecial = true;
            }
        }
        if (lengthy) {
            score++;
        }
        if(hasUpper) {
            score++;
        }
        if (hasLower) {
            score++;
        }
        if(hasNumber) {
            score++;
        }
        if(hasSpecial) {
            score++;
        }



        return score;


    }

    public static boolean metLength() {
        return lengthy;
    }

    public static boolean metUpper() {
        return hasUpper;
    }

    public static boolean metLower() {
        return hasLower;
    }

    public static boolean metNumber() {
        return hasNumber;
    }

    public static boolean metSpecial() {
        return hasSpecial;
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
