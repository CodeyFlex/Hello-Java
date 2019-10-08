package Uni_Projects.RandomDice;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dicethrow");
        System.out.println("The dice has been thrown");
        System.out.println(RandomDice.yhrow());

        int i = 0;
        while (i < 100) {
            System.out.println(RandomDice.yhrow());
            i++;
        }
    }
}
