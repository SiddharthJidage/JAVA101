package com.basics.datatypes;

public class PrimitiveDataTypes101{
    public static void main(String[] args) {
   //Primitive types
        //byte type -128 t0 127
        byte numberOfSeats =5;
        byte numberOfDoor =3;
        byte numberOfVehicleOwners =1;
        byte emissionSticker =4;

        //short type -32k t0 32k
        short power =362;
        short horsePower =492;
        short co2Emission =333;
        short cubicCapacity =6417;

        //int type -2B to 2B
        int price =29999;
        int mileage =14999;

        //long type huge no
        long registrationNumber = 2345679083272363223L;

        //float type
        float temperature =3.14F;
        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.5F;
        float fuelConsumptionExtraUrban = 13.6F;

        //double type
        double fuelConsumptionPreciseAverage =15.56355366353;

        //boolean type it has only two values
        boolean isDamaged = true;

        //char type can store ASCII values
        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge challenger SRT 392 ");
        System.out.println("Price: "+ price +" euro");
        System.out.println("Mileage: "+ mileage +" km");
        System.out.println("The car is Damaged: "+ isDamaged);
        System.out.println("Registration number: "+ registrationNumber);
        System.out.println("Cubic capacity: "+ cubicCapacity);
        System.out.println("Power: "+ power +" kw("+ horsePower+"hp)" );
        System.out.println("Power: "+ power +" kw("+ horsePower+"hp)" );
        System.out.println("CO2 Emission: "+ co2Emission +"g/km" );
        System.out.println("Emission sticker: "+ emissionSticker +"(Energy efficiency category:" + energyEfficiencyCategory+")");
        System.out.println("Combined fuel consumption: "+ fuelConsumptionCombined +"l/100km ");
        System.out.println("Urban fuel consumption: "+ fuelConsumptionUrban +"l/100km ");
        System.out.println("Extra Urban fuel consumption: "+ fuelConsumptionExtraUrban +"l/100km ");
        System.out.println("precise average fuel consumption: "+ fuelConsumptionExtraUrban +"l/100km ");
        System.out.println("Number of previous owners : "+ numberOfVehicleOwners );
        System.out.println("Number of Doors : "+ numberOfDoor );
        System.out.println("Number of Seats : "+ numberOfSeats );


        System.out.println("--------------------------------conversion--------------------------------");

        /* Type Conversion :
         Type conversion is simply the process of converting data of one data type into another.
         This process is known as type conversion, typecasting, or even type coercion.
         There are two more type conversions in Java – implicit and explicit.

         implicit conversions:
         Implicit type conversion, also known as widening casting.
         The order of data types in which implicit type conversion in Java happens is as follows:
         Byte > Short > Char > Int > Long > Float > Double

         explicit conversions:
         Explicit type conversion is the opposite of implicit type conversion. So, instead of widening,
         this type conversion works towards narrowing.
         Syntax: dataType(new) variableName(new)= dataType(new) variableName(old)
         Explicit type conversion in Java works in the following order of conversion:
         Double > Float > Long > Int > Char > Short > Byte

         */

        //implicit type conversions:
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The values of new number of seats:"+ newNumberOfSeats);

        double newFuelConsumptionCombined= fuelConsumptionCombined;
        System.out.println("The values of new fuel consumption combined:"+ newFuelConsumptionCombined + " l/100");


        //explicit type conversion:
        byte newPower = (byte) power;// here newPower is new variableName and power is old variableName. byte is new dataType
        System.out.println("The values of new power:"+ newPower + " kw");




    }
}