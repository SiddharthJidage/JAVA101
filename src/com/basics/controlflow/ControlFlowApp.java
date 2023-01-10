package com.basics.controlflow;

public class ControlFlowApp {
    public static void main(String[] args) {
        boolean isDamaged = true;
        String carColor = "purple";
        char energyEfficiencyCategory = 'G';

        //If-else statements:
        if (isDamaged) {
            System.out.println("Damaged car.");
        } else {
            System.out.println("Accidental free car.");
        }

        //If-else ladder statements:
        if (carColor.equals("Red")) {
            System.out.println("This car is Red.");
        } else if (carColor.equals("Green")) {
            System.out.println("This car is Green.");
        } else if (carColor.equals("purple")) {
            System.out.println("This car is Purple.");
        }
        else {
            System.out.println("I have no idea what's the color of this car.");
        }

        //Switch statements:
        switch (energyEfficiencyCategory){
            case 'A':
                System.out.println("Very lower energy consumption.");
            case 'B':
                System.out.println("Low energy consumption.");
                break;
            case 'G':
                System.out.println("Higher energy consumption.");
                break;
            default:
                System.out.println("Not defined category.");

        }

        //Code Block
        {
            int numberOfOwners= 5;
            {
                numberOfOwners++;
            }
            System.out.println("The number of owners:" + numberOfOwners);
        }
    }

    }

