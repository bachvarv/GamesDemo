package GamesDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GamesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamesDemoApplication.class, args);
    }

    @GetMapping("/")
    public String index()
    {
        return "index";
    }
}


