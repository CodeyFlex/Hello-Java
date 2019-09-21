package Uni_Projects.Calculator;

public class Main {

        public static void main(String[ ] args) {
            System.out.println("My super unique Calculator");

            Calculator calculator = new Calculator();

            System.out.println("Tell me amazing calculator, what's 53 + 23?");
            System.out.println(calculator.sum(53, 23));

            System.out.println("Tell me amazing calculator, what's 58 - 31?");
            System.out.println(calculator.minus(58, 31));

            System.out.println("Tell me amazing calculator, what's 22 * 23");
            System.out.println(calculator.multiply(22, 23));

            System.out.println("Tell me amazing calculator, what's 450 / 85?");
            System.out.println(calculator.divide(450, 85));

            System.out.println("Tell me amazing calculator, what's 55 + 77?");
            System.out.println(calculator.secret(55, 77));
        }
    }
