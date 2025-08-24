//package az.iradasboot.demo.repository;
//
//import az.iradasboot.demo.dto.RestaurantResponseDto;
//import az.iradasboot.demo.entity.RestaurantEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public  interface RestaurantsRepository extends JpaRepository<RestaurantEntity,Long> {
//    @Query(nativeQuery = true, value = " " +
//            " SELECT r.id, r.name,r.location, o.name " +
//            " FROM restaurant as r left join orders as o on " +
//            " r.orders_id = o.id where r.id = :id")
//    RestaurantResponseDto getRestaurantData(@Param("id") Long id);
//}
