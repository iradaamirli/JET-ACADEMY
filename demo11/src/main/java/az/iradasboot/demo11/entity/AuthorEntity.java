//package az.iradasboot.demo11.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class AuthorEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String name;
//
//    @ManyToMany
//    @JoinTable(
//            name = "author_books",
//            joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id")
//    )
//    private Set<BookEntity> books = new HashSet<>();
//
//}
