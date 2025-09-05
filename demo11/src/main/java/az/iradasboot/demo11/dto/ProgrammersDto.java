package az.iradasboot.demo11.dto;

import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProgrammersDto {
    private String fname;
    private String lname;
    private Set<ProgrammingLanguageDto> languages;
}
