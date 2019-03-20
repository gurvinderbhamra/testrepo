package com.ttn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

//----------------------------------------------------------------------------
//abstract controller

/*public class StudentController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("student");
        return modelAndView;
    }
}*/

//-------------------------------------------------------------------------------
//MultiActionController

/*public class StudentController extends MultiActionController{

    public ModelAndView student(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ModelAndView modelAndView = new ModelAndView("/student");
        return modelAndView;
    }

    public void responseMultiActionController(HttpServletRequest request, HttpServletResponse response)throws Exception{
        response.setContentType("text/html");
        response.getWriter().println("<b>Hello MultiActionController</b>");
    }

    public String hello{
        return "<b>Hello method in Annotated Student Controller</b>";
    }
}*/

//--------------------------------------------------------------------------------
//using annotation on studenController

@Controller
public class StudentController{
    @RequestMapping("/student")
    @ResponseBody
    String index(){
        return "<b>Used annotation on StudentController......</b>";
    }

    @RequestMapping("/hello")
    @ResponseBody
    String hello(){
        return "<b> hello .... annotation on StudentController......</b>";
    }

    @RequestMapping("/")
    @ResponseBody
    ModelAndView student(){
        return new ModelAndView("/index");
    }

    @RequestMapping("/helloWorld")
    @ResponseBody
    ModelAndView helloWorld(){
        return new ModelAndView("/hello");
    }

    @RequestMapping("/{username}")
    @ResponseBody
    String returnCountryName(@PathVariable("username") String username) {
        return username;
    }

    @RequestMapping("/nameAndAge/{name}/{age}")
    @ResponseBody
    String returnCountryName(@PathVariable Map<String, String> requestMap) {
        return requestMap.get("name") + " : " + requestMap.get("age");
    }

    @RequestMapping(value = "/requestParam", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("username") String username, @RequestParam("age") String age){
        return "Username : " + username + ", Age : " + age;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    String submit(@ModelAttribute("studentCO") StudentCO  studentCO){
        return "Name : " + studentCO.getName() + ", Age : " + studentCO.getAge();
    }

    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","Spring MVC Demo");
    }
}
