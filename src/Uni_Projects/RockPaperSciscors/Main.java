package Uni_Projects.RockPaperSciscors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rock Paper Sciscors 1.0");

        Hand A = Hand.ROCK;
        Hand B = Hand.PAPER;
        Hand C = Hand.SCISSOR;

        // Game starts here
        RockPaperSciscors round1 = new RockPaperSciscors();
        System.out.println(round1.thhrow(A, B));

        // Player picks a play
        Scanner rpsScanner = new Scanner(System.in);
        Hand playersHand = null;
        String playersString = rpsScanner.next();
        if (playersString.equalsIgnoreCase("Rock")) { playersHand = Hand.ROCK; }
        if (playersString.equalsIgnoreCase("Paper")) { playersHand = Hand.PAPER; }
        if (playersString.equalsIgnoreCase("Scissor")) { playersHand = Hand.SCISSOR; }
        System.out.println("Players plays " + playersHand);

        // Computer generates a play
        Hand computersHand = null;
        int handComputer =(int) (Math.random()*3);

        if (handComputer ==0) {computersHand = Hand.ROCK; }
        if (handComputer ==1) {computersHand = Hand.PAPER; }
        if (handComputer ==2) {computersHand = Hand.SCISSOR; }
        System.out.println("Computer plays " + computersHand);

        // Compare with the thhrow() method
        String result = round1.thhrow(playersHand, computersHand);

        // Declare a winner
        System.out.println("Player " + result);
    }
}
