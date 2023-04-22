package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services;

import org.springframework.util.MultiValueMap;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.Tag;

import java.util.List;

/**
 * Interface that defines service methods
 * for handling tag object operations
 * @author yegorchevardin
 * @version 0.0.1
 */
public interface TagService extends CreateReadDeleteService<Tag>, FilterService<Tag> {
    /**
     * Method for getting the most popular tag entity
     * with the highest cost of all orders
     * @return the most popular Tag entity
     */
    Tag findMostPopularTagWithOrdersWithHighestCost();
}
