package az.iradasboot.demo.dto;

import az.iradasboot.demo.entity.PersonProfileEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDto {
    private Long id;
    private String username;
    private String password;
    private PersonProfileDto personProfile;
    private List<OrderssDto> orderssDtos;

}
