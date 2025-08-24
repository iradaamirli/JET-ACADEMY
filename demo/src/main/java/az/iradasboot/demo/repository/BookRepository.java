//package az.iradasboot.demo.repository;
//
//import az.iradasboot.demo.dto.AuthorResponseDto;
//import az.iradasboot.demo.dto.BookDto;
//import az.iradasboot.demo.dto.BookResponseDto;
//import az.iradasboot.demo.entity.BookEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface BookRepository extends JpaRepository<BookEntity,Long> {
////    @Query(nativeQuery = true, value = " " +
////            " SELECT b.id,b.name,b.category,a.fname " +
////            " FROM  author as a left join book as b  on " +
////            " b.author_id = a.id where b.id = :id")
////    AuthorResponseDto getBookData(@Param("id") Long id);
//
//    @Query(nativeQuery = true, value = "SELECT name from book where author_id = :authorId")
//    List<BookDto> findByAuthorId(Long authorId);
//}
