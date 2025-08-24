//package az.iradasboot.demo.repository;
//
//import az.iradasboot.demo.entity.FlowerEntity;
//import az.iradasboot.demo.enumm.Color;
//import az.iradasboot.demo.enumm.Type;
//import jakarta.transaction.Transactional;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface FlowerRepository extends JpaRepository<FlowerEntity,Long> {
//    @Query(nativeQuery = true, value = "select * from flowers")
//    List<FlowerEntity> getAllFlowers();
//
//    @Query( nativeQuery = true, value = "select * from flowers where id = :id")
//    FlowerEntity getFlower(@Param("id") Long id);
//
//    @Transactional
//    @Modifying
//    @Query (nativeQuery = true, value = "insert into flowers (name,price,type,color) values " + " (:name, :price, :type , :color)")
//    void addGroup(@Param("name") String name, @Param("price") Integer price, @Param("type")Type type, @Param("color") Color color);
//
//    @Transactional
//    @Modifying
//    @Query(nativeQuery = true, value = "update flowers set type = :type, color = :color where id = :id")
//    void update (@Param("type") Type type, @Param("color") Color color, @Param("id") Long id);
//
//
//    void addFlower(String name, Integer price, Type type, Color color);
//}
