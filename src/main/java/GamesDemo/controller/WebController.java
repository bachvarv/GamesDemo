package GamesDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {


    @GetMapping(value = "/greeting")
    public String greetingMethod(@RequestParam(name="name", required = false,
    defaultValue = "World") String name, Model model )
    {
        model.addAttribute("name", name);
        return "greeting";
    }
}
