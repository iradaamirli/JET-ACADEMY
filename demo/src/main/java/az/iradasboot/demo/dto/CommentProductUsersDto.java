package az.iradasboot.demo.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentProductUsersDto {
    private String pname;
    private String userName;
    private List<UsersCommentDto> comments;
}
