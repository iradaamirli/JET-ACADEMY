package az.iradasboot.demo.controller;

import az.iradasboot.demo.dto.PersonDto;
import az.iradasboot.demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping("/{id}")
    public PersonDto getPerson(@PathVariable Long id){
        return personService.getPerson(id);
    }
}
