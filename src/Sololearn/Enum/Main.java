package Sololearn.Enum;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//Let's check the corresponding values of my enum:

        System.out.println("Let's use a switch to greet *DOGS*");
        TierList d = TierList.DOGS;

        switch (d) {
            case DOGS:
                System.out.println("Your idol says hi doggo!");
                break;
            case CATS:
                System.out.println("Your idol says Hello kitty!");
                break;
            case YourFavoriteTVShow:
                System.out.println("Your idol says *ugh*");
                break;
        }

        System.out.println(" ");
        System.out.println("Let's use a switch to greet *CATS*");
        TierList c = TierList.CATS;

        switch (c) {
            case DOGS:
                System.out.println("Your idol says hi doggo!");
                break;
            case CATS:
                System.out.println("Your idol says Hello kitty!");
                break;
            case YourFavoriteTVShow:
                System.out.println("Your idol says *ugh*");
                break;
        }

        System.out.println(" ");
        System.out.println("Let's use a switch to greet *YourFavoriteTVShow*");
        TierList y = TierList.YourFavoriteTVShow;

        switch (y) {
            case DOGS:
                System.out.println("Your idol says hi doggo!");
                break;
            case CATS:
                System.out.println("Your idol says Hello kitty!");
                break;
            case YourFavoriteTVShow:
                System.out.println("Your idol says *ugh*");
                break;
        }
    }
}