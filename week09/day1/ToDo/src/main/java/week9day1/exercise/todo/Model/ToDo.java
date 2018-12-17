package week9day1.exercise.todo.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long idOrAnything;
  private String title;
  private Boolean urgent;
  private Boolean done;

  public ToDo() {
    this.title = "test";
    this.urgent = false;
    this.done = false;
  }

  public ToDo(String title) {
    this();
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public Boolean getUrgent() {
    return urgent;
  }

  public Boolean getDone() {
    return done;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(Boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  public Long getIdOrAnything() {
    return idOrAnything;
  }
}

