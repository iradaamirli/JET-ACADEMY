//package az.iradasboot.demo.entity;
//
//import az.iradasboot.demo.enumm.Gender;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import java.time.LocalDate;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Builder
//@Table(name = "academy")
//public class AcademyEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String fname;
//    private String lname;
//    private Integer age;
//    @Enumerated(EnumType.STRING)
//    Gender gender;
//    private LocalDate startTime;
//    private LocalDate endTime;
//    @CreationTimestamp
//    private LocalDate createdAt;
//    @UpdateTimestamp
//    private LocalDate updatedAt;
//}
