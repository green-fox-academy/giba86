package com.example.h2.todos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class ToDo {
  private Long id;
  private String title;
  private Boolean urgent = false;
  private Boolean done = false;

}
