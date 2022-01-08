package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/index")
    public String Index() throws Exception {
        int integer = 5;
        int[] integerArray = new int[5];
        integerArray[0] = 12;
        if(true){
            return "hehe";
        }

        throw new Exception("error");
    }
}
