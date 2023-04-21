package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.handlers.impl;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.entities.TagEntity;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.handlers.AbstractQueryHandler;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.handlers.QueryHandler;

/**
 * Query handler for tag entity
 * @author yegorchevardin
 * @version 0.0.1
 */
@Component
public class TagQueryHandler extends AbstractQueryHandler
        implements QueryHandler<TagEntity> {
    private static final String TAG_VALUE_COLUMN = "value";

    @Override
    public CriteriaQuery<TagEntity> createFilteringGetQuery(
            MultiValueMap<String, String> params, CriteriaBuilder criteriaBuilder
    ) {
        return null;//todo implement
    }
}
