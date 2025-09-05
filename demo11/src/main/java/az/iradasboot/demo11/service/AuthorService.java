//package az.iradasboot.demo11.service;
//
//import az.iradasboot.demo11.dto.AuthorDto;
//import az.iradasboot.demo11.mapper.AuthorMapper;
//import az.iradasboot.demo11.repository.AuthorRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Set;
//
//@Service
//@RequiredArgsConstructor
//public class AuthorService {
//    private final AuthorRepository authorRepository;
//    private final AuthorMapper authorMapper;
//
//    public List<AuthorDto> getAllAuthors() {
//        return authorMapper.authorEntityListToDtoList(authorRepository.findAll());
//    }
//}
