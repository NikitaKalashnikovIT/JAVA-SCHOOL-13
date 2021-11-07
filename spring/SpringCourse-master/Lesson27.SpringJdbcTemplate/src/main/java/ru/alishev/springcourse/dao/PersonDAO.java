package ru.alishev.springcourse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class PersonDAO {
static int id1 = 40;
    private final JdbcTemplate jdbcTemplate;
//внедрение спомощью конструктора
    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //отображение построчно таблици
    public List<Person> index() {
        return jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person show(int id) {
        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
                .stream().findAny().orElse(null);
    }

    public void save(Person person) {
//        jdbcTemplate.update("INSERT INTO Person VALUES(1, ?, ?, ?)", person.getName(), person.getAge(),
//                person.getEmail());
        id1++;
jdbcTemplate.update("INSERT INTO Person VALUES(?, ?, ?)", person.getName(), person.getAge(),
    person.getEmail());
//                jdbcTemplate.update("INSERT INTO Person VALUES( name, age, email)", person.getName(), person.getAge(),
//                person.getEmail());
//jdbcTemplate.update("INSERT INTO Person ( name, age, email)VALUES( person.getName(), person.getAge(), person.getEmail())");
        /*
          INSERT INTO Customers (city, cnamе, cnum)
     VALUES ('London', 'Honman', 2001);
         */
    }

    public void update(int id, Person updatedPerson) {
        jdbcTemplate.update("UPDATE Person SET name=?, age=?, email=? WHERE id=?", updatedPerson.getName(),
                updatedPerson.getAge(), updatedPerson.getEmail(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
    }
}
