//package az.iradasboot.demo.service;
//
//import az.iradasboot.demo.dto.CommentProductUsersDto;
//import az.iradasboot.demo.dto.ProductCommentDto;
//import az.iradasboot.demo.dto.UsersCommentDto;
//import az.iradasboot.demo.entity.CommentEntity;
//import az.iradasboot.demo.entity.ProductEntity;
//import az.iradasboot.demo.entity.UsersEntity;
//import az.iradasboot.demo.repository.CommentRepository;
//import az.iradasboot.demo.repository.ProductRepository;
//import az.iradasboot.demo.repository.UsersRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Service
//@RequiredArgsConstructor
//public class ProductService {
//    private final ProductRepository productRepository;
//    private final CommentRepository commentRepository;
//    private final UsersRepository usersRepository;
//
//    public CommentProductUsersDto getProductWithCommentsAndUsers(Long productId) {
//        ProductEntity product = productRepository.findById(productId)
//                .orElseThrow(() -> new RuntimeException("Product not found"));
//
//        List<CommentEntity> comments = commentRepository.findByProductId(productId);
//        List<UsersCommentDto> commentList = new ArrayList<>();
//
//        String userName = null;
//        for (CommentEntity c : comments) {
//            UsersEntity user = usersRepository.findById(c.getUsersId()).orElse(null);
//            if (user != null) {
//                userName = user.getFullName();
//            } else {
//                userName = "Unknown";
//            }
//
//            UsersCommentDto commentDto = UsersCommentDto.builder()
//                    .fullName(user.getFullName())
//                    .comment(c.getComment())
//                    .build();
//            commentList.add(commentDto);
//        }
//
//        CommentProductUsersDto result = CommentProductUsersDto.builder()
//                .pname(product.getName())
//                .comments(commentList).
//                userName(userName)
//                .build();
//
//        return result;
//    }
//}
//
//
//
//
