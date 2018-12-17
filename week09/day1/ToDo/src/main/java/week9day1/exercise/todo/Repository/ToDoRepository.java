package week9day1.exercise.todo.Repository;

import org.springframework.data.repository.CrudRepository;
import week9day1.exercise.todo.Model.ToDo;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
  List<ToDo> findAllByTitle(String name);
}
