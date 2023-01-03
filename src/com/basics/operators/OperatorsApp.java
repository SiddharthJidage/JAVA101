package com.basics.operators;

public class OperatorsApp {

    public static void main(String[] args) {
        String carModel ="Dodge Challenger SRT 392";
        int price = 299999;
        int moneyInBanks=100000;
        boolean isDamaged= true;

        System.out.println("Price of a"+ carModel+": $"+ price);

        int increasedPrice= price +1000;
        System.out.println("The increased price of a:"+ increasedPrice);
        int decreasedPrice= price -1000;
        System.out.println("The decreased price of a:"+ decreasedPrice);
        int twoCarsPrice= price *2;
        System.out.println("The price of two cars is: "+ twoCarsPrice);
        int dodgesYouCanBuy= moneyInBanks/ price;
        System.out.println("From the money we have in bank we can buy "+ dodgesYouCanBuy +" "+ carModel);


        System.out.println("-------------- Unary Operator ------------------");

        int priceNegative = -299999;
        int priceNegativeWithPlusSign = + priceNegative;
        System.out.println("Negative price with plus sign: $" +priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = - priceNegative;
        System.out.println("Negative price with minus sign: $" +priceNegativeWithMinusSign);
        int priceOneDollarPostIncrease = price++;// post-increment
        int priceOneDollarPreIncrease = ++price;// post-increment
        System.out.println("price after post-increment: $" +priceOneDollarPostIncrease);
        System.out.println("price after pre-increment: $" +priceOneDollarPreIncrease);
        int priceOneDollarPostDecrease = price--;// post-decrement
        int priceOneDollarPreDecrease = --price;// pre-decrement
        System.out.println("price after post-decrement: $" +priceOneDollarPostDecrease);
        System.out.println("price after pre-decrement: $" +priceOneDollarPreDecrease);

        System.out.println("This car is damaged: "+ !isDamaged);//The ! operator will change the value.
        System.out.println();

        System.out.println("car's price equals the money in the bank: "+ (price== moneyInBanks) );
        System.out.println("car's price doesn't equals the money in the bank: "+ (price!= moneyInBanks) );
        System.out.println("car's price is greater than the money in the bank: "+ (price > moneyInBanks) );
        System.out.println("car's price is lesser than the money in the bank: "+ (price < moneyInBanks) );


        /*instanceof operator :
        *       Whenever we want to check if the variable has certain data-type.  */

        System.out.println("The carModel variables data-type is a string: " +( carModel instanceof String));




    }


}
