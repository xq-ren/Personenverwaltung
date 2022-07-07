package ch.bbw;

import ch.bbw.model.Person;
import ch.bbw.repository.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class MainController {
    private PersonRepository personRepository;

    public MainController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/form/{id}")
    public String form(@PathVariable long id, Model model) {
        model.addAttribute("form", personRepository.findById(id));
        return "form";
    }

    @GetMapping("/new")
    public String getNewPerson(Model model) {
        model.addAttribute("person", new Person());
        return "new";
    }

    @PostMapping("/new")
    public String newPerson(@ModelAttribute Person person, Model model) {
        model.addAttribute("person", new Person());
        System.out.println(person.getFirstname());
        return "new";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Person person) {
        personRepository.save(person);
        return "edit";
    }

}
