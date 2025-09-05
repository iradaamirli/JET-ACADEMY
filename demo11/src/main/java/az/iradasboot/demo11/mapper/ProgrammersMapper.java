//package az.iradasboot.demo11.mapper;
//
//import az.iradasboot.demo11.dto.ProgrammersDto;
//import az.iradasboot.demo11.dto.ProgrammingLanguageDto;
//import az.iradasboot.demo11.entity.ProgrammerEntity;
//import az.iradasboot.demo11.entity.ProgrammingLanguageEntity;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Component
//public class ProgrammersMapper {
//
//    public ProgrammingLanguageDto languageEntityToDto(ProgrammingLanguageEntity language){
//        return ProgrammingLanguageDto.builder()
//                .language(language.getLanguage())
//                .build();
//    }
//    public Set<ProgrammingLanguageDto> languageSetToDtoSet(Set<ProgrammingLanguageEntity> languageEntities){
//        Set<ProgrammingLanguageDto> dtoSet = new HashSet<>();
//        for (ProgrammingLanguageEntity l : languageEntities){
//            dtoSet.add(languageEntityToDto(l));
//        }
//        return dtoSet;
//
//    }
//
//    public ProgrammersDto programmerEntityToDto(ProgrammerEntity programmerEntity){
//        return ProgrammersDto.builder()
//                .fname(programmerEntity.getFname())
//                .lname(programmerEntity.getLname())
//                .languages(languageSetToDtoSet(programmerEntity.getProgrammingLanguage()))
//                .build();
//
//    }
//    public List<ProgrammersDto> programmerListToDtoList(List<ProgrammerEntity> programmerEntityList){
//        List<ProgrammersDto> dtoList = new ArrayList<>();
//        for (ProgrammerEntity p : programmerEntityList){
//            dtoList.add(programmerEntityToDto(p));
//        }
//        return dtoList;
//    }
//}
