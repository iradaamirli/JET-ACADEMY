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
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//public class ProgrammerEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String fname;
//    private String lname;
//
//    @ManyToMany
//    @JoinTable(name = "programmers-language"
//            , joinColumns = @JoinColumn(name = "programmer_id")
//            ,inverseJoinColumns = @JoinColumn(name = "language_id"))
//    private Set<ProgrammingLanguageEntity> programmingLanguage = new HashSet<>();
//}
