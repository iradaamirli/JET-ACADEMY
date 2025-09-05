//package az.iradasboot.demo11.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class DoctorEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String name;
//    private String surname;
//    private String specialization;
//
//    @ManyToMany
//    @JoinTable(name = "doctor_patient" ,
//            joinColumns = @JoinColumn(name = "doctor_id"),
//            inverseJoinColumns = @JoinColumn(name = "patient_id"))
//
//    private Set<PatientEntity> patients = new HashSet<>();
//}
