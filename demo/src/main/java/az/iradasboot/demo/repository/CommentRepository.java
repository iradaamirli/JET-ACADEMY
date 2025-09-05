//package az.iradasboot.demo.repository;
//
//import az.iradasboot.demo.dto.CommentDto;
//import az.iradasboot.demo.entity.CommentEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
//    List<CommentEntity> findByProductId(Long productId);
//
//    @Query(nativeQuery = true, value = " " +
//            " SELECT c.id,c.comment, c.product_id, c.users_id, p.name,u.full_name " +
//            " FROM comments as c inner join products as p on  p.id = c.product_id " +
//            " inner join users as u on  u.id = c.users_id ")
//    List<CommentDto> findAllCommentWithJoin();
//}
