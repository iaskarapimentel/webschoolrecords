package com.example.xavecoding.webschoolrecods.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Teacher {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;
  private BigDecimal salary;
  @Enumerated(EnumType.STRING)
  private StatusTeacher status;

  public Teacher() {
  }

  public Teacher(String name, BigDecimal salary, StatusTeacher status) {
    this.name = name;
    this.salary = salary;
    this.status = status;
  }

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

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public StatusTeacher getStatus() {
    return status;
  }

  public void setStatus(StatusTeacher status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Teacher{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", salary=" + salary +
        ", status=" + status +
        '}';
  }
}
