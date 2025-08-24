//package az.iradasboot.demo.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import java.time.LocalDate;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Table (name = "Library")
//public class LibraryEntity {
//    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    Long id;
//    private String bookName;
//    private String author;
//    private String category;
//    @CreationTimestamp
//    private LocalDate createdAt;
//    @UpdateTimestamp
//    private LocalDate updatedAt;
//
//    public LibraryEntity(String bookName, String author, String category) {
//        this.bookName = bookName;
//        this.author = author;
//        this.category = category;
//    }
//}
