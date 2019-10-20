package Sololearn.Comparing_Objects;

import java.util.Objects;

public class Utility { //Setting up references and object values
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utility utility = (Utility) o;
        return name.equals(utility.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    Utility(String n) {
        name = n;
    } //Right click class and select generate, and then hash code and equals, and all this code above appears.
}
