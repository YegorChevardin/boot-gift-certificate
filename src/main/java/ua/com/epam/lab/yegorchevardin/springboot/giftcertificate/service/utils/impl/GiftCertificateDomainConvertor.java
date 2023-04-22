package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.entities.GiftCertificateEntity;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.DomainObjectsConvertor;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.GiftCertificate;

/**
 * Class for converting gift certificate domain objects
 * @author yegorchevardin
 * @version 0.0.1
 */
@Component
@Qualifier("giftCertificateDomainConvertor")
public class GiftCertificateDomainConvertor
        implements DomainObjectsConvertor<GiftCertificateEntity, GiftCertificate> {
    @Override
    public GiftCertificate convertEntityToDTO(GiftCertificateEntity entity) {
        return null;
    }

    @Override
    public GiftCertificateEntity convertDtoToEntity(GiftCertificate dto) {
        return null;
    }
}
