package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services;

/**
 * Interface that defines basic CRUD methods for manipulating data
 * @author yegorchevardin
 * @version 0.0.1
 */
public interface CreateDeadUpdateDeleteService<T> extends CreateReadDeleteService<T> {
    /**
     * Updates entity of T datatype
     * @param entity updated entity
     */
    T update(T dto);
}
