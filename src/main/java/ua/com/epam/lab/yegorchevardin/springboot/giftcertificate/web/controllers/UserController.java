package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services.UserService;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.User;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.handlers.linkbuilders.LinkBuilder;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

/**
 * Controller for handling requests to user dtos
 * @author yegorchevardin
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final LinkBuilder<User> userLinkBuilder;

    /**
     * Method for getting all users from the database
     * @param page length of page
     * @param size amount of elements on the page
     * @return ResponseEntity with user
     */
    @GetMapping
    public ResponseEntity<CollectionModel<User>> findAll(
            @RequestParam(name = "page", defaultValue = "0", required = false) int page,
            @RequestParam(name = "size", defaultValue = "5", required = false) int size
    ) {
        List<User> users = userService.findAll(page, size).stream()
                .peek(userLinkBuilder::buildLinks).toList();
        Link link = linkTo(methodOn(UserController.class).findAll(page, size)).withSelfRel();
        return ResponseEntity.ok(CollectionModel.of(users, link));
    }

    /**
     * Method for handling request
     * for getting user by specific id
     * @param id users id
     * @return ResponseEntity with user
     */
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(
            @PathVariable(name = "id") Long id
    ) {
        User user = userService.findById(id);
        userLinkBuilder.buildLinks(user);
        return ResponseEntity.ok(user);
    }
}
