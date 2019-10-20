package Sololearn.Inner_class;

public class Human { //Outer class

    String name;

    Human(String i) {
        name = i;
        Hands b = new Hands();
        b.clap();
    }

    private class Hands { //Inner class
        public void clap() {
            System.out.println(name + " is clapping");
        }
    }
}
