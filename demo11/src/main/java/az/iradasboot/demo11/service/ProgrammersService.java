//package az.iradasboot.demo11.service;
//
//import az.iradasboot.demo11.dto.ProgrammersDto;
//import az.iradasboot.demo11.mapper.ProgrammersMapper;
//import az.iradasboot.demo11.repository.ProgrammersRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class ProgrammersService {
//    private final ProgrammersRepository programmersRepository;
//    private final ProgrammersMapper programmersMapper;
//
//
//    public List<ProgrammersDto> getProgrammers(){
//        return programmersMapper.programmerListToDtoList(programmersRepository.findAll());
//    }
//}
