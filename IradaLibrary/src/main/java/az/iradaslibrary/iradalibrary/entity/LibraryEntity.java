package az.iradaslibrary.iradalibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LibraryEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
            String name;
            String category;
            String author;
            Double price;
            LocalDate pickupDate;

}
