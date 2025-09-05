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
//public class BookEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String category;
//
//    @ManyToMany(mappedBy = "books")
//    private Set<AuthorEntity> authors = new HashSet<>();
//}
