package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services;

import org.springframework.util.MultiValueMap;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.GiftCertificate;

import java.util.List;

/**
 * Interface that defines service methods
 * for handling gift certificate object operations
 * @author yegorchevardin
 * @version 0.0.1
 */
public interface GiftCertificateService
        extends CreateDeadUpdateDeleteService<GiftCertificate>,
        FilterService<GiftCertificate> {
    /**
     * Method for getting a gift certificate entity by name.
     * @param name name of entity
     * @return a gift certificate entity.
     */
    GiftCertificate findByName(String name);
}
