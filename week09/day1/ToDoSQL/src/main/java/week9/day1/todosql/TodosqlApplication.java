package week9.day1.todosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import week9.day1.todosql.Entity.ToDo;
import week9.day1.todosql.Repository.ToDoRepository;

@SpringBootApplication
public class ToDoSqlApplication implements CommandLineRunner {

  @Autowired
  private ToDoRepository toDoRepository;

  public static void main (String[] args) {
    SpringApplication.run(ToDoSqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new ToDo("test1", false, false));
    toDoRepository.save(new ToDo("test2", false, false));
    toDoRepository.save(new ToDo("test3", false, false));
    toDoRepository.save(new ToDo("test4", false, false));

  }
}

