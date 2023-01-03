package com.basics.arrays;

public class ArraysApp {
    public static void main(String[] args) {

        //Single-Dimension Array:
        int [] lotteryNumbers = new int[5];
        lotteryNumbers[0]=12;
        lotteryNumbers[1]=42;
        lotteryNumbers[2]=10;
        lotteryNumbers[3]=82;
        lotteryNumbers[4]=32;

        for (int lotteryNumber:lotteryNumbers) {
            System.out.println(lotteryNumber);
        }

        //Multiple-Dimension Array:
        int [][] multiDimensionArrays = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        System.out.println("The elements of the multiDimensionArrays are: ");
        for (int i = 0; i <multiDimensionArrays.length; i++) {
            for (int j = 0; j < multiDimensionArrays[i].length; j++) {
                System.out.print(multiDimensionArrays[i][j]+ " ");

            }
            System.out.println();

        }


    }
}
