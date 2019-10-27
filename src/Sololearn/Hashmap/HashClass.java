package Sololearn.Hashmap;

import java.util.HashMap;

public class HashClass {
    public static void main(String[ ] args) {
        HashMap<String, fighterStats> points = new HashMap<String, fighterStats>();

        fighterStats Conor = new fighterStats(9000,21); //Creating new fighter with int values
        points.put("Conor", Conor);
        points.put("Nick", new fighterStats(9000,26) );
        points.put("Nate", new fighterStats(9000,21) );
        System.out.println("Fights won by Conor: "+ points.get("Conor").fightsWon);
        System.out.println("Fights won by Nick: "+ points.get("Nick").fightsWon);
        System.out.println("Fights won by Nate: "+ points.get("Nate").fightsWon);
    }
}
