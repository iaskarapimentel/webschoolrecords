package com.example.xavecoding.webschoolrecods.controllers;

import com.example.xavecoding.webschoolrecods.models.StatusTeacher;
import com.example.xavecoding.webschoolrecods.models.Teacher;
import com.example.xavecoding.webschoolrecods.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class TeacherController {

// Spring sees that this is a dependency so it automatically injects it without us having to pass the controller  @Autowired
  private TeacherRepository teacherrepository;

//  All the time that you write in the browser '/teachers' will come to this action and load this page
//  my entity is already mapped to the table in the database
  @GetMapping("/teachers")
  public ModelAndView index(){
//    Create a list - findAll() method return a list of teachers
    List<Teacher> teachersList =  this.teacherrepository.findAll();
//    Data model that is linked to the page
//    this class is used to specify the view that will be rendered and what data it will use for that.
    ModelAndView mv = new ModelAndView("teachers/index");
    mv.addObject("teachersList", teachersList);

    return mv;
  }

//  Intention - shows a form to create new teacher
//  action where will receive
  @GetMapping("/teacher/new")
  public String newRoute(){
    return "teachers/new";
  }


}
