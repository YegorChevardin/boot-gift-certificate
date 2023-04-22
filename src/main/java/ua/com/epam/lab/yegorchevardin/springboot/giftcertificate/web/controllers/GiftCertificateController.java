package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services.GiftCertificateService;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.GiftCertificate;

/**
 * Controller for handling requests for gift-certificates
 * @author yegorchevardin
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1/gift-certificates")
@RequiredArgsConstructor
public class GiftCertificateController {
    private final GiftCertificateService giftCertificateService;

    /**
     * Method for getting all gift-certificates
     * @return ResponseEntity with all gift-certificates
     */
    @GetMapping
    public ResponseEntity<CollectionModel<GiftCertificate>> showAll() {
        return null;//todo
    }
}
