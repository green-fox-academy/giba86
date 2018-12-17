package week9day1.exercise.todo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import week9day1.exercise.todo.Repository.ToDoRepository;

@Controller
public class ToDoController {

  @Autowired
  private ToDoRepository toDoRepository;



  @RequestMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", toDoRepository.findAll());
    return "todoList";
  }

}
