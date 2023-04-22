package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class with constants that are keeping exception messages
 */
@AllArgsConstructor
public enum ExceptionMessages {
    TAG_BY_ID_NOT_FOUND("Tag by this id %s does not exist"),
    TAG_BY_NAME_EXIST("%s tag already exist"),
    TAG_NOT_FOUND("Such tag does not exist"),
    GIFT_CERTIFICATE_BY_ID_NOT_FOUND("Gift certificate by this id %s does not exist"),
    GIFT_CERTIFICATE_BY_NAME_EXIST("%s gift certificate already exist"),
    GIFT_CERTIFICATE_BY_NAME_DOES_NOT_FOUND(
            "Gift certificate with this name %s does not exist");
    
    @Getter
    private final String value;
}
