package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.entities.UserEntity;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.DomainObjectsConvertor;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.User;

/**
 * Class for converting user domain objects
 * @author yegorchevardin
 * @version 0.0.1
 */
@Component
@Qualifier("userDomainConvertor")
public class UserDomainConvertor implements DomainObjectsConvertor<UserEntity, User> {
    @Override
    public User convertEntityToDTO(UserEntity entity) {
        return null;
    }

    @Override
    public UserEntity convertDtoToEntity(User dto) {
        return null;
    }
}
