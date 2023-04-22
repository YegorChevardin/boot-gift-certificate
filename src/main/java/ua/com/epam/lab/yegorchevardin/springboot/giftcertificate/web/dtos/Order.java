package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;
import java.sql.Timestamp;
import java.util.List;

/**
 * DTO for orders
 * @author yegorchevardin
 * @version 0.0.1
 */
@Getter
@Setter
@NoArgsConstructor
public class Order extends RepresentationModel<Order> {
    private Long id;
    private Float cost;
    private String purchasedAt;
    private User user;
    private List<GiftCertificate> giftCertificates;
}
