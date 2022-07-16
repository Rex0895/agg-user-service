package homework.user.service.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "user_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Schema(description = "Name", type = "String", example = "Алексей")
    private String name;

}
