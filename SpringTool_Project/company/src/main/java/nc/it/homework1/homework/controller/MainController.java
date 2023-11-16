package nc.it.homework1.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }

    @GetMapping("/employee")
    @ResponseBody
    public String employee(){
        return "<h1>employee</h1>";
    }
    @GetMapping("/employee/{id}")
    @ResponseBody
    public String employee(@PathVariable int id){
        return "<h1>employee</h1> <p>ID: "+id+"</p>";
    }
    @GetMapping("/employee/name/{name}")
    @ResponseBody
    public String employee(@PathVariable String name){
        return "<p>Empolyee Name: "+name+"</p>";
    }
    @GetMapping("/employee/department/{departmentName}")
    @ResponseBody
    public String department(@PathVariable String departmentName){
        return "<p>Empolyee in "+departmentName+"</p>";
    }


    @PostMapping("/CreateEmployee")
    @ResponseBody
    public String CreateEmployee(@RequestBody String name){
        return "Create Employee: "+name;
    }
}
