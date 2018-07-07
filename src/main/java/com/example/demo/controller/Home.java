/**
 * @author Miguel Rojas
 */
package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping(
            value = "/demo/home",
            method = RequestMethod.GET
    )
    public String holaMundo() {
        return "Hola Mundo";
    }
}
