package com.basics.assessments;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        System.out.println("hey welcome to the QuizApp.");
        System.out.println("your Q  is 'Who is the father of light bulb'?");
        Scanner sc = new Scanner(System.in);
        String fatherOfLightBulb = sc.nextLine();

        //If-else approach:
        if(fatherOfLightBulb.equals("Thomas Edison")){
            System.out.println("Correct answer: '" + fatherOfLightBulb+"' you are the winner.");

        }else {
            System.out.println(fatherOfLightBulb +" is wrong answer 'Thomas edison' is the right answer.");
        }

        //Switch case approach:
        switch (fatherOfLightBulb){
            case "Thomas Edison":
                System.out.println("correct answer.");
                break;
            default:
                System.out.println("wrong answer.");
        }
    }

}
