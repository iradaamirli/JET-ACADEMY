//package az.iradasboot.demo.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.time.LocalDate;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Table (name = "Mobile Store")
//public class MobileStoreEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String model;
//    private String marka;
//    private String category;
//    private Long price;
//    @CreationTimestamp
//    private LocalDate createdAt;
//    @UpdateTimestamp
//    private LocalDate updatedAt;
//    public MobileStoreEntity (String model, String marka, String category, Long price){
//        this.model = model;
//        this.marka = marka;
//        this.category = category;
//        this.price = price;
//
//
//    }
//}
