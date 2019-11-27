package org.academiadecodigo.stringrays.controller;

import org.academiadecodigo.stringrays.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HelloController {

    //Map the URL/Verb to the method

    //@RequestMapping(method = RequestMethod.GET, value = "/hello")
    @GetMapping(value = "/hello")
    public String sayHello(Model model) {

        Customer customer = new Customer();

        customer.setFirstName("Denise");
        customer.setLastName("Machado");
        customer.setPhone("91182834");
        customer.setEmail("aaahdsfh@hotmail.com");
        customer.setId(22);

        //Add an attribute to the request
        model.addAttribute("batata", customer);

        return "index";
    }



}
