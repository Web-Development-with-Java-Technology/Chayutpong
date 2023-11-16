package nc.it.chayutpong.first.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller     //@ = Annotation
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }

    @GetMapping("/product")
    @ResponseBody
    public String product(){
        return "product";
    }
    @GetMapping("/product/{id}")
    @ResponseBody
    public String product(@PathVariable int id){
        return "<h1>product</h1> <p>ID: "+id+"</p>";
    }
    @GetMapping("/product/name/{name}")
    @ResponseBody
    public String product(@PathVariable String name){
        return "<h1>product</h1> <p>Name: "+name+"</p>";
    }

    @PostMapping("/product")
    @ResponseBody
    public String CreateProduct(@RequestBody String name){
        return "Create product completed. Name: "+name;
    }
    
}
