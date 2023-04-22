package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

/**
 * DTO for tags
 * @author yegorchevardin
 * @version 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
public class Tag extends RepresentationModel<Tag> {
    private Long id;
    private String value;
}
