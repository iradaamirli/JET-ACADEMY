//package az.iradasboot.demo.repository;
//
//import az.iradasboot.demo.entity.GroupEntity;
//import az.iradasboot.demo.enumm.Sector;
//import jakarta.transaction.Transactional;
//import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.NativeQuery;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface GroupRepository extends JpaRepository<GroupEntity, Long> {
//    @Query(nativeQuery = true ,value = "select * from grouupps")
//    List<GroupEntity> getAllGroups();
//
//    @Query(nativeQuery = true,value = "select * from grouupps where id = :id")
//    Optional<GroupEntity> getGroup(@Param("id") Long id);
//
//    @Modifying
//    @Transactional
//    @Query(nativeQuery = true, value = "insert into grouupps(name,capacity,sector) values " +" (:name, :capacity, :sector )")
//    void addGroup(@Param("name") String name , @Param("capacity") Integer capacity, @Param("sector")Sector sector);
//
//    @Modifying
//    @Transactional
//    @Query(nativeQuery = true, value = "update grouupps set capacity= :capacity, sector= :sector where id = :id")
//    void update (@Param("capacity") Integer capacity, @Param("sector") Sector sector, @Param("id") Long id);
//}
