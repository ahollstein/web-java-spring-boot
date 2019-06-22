package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(required = false) String name) {
        if (name == null) {
            return "<h1>Hallo Welt, here I am! </h1>";
            }
        else{
            return "<h1>Hallo Welt, here I am, " + name + " the cool!</h1>";
            }
        
    }

    
}
