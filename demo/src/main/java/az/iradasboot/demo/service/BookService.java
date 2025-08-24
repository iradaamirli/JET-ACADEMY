//package az.iradasboot.demo.service;
//
//import az.iradasboot.demo.dto.AuthorBookDto;
//import az.iradasboot.demo.dto.AuthorResponseDto;
//import az.iradasboot.demo.dto.BookResponseDto;
//import az.iradasboot.demo.repository.AuthorRepository;
//import az.iradasboot.demo.repository.BookRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class BookService {
//    private final BookRepository bookRepository;
//    private final AuthorRepository authorRepository;
//
//    public AuthorBookDto getBook(Long id){
//        var author = authorRepository.getAuthor(id);
//        var bookList = bookRepository.findByAuthorId(id);
//
//        return new AuthorBookDto(author.getFname(), bookList);
//    }
//}
