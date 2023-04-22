package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services.TagService;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.Tag;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {
    @Override
    public Tag findById(long id) {
        return null;
    }

    @Override
    public List<Tag> findAll(int page, int size) {
        return null;
    }

    @Override
    public Tag insert(Tag entity) {
        return null;
    }

    @Override
    public void removeById(long id) {

    }

    @Override
    public Tag findMostPopularTagWithOrdersWithHighestCost() {
        return null;
    }

    @Override
    public List<Tag> doFilter(MultiValueMap<String, String> params, int page, int size) {
        return null;
    }
}
