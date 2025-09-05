package az.iradasboot.demo.mapper;

import az.iradasboot.demo.dto.PersonDto;
import az.iradasboot.demo.dto.PersonProfileDto;
import az.iradasboot.demo.entity.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonMapper {
    private final OrdersMapper ordersMapper;

    public PersonDto entityToDto (PersonEntity person){
        var personProfile = person.getProfile();
        return PersonDto.builder()
                .username(person.getUsername())
                .password(person.getPassword())
                .personProfile(
                        PersonProfileDto.builder()
                                .name(personProfile.getName())
                                .gender(personProfile.getGender())
                                .surname(personProfile.getSurname())
                                .build())
                .orderssDtos(ordersMapper.entityListToDtoList(person.getOrders()))
                .build();
    }

}
