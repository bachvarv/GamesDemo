package GamesDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/hello")
    public String greeting(@RequestParam(name="name", required = false,
    defaultValue = "World") String name, Model model )
    {
        System.out.println("Greeting");
        model.addAttribute("name", name);
        return "greeting";
    }
}
