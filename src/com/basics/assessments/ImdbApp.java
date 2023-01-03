package com.basics.assessments;

public class ImdbApp {
    public static void main(String[] args) {
        String actorName="Shah Rukh Khan";
        String actorsDateOfBirth = "02-November-1965" ;
        int actorsAge =62;
        String [] movieNames = new String[5];
        float [] movieRatings=new float[5];

        movieNames[0]="ZERO";
        movieNames[1]="RA.ONE";
        movieNames[2]="Veer-Zara";
        movieNames[3]="Om Shanti Om";
        movieNames[4]="Swades";

        movieRatings[0]= 6.6F;
        movieRatings[1]=5.4F;
        movieRatings[2]=7.8F;
        movieRatings[3]=8.0F;
        movieRatings[4]=9.3F;

        System.out.println("Name of the Actor: " + actorName);
        System.out.println("Date of birth of the Actor: " + actorsDateOfBirth+ " ("+ actorsAge+" years old)");
        System.out.println("Movies the actor worked in :");
        for (int i=0; i<movieNames.length; i++) {

            System.out.println("      '"+movieNames[i]+"' - "+getMovieReview(movieRatings[i]));

        }

    }

    static String getMovieReview(float movieRatings) {
        if (movieRatings <=5.0) {
            return "Bad rating.";
        } else if (movieRatings>5.0 && movieRatings<=6.5) {
            return "Average rating.";
        } else if (movieRatings>6.5 && movieRatings<=7.0) {
            return "Good rating.";
        } else if (movieRatings>7.0 && movieRatings<=8.0) {
            return "Very Good rating.";
        }else if (movieRatings>8.0){
            return "Excellent rating.";
        }
        return null;
    }
}
