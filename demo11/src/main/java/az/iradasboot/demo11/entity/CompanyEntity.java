//package az.iradasboot.demo11.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//public class CompanyEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String companyName;
//    private String sector;
//
//    @OneToMany(mappedBy = "company"  , cascade = CascadeType.ALL)
//    private List<ProjectEntity> project = new ArrayList<>();}
