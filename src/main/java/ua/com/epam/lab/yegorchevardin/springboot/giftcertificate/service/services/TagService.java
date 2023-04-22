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
public interface TagService extends CreateReadDeleteService<Tag> {
    /**
     * Method for getting a list of Tag by specific parameters
     * @param params request parameters from URL
     * @return List of tags
     */
    List<Tag> doFilter(MultiValueMap<String, String> params, int page, int size);

    /**
     * Method for getting the most popular tag entity
     * with the highest cost of all orders
     * @return the most popular Tag entity
     */
    Tag getMostPopularTagWithHighestCostOfAllOrders();
}
