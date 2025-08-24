package az.iradasboot.demo.controller;

import az.iradasboot.demo.dto.CommentDto;
import az.iradasboot.demo.dto.CommentProductUsersDto;
import az.iradasboot.demo.dto.ProductCommentDto;
import az.iradasboot.demo.service.CommentService;
import az.iradasboot.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class CommentController {

    private final ProductService productService;
    private final CommentService commentService;


    @GetMapping("/comments")
    public List<CommentDto> getAllComments() {
        return commentService.getAllComments();
    }


}
