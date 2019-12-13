package sql_Databases_Tutorial.com.entities;

public class Person {

    private int id;
    private String name;
    private String job;
    private String race;
    private String faction;

    public Person() {

    }
    public Person(String name, String job, String race, String faction) {
        this.name = name;
        this.job = job;
        this.race = race;
        this.faction = faction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }
}
