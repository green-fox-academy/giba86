package week9day1.exercise.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import week9day1.exercise.todo.Model.ToDo;
import week9day1.exercise.todo.Repository.ToDoRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
  @Autowired
  private ToDoRepository toDoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }



  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new ToDo("test"));
    toDoRepository.save(new ToDo("buy milk"));
    toDoRepository.save(new ToDo("rest"));
  }
}

