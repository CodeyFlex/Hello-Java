package sql_Databases_Tutorial.com.dao;

import sql_Databases_Tutorial.com.entities.Person;

import java.util.List;

public interface PersonDao {

    void createPersonTable();

    void insert(Person person);

    Person selectById(int id);

    List<Person> selectAll();

    void delete(int id);

    void update(Person person, int id);
}
