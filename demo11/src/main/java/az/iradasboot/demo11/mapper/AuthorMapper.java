//package az.iradasboot.demo11.mapper;
//
//import az.iradasboot.demo11.dto.AuthorDto;
//import az.iradasboot.demo11.dto.BookDto;
//import az.iradasboot.demo11.entity.AuthorEntity;
//import az.iradasboot.demo11.entity.BookEntity;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.awt.print.Book;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Component
//
//public class AuthorMapper {
//
//    public BookDto bookEntityToDto(BookEntity bookEntity){
//        return  BookDto.builder()
//                .category(bookEntity.getCategory())
//                .build();
//    }
//
//    public Set<BookDto> bookSetToDtoSet (Set<BookEntity> books){
//        Set<BookDto> dtoSet = new HashSet<>();
//        for (BookEntity b : books){
//            dtoSet.add(bookEntityToDto(b));
//        }
//        return dtoSet;
//    }
//
//    public AuthorDto authorEntityToDto (AuthorEntity authorEntity){
//        return AuthorDto.builder()
//                .name(authorEntity.getName())
//                .books(bookSetToDtoSet(authorEntity.getBooks()))
//                .build();
//    }
//
//    public List<AuthorDto> authorEntityListToDtoList(List<AuthorEntity> authors){
//        List<AuthorDto> dtoList = new ArrayList<>();
//        for (AuthorEntity a : authors){
//            dtoList.add(authorEntityToDto(a));
//        }
//        return dtoList;
//    }
//}
