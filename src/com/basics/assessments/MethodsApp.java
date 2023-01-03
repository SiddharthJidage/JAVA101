package com.basics.assessments;

import java.util.Scanner;

public class MethodsApp {
    public static void main(String[] args) {

        System.out.println("What is your car's energy efficiency grade ?" + '\n' +"chose from A to G");
        Scanner scanner = new Scanner(System.in);
        char energyEfficiencyGrade= scanner.next().charAt(0);
        getCarDescription("Mustang GT", 2010, "Excellent");
        getEnergyEfficiencyCategory(energyEfficiencyGrade);

    }
    static void getEnergyEfficiencyCategory(char energyEfficiencyGrade){


        switch (energyEfficiencyGrade) {
            case 'A':
            case'a':
                System.out.println("The energy efficiency grade of the car is 'VERY LOW'.");
                break;
            case 'B':
            case'b':
                System.out.println("The energy efficiency grade of the car is 'LOW'.");
                break;
            case 'C':
            case'c':
                System.out.println("The energy efficiency grade of the car is 'NORMAL'.");
                break;
            case 'D':
            case'd':
                System.out.println("The energy efficiency grade of the car is 'ABOVE NORMAL'.");
                break;
            case 'E':
            case'e':
                System.out.println("The energy efficiency grade of the car is 'HIGH'.");
                break;
            case 'F':
            case'f':
                System.out.println("The energy efficiency grade of the car is 'VERY HIGH'.");
                break;
            case 'G':
            case'g':
                System.out.println("The energy efficiency grade of the car is 'EXTREMELY HIGH '.");
                break;
            default:
                System.out.println("Not defined category.");

        }

    }

    static void getCarDescription(String carModel, int productionYear, String condition){

        System.out.println("Your car model is : " + carModel+'\n'+"Your car's production year is : " + productionYear+'\n'+"Your car's condition is : " + condition);

    }
}

