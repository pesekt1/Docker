package cloud.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ExtraController {

    //mapping the index.html
    @RequestMapping("home")
    public String home(){
        return "index";
    }
}
