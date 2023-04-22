package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.dao.AbstractDAO;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.dao.OrderDAO;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.entities.OrderEntity;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.handlers.QueryHandler;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderDAOImpl extends AbstractDAO<OrderEntity> implements OrderDAO {
    private static final String FIND_BY_USER_ID_QUERY =
            "select o from OrderEntity o where o.user.id = :userId";

    @Autowired
    public OrderDAOImpl(QueryHandler<OrderEntity> queryCreator, Class<OrderEntity> entityType) {
        super(queryCreator, entityType);
    }

    @Override
    public List<OrderEntity> findByUserId(long userId, Pageable pageable) {
        return entityManager.createQuery(FIND_BY_USER_ID_QUERY, OrderEntity.class)
                .setParameter("userId", userId)
                .setFirstResult((int) pageable.getOffset())
                .setMaxResults(pageable.getPageSize())
                .getResultStream()
                .distinct()
                .collect(Collectors.toList());
    }
}