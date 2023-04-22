package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class with constants that are keeping exception messages
 */
@AllArgsConstructor
public enum ExceptionMessages {
    TAG_BY_ID_NOT_FOUND("Tag by this id %s does not exist");
    
    @Getter
    private final String value;
}
