package exercise.jointable.Model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "customer")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private Date timeOfAdded;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getTimeOfAdded() {
    return timeOfAdded;
  }

  public void setTimeOfAdded(Date timeOfAdded) {
    this.timeOfAdded = timeOfAdded;
  }
}
