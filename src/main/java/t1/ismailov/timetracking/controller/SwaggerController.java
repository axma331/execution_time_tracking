package t1.ismailov.timetracking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {

    @RequestMapping("/")
    public String index() {
        return "redirect:swagger-ui.html";
    }

}