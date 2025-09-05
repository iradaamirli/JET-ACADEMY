package az.iradasboot.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String username;
    private String password;

    @OneToOne(mappedBy = "person" , cascade = CascadeType.ALL)
    private PersonProfileEntity profile;

    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List<OrderssEntity> orders = new ArrayList<>();
}
