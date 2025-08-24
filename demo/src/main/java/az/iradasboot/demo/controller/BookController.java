//package az.iradasboot.demo.controller;
//
//import az.iradasboot.demo.dto.AuthorBookDto;
//import az.iradasboot.demo.dto.AuthorResponseDto;
//import az.iradasboot.demo.dto.BookResponseDto;
//import az.iradasboot.demo.service.BookService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/v11/book")
//public class BookController {
//    public final BookService bookService;
//
//    @GetMapping("/{id}")
//    public AuthorBookDto getBook(@PathVariable Long id){
//        return bookService.getBook(id);
//    }
//
//}
