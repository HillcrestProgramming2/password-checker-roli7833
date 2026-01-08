package org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password
    public static String generateFeedback(String password) {
        CriteriaChecker checker = new CriteriaChecker();
        if (!CriteriaChecker.metLength()) {
            System.out.println("Consider adding more to your password.");
        }
        if(!CriteriaChecker.metUpper()) {
            System.out.println("Consider adding an uppercase.");
        }
        if(!CriteriaChecker.metLower()) {
            System.out.println("Consider adding a lowercase.");
        }
        if(!CriteriaChecker.metNumber()) {
            System.out.println("Consider adding a number.");
        }
        if(!CriteriaChecker.metSpecial()) {
            System.out.println("Consider adding a special character.");
        }
        return "Thank you for using StrengthChecker!";
    }

}
