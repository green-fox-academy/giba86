package week9.day1.todosql.Entity;

import javax.persistence.*;
@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
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

  public ToDo(String title, Boolean urgent, Boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }



  public Long getId() {
    return id;
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

  public void setId(Long id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "ToDo{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", urgent=" + urgent +
            ", done=" + done +
            '}';
  }
}