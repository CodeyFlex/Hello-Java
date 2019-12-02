package FreeForm_Learning.Text_Adventure.Characters;

public class Goblin extends Character {

    //Character Actions
    public void Greeting() {
        System.out.println("HAAI!");
    }

    //Character Variables

    Goblin() {
        setName("Goblin");
        setHealth(100);
        setDamage(10);
        setCharisma(1);
    }

}
