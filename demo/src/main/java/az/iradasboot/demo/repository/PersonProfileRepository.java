package az.iradasboot.demo.repository;

import az.iradasboot.demo.entity.PersonProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonProfileRepository extends JpaRepository<PersonProfileEntity,Long> {
}
