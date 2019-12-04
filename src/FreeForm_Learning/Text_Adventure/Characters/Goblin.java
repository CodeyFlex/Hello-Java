package FreeForm_Learning.Text_Adventure.Characters;

public class Goblin extends Character {

    //Character Actions
    public String Greeting() {
        return "HAAI!";
    }

    //Character Variables

    public Goblin() {
        setName("Goblin");
        setHealth(100);
        setDamage(10);
        setCharisma(1);
        setGold(100);
    }

}
