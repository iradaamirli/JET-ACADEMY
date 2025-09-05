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
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class UsersEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    private String name;
//    private String surname;
//    private Integer age;
//
//    @OneToMany(mappedBy = "usersEntities" , cascade = CascadeType.ALL)
//    private List<CardEntity> cards = new ArrayList<>();
//
//}
