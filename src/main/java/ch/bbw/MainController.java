package ch.bbw;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/person")
    public String person(Model model){
        return "person";
    }

}
