package week9.day1.todosql.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import week9.day1.todosql.Entity.ToDo;
import week9.day1.todosql.Repository.ToDoRepository;

@Controller
public class ToDoController {

  @Autowired
  private ToDoRepository toDoRepository;

  @GetMapping({"/", "list"})
  public String list(Model model, @RequestParam(value="isActive", required = false)Boolean isDone) {
    if(isDone != null && isDone){
      model.addAttribute("todos", toDoRepository.findByDone(!isDone));
    } else {
      model.addAttribute("todos", toDoRepository.findAll());
    }
    return "todoList";
  }

  @GetMapping({"addtodo"})
  public String addTask(Model model) {
    model.addAttribute("addtask", new ToDo());
    return "addtodo";
  }

  @PostMapping({"/", "list"})
  public String addTask(@ModelAttribute ToDo todo) {
    toDoRepository.save(todo);
    return "redirect:/list";
  }

  @PostMapping("{id}/delete")
  public String deleteTask(@PathVariable Long id) {
    toDoRepository.deleteById(id);
    return "redirect:/list";
  }

  @GetMapping({"{id}/edit"})
  public String editTask(Model model, @PathVariable Long id) {
    ToDo modifiedTodo = toDoRepository.findById(id).get();
    model.addAttribute("editTask", modifiedTodo);
    return "edit";
  }

  @PostMapping("{id}/edit")
  public String editTask(@ModelAttribute ToDo modifiedTodo) {
    System.out.println(modifiedTodo.toString());
    toDoRepository.save(modifiedTodo);
    return "redirect:/list";
  }
}
