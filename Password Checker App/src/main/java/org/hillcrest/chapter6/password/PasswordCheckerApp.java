package org.hillcrest.chapter6.password;

import java.util.Scanner;



public class PasswordCheckerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your password!");
        String password = in.nextLine();

        int score = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determineStrength(score);
        String feedback = FeedbackGenerator.generateFeedback(password);
        System.out.println("Score: " + score);
        System.out.println(strength);
        System.out.println(feedback);


    }
}
