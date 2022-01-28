package com.example.xavecoding.webschoolrecods.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloController {

  @GetMapping("/hello")
  public ModelAndView hello(){
    ModelAndView mv = new ModelAndView("hello");
    mv.addObject("name", "Iaskara Thais de Souza Pimentel");
    return mv;
//    o spring vai renderizar o arquivo templates/hello.html
  }

//buscou dentro dos controllers a action que tem o mapeamento para essa url
  @GetMapping("/hello-model")
  public String hello(Model model){
    model.addAttribute("name", "Iaskara Pimentel");
    return "hello";
//    o spring vai renderizar o arquivo templates/hello.html
  }

  @GetMapping("/hello-servlet")
  public String hello(HttpServletRequest request){
    request.setAttribute("name", "Iaiaiiiiii");
    return "hello";
//    o spring vai renderizar o arquivo templates/hello.html
  }
}
