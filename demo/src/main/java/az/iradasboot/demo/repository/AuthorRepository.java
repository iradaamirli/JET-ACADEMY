//package az.iradasboot.demo.repository;
//
//import az.iradasboot.demo.dto.AuthorResponseDto;
//import az.iradasboot.demo.entity.AuthorEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {
//    @Query(nativeQuery = true, value = "select fname from author where id = :id")
//    AuthorResponseDto getAuthor(@Param("id") Long id);
//}
