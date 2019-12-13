package sql_Databases_Tutorial;

import sql_Databases_Tutorial.com.daoImplementation.PersonDaoImpl;
import sql_Databases_Tutorial.com.entities.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonDaoImpl pdi = new PersonDaoImpl();
        //pdi.createPersonTable();
        //Person person = new Person("Martin", "Martinsen");
        //pdi.insert(person); //Insert person into table
        //Person person = pdi.selectById(1); //Selection first person, being Martin
        //System.out.println(person.getId()+", "+person.getFirstName()+", "+person.getLastName());
        //pdi.delete(3); //Deletes a person from my database
        //Person person = new Person("Mortin", "Martinsen"); //Updates the person in the database
        //pdi.update(person, 1); //Selects the person to update by schema and id


        List<Person> persons = pdi.selectAll(); //Gets all the people in my database
        for (Person person : persons) {
            System.out.println(person.getId() + ", " + person.getName() + ", " + person.getJob());
        }
    }
}
