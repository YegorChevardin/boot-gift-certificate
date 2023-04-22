package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.entities.TagEntity;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.DomainObjectsConvertor;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.Tag;

/**
 * Class for converting tag domain objects
 * @author yegorchevardin
 * @version 0.0.1
 */
@Component
@Qualifier("tagDomainConvertor")
public class TagDomainConvertor implements DomainObjectsConvertor<TagEntity, Tag> {
    @Override
    public Tag convertEntityToDTO(TagEntity entity) {
        return null;
    }

    @Override
    public TagEntity convertDtoToEntity(Tag dto) {
        return null;
    }
}
