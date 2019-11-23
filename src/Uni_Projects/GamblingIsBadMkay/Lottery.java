package Uni_Projects.GamblingIsBadMkay;

import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        {
            System.out.println("5 random numbers");
            Random randomLottery = new Random();
            for (int r = 0; r < 5; r++)
                System.out.println(randomLottery.nextInt(500));
        }
        System.out.println("\n5 random numbers from the seed 17");
        Random lotteryGameSeventeen = new Random(17);
        for (int i = 0; i < 5; i++)
            System.out.println(lotteryGameSeventeen.nextInt(100) + " "); //Same numbers over and over, because it's from the same seed
    }
}
