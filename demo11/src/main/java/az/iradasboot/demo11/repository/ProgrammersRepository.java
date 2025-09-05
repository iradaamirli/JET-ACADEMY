package az.iradasboot.demo11.repository;

import az.iradasboot.demo11.entity.ProgrammerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammersRepository extends JpaRepository<ProgrammerEntity , Long> {
}
