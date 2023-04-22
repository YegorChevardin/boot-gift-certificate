package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.entities.GiftCertificateEntity;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.entities.TagEntity;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.DomainObjectsConvertor;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.GiftCertificate;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.Tag;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

/**
 * Class for converting gift certificate domain objects
 * @author yegorchevardin
 * @version 0.0.1
 */
@Component
@RequiredArgsConstructor
public class GiftCertificateDomainConvertor
        implements DomainObjectsConvertor<GiftCertificateEntity, GiftCertificate> {
    private final DomainObjectsConvertor<TagEntity, Tag> tagDomainConvertor;

    @Override
    public GiftCertificate convertEntityToDTO(GiftCertificateEntity entity) {
        GiftCertificate dto = new GiftCertificate();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());
        dto.setDuration(entity.getDuration());
        dto.setCreateDate(String.valueOf(entity.getCreateDate().toLocalDateTime()));
        dto.setLastUpdateDate(String.valueOf(entity.getLastUpdateDate().toLocalDateTime()));
        dto.setTags(entity.getTags().stream().map(
                tagDomainConvertor::convertEntityToDTO
        ).collect(Collectors.toList()));
        return dto;
    }

    @Override
    public GiftCertificateEntity convertDtoToEntity(GiftCertificate dto) {
        GiftCertificateEntity entity = new GiftCertificateEntity();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setDuration(dto.getDuration());
        entity.setLastUpdateDate(Timestamp.valueOf(LocalDateTime.now()));
        entity.setTags(dto.getTags()
                .stream().map(tagDomainConvertor::convertDtoToEntity)
                .collect(Collectors.toList()));
        return entity;
    }
}
