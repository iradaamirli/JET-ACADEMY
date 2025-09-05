package az.iradasboot.demo.service;

import az.iradasboot.demo.dto.PersonDto;
import az.iradasboot.demo.entity.PersonEntity;
import az.iradasboot.demo.mapper.PersonMapper;
import az.iradasboot.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
private final PersonMapper personMapper;
    public PersonDto getPerson(Long id){
        PersonEntity person = personRepository.findById(id).orElseThrow();
        return personMapper.entityToDto(person);
    }
}
