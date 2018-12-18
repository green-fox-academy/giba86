package week9.day1.todosql.Repository;

import org.springframework.data.repository.CrudRepository;
import week9.day1.todosql.Entity.ToDo;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
  List<ToDo> findByDone(Boolean bool);

}
