package az.iradaslibrary.iradalibrary.repository;

import az.iradaslibrary.iradalibrary.entity.LibraryEntity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity,Long> {

}
