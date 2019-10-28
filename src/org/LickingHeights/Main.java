package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard;
        keyboard = new Scanner (System.in);
        int computerNumber;
        int guessedNumber;
        String high,low,gotIt;
        high = "You're to high";
        low = "Your to low";
        computerNumber = (int)(Math.random()*100) + 1;
        System.out.println("Guess a Number between 1-100");


        do {
            guessedNumber = keyboard.nextInt();
            if (guessedNumber > computerNumber){
                System.out.println(high);

            }
            else if (guessedNumber < computerNumber){
                System.out.println(low);
            }
            else
                System.out.println("Corect");


        }while (guessedNumber != computerNumber);



    }








}
