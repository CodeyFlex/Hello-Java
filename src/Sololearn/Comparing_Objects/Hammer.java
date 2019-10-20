package Sololearn.Comparing_Objects;

public class Hammer {
    public static void main(String[] args) {
        Utility hammer1 = new Utility("BAM");
        Utility hammer2 = new Utility("BAM"); //Seemingly the same
        System.out.println("Let's compare objects using the equality testing operator: ");
        System.out.println(hammer1 == hammer2); //outputs false cause the comparison is being made between the references, and not the object values. (two different references or memory locations).

        System.out.println(" ");
        System.out.println("Now let's use the equals method instead: ");
        System.out.println(hammer1.equals(hammer2)); //Outputs true because equals evaluates the values in the objects
    }
}
