package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;
import java.util.List;

/**
 * DTO for gift certificates
 * @author yegorchevardin
 * @version 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
public class GiftCertificate extends RepresentationModel<GiftCertificate> {
    private Long id;
    private String name;
    private String description;
    private Float price;
    private Integer duration;
    private String createDate;
    private String lastUpdateDate;
    private List<Tag> tags;
}
