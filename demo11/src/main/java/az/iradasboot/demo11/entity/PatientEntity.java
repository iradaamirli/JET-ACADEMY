//package az.iradasboot.demo11.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.time.LocalDate;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class PatientEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String fname;
//    private String lname;
//    private LocalDate dob;
//
//    @ManyToMany(mappedBy = "patients")
//    private Set<DoctorEntity> doctors = new HashSet<>();
//}
