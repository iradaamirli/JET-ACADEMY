package az.iradasboot.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommentDto {
    private Long id;
    private String comment;
    private Long productId;
    private Long usersId;
    private String productName;
    private String userName;

}
