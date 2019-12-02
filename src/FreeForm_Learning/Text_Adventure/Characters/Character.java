package FreeForm_Learning.Text_Adventure.Characters;

public abstract class Character {

    //Character actions

    public void Greeting() {
        System.out.println("Hello!");
    }

    //Character Variables

    private String Name = null;
    private int Health;
    private int Damage;
    private int Charisma;

    //Getters

    public String getName() {
        return Name;
    }
    public int getHealth() {
        return Health;
    }
    public int getDamage() {
        return Damage;
    }
    public int getCharisma() {
        return Charisma;
    }

    //Setters

    public void setName(String characterName) {
        this.Name = characterName;
    }
    public void setHealth(int characterHealth) {
        this.Health = characterHealth;
    }
    public void setDamage(int characterDamage) {
        this.Damage = characterDamage;
    }
    public void setCharisma(int characterCharisma) {
        this.Charisma = characterCharisma;
    }
}
