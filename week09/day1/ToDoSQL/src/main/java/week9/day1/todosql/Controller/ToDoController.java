package week9.day1.todosql.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import week9.day1.todosql.Repository.ToDoRepository;

@Controller
public class ToDoController {

  @Autowired
  private ToDoRepository toDoRepository;



  @GetMapping({"/", "/list"})
  public String list(Model model, @RequestParam(value="isActive", required = false)Boolean isDone) {
    if(isDone != null && isDone){
      model.addAttribute("todos", toDoRepository.findByDone(!isDone));
    } else {
      model.addAttribute("todos", toDoRepository.findAll());
    }
    return "todoList";
  }
  @PostMapping({"/", "/list"})
  public String listUpdate(Model model) {

    return "todoList";
  }
}
