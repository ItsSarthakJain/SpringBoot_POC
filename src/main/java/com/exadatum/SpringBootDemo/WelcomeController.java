package com.exadatum.SpringBootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {



    private welcomeService retrival_service=new welcomeService();

    @RequestMapping("/welcome")
    public String Welcome()
    {
        return retrival_service.retriveWelcomeMessage();

    }
}
class welcomeService{
    public String retriveWelcomeMessage()
    {
        return "Successfully returned message using private class";
    }
}
