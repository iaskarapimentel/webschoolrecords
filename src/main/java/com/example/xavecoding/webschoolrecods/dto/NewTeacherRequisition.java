package com.example.xavecoding.webschoolrecods.dto;

import com.example.xavecoding.webschoolrecods.models.StatusTeacher;
import com.example.xavecoding.webschoolrecods.models.Teacher;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

//I want that this class handle all the requisitions of a new teachers form, everything that
// I want the user to entry I was to expose only a few things
public class NewTeacherRequisition {

  @NotBlank
  @NotNull
  private String name;
  @NotNull
  @DecimalMin(value="0.0")
  private BigDecimal salary;
  private StatusTeacher status;

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

  public Teacher toTeacher(){
    Teacher teacher = new Teacher();
    teacher.setName(this.name);
    teacher.setSalary(this.salary);
    teacher.setStatus(this.status);
    return teacher;
  }

  @Override
  public String toString() {
    return "NewTeacherRequisition{" +
        "name='" + name + '\'' +
        ", salary=" + salary +
        ", status=" + status +
        '}';
  }
}
