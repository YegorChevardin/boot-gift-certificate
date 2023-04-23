package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.dao.UserDAO;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services.UserService;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.User;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public List<User> findAll(int page, int size) {
        return null;
    }

    @Override
    public User insert(User dto) {
        return null;
    }

    @Override
    public void removeById(long id) {

    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
