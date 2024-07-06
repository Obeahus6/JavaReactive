package obeahus.springframework.reactive_programing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DummyControler {

    @RequestMapping("/")
    String displayDefaultMessage(){
        return "Hello Obeahus :)";
    }

}
