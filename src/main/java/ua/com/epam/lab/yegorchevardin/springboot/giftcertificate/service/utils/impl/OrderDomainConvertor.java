package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.impl;

import org.springframework.stereotype.Component;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.repository.entities.OrderEntity;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.utils.DomainObjectsConvertor;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.Order;

/**
 * Class for converting order domain objects
 * @author yegorchevardin
 * @version 0.0.1
 */
@Component
public class OrderDomainConvertor implements DomainObjectsConvertor<OrderEntity, Order> {
    @Override
    public Order convertEntityToDTO(OrderEntity entity) {
        return null;
    }

    @Override
    public OrderEntity convertDtoToEntity(Order dto) {
        return null;
    }
}
