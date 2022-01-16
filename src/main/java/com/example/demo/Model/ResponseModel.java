package com.example.demo.Model;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseModel {
    public String responseJson;
    public HttpStatus responseCode;
    public String errorMessage;
}
