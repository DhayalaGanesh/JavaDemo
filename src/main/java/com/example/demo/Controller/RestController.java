package com.example.demo.Controller;
import com.example.demo.Model.GlobalProperties;
import com.example.demo.Model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private GlobalProperties gp;

    @GetMapping("/index")
    public ResponseModel Index() throws Exception {
        int integer = 5;
        int[] integerArray = new int[5];
        integerArray[0] = 12;
        ResponseModel responseModel = new ResponseModel();

        if(!gp.isIsValidToken()){
            responseModel.setResponseJson("ada dei !");
            return responseModel;
        }
        responseModel.setResponseJson("123");

        return responseModel;
    }
}
