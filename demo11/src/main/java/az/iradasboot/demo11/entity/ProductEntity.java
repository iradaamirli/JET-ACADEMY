//package az.iradasboot.demo11.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.List;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class ProductEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String name;
//    private Double price;
//
//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private CategoryEntity category;
//
//}
