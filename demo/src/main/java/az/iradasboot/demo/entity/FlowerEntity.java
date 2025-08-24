//package az.iradasboot.demo.entity;
//
//import az.iradasboot.demo.enumm.Color;
//import az.iradasboot.demo.enumm.Type;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import java.time.LocalDate;
//
//@Entity
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Table(name = "flowers")
//public class FlowerEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String name;
//    private Integer price;
//    private Type type;
//    private Color color;
//    @CreationTimestamp
//    private LocalDate createdAt;
//    @UpdateTimestamp
//    private LocalDate updatedAt;
//
//
//
//}
