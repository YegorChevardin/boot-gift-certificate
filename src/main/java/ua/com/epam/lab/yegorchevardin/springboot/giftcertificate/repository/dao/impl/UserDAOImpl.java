package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.dao.AbstractDAO;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.dao.UserDAO;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.entities.UserEntity;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.handlers.QueryHandler;
import java.util.Optional;

@Component
public class UserDAOImpl extends AbstractDAO<UserEntity> implements UserDAO {
    private static final String FIND_USER_BY_NAME = "" +
            "select u from UserEntity u where u.username = :username";

    @Autowired
    public UserDAOImpl(QueryHandler<UserEntity> queryCreator, Class<UserEntity> entityType) {
        super(queryCreator, entityType);
    }

    @Override
    public Optional<UserEntity> findByUsername(String username) {
        return entityManager.createQuery(FIND_USER_BY_NAME, UserEntity.class)
                .setParameter("username", username).getResultStream().findFirst();
    }
}
