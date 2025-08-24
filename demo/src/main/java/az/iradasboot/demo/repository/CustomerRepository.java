//package az.iradasboot.demo.repository;
//
//import az.iradasboot.demo.dto.CustomerResponseDto;
//import az.iradasboot.demo.entity.OrderEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface CustomerRepository extends JpaRepository<OrderEntity, Long> {
//    @Query (nativeQuery = true,  value = " " +
//            "SELECT c.id,c.fname,c.surname,o.name " +
//            " FROM customers as c left join orders as o on" +
//            " c.orders_id = o.id where c.id = :id")
//    CustomerResponseDto getCustomerData(@Param("id") Long id);
//}
