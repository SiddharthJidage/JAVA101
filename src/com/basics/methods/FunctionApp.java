package com.basics.methods;

public class FunctionApp {
    public static void main(String[] args) {
        sayHello();
        blackBoardPunishments(5);
        System.out.println("The price of 10% off : "+getTenPercentOfDiscountPrice(20000)+"$");
        System.out.println("The price of 50% off : "+getDiscountPrice(20000,50)+"$");
        System.out.println("The price of 40% off : "+getDiscountPrice(20000.75,60)+"$");



    }

    static void sayHello(){
        System.out.println("Hello!");
    }
    static void blackBoardPunishments(int repeatNumber){

        for(int i=1; i<=repeatNumber; i++){
            System.out.println("Being Right Sucks!");
        }

    }
    static double getTenPercentOfDiscountPrice(int price){
        return price *0.9;
    }

    //Method Overloading
    static double getDiscountPrice(int price, int percent){
        return price *percent/100.00;
    }

    static double getDiscountPrice(double price, int percent){
        return price*percent/100;
    }

}
