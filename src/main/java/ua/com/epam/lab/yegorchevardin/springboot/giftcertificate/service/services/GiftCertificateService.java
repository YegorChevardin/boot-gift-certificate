package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services;

import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.GiftCertificate;

/**
 * Interface that defines service methods
 * for handling gift certificate object operations
 * @author yegorchevardin
 * @version 0.0.1
 */
public interface GiftCertificateService
        extends CreateReadUpdateDeleteService<GiftCertificate>,
        FilterService<GiftCertificate> {
    /**
     * Method for getting a gift certificate entity by name.
     * @param name name of entity
     * @return a gift certificate entity.
     */
    GiftCertificate findByName(String name);
}
