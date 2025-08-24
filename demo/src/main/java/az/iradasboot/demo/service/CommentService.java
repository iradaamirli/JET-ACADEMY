package az.iradasboot.demo.service;

import az.iradasboot.demo.dto.CommentDto;
import az.iradasboot.demo.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    public List<CommentDto> getAllComments() {
        return commentRepository.findAllCommentWithJoin();
    }


}
