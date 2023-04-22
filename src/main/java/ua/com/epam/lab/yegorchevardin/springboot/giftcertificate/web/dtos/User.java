package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

/**
 * DTO for users
 * @author yegorchevardin
 * @version 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
public class User extends RepresentationModel<User> {
    private Long id;
    private String username;
}
