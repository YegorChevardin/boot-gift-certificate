package ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.service.services.TagService;
import ua.com.epam.lab.yegorchevardin.springboot.giftcertificate.web.dtos.Tag;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

/**
 * Controller for handling request for tag dtos
 * @author yegorchevardin
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;

    /**
     * Method for handling requests for getting all tags
     * @param page specific page of items
     * @param size size of elements on page
     * @return Response Entity with tags dtos
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Tag>> showAllTags(
            @RequestParam(value = "page", defaultValue = "0", required = false) int page,
            @RequestParam(value = "size", defaultValue = "5", required = false) int size
    ) {
        List<Tag> tags = tagService.findAll(page, size).stream().peek(
                (element) -> element.add(
                        linkTo(methodOn(TagController.class)
                                .findById(element.getId())).withSelfRel())
        ).toList();
        Link link = linkTo(methodOn(TagController.class).showAllTags(page, size)).withSelfRel();
        return ResponseEntity.ok(CollectionModel.of(tags, link));
    }

    /**
     * Method for handling requests for finding tag by id
     * @param tagId id of tag to find
     * @return Response Entity with tag dto
     */
    @GetMapping("/{tagId}")
    public ResponseEntity<Tag> findById(@PathVariable(name = "tagId") Long tagId) {
        Tag tag = tagService.findById(tagId);
        tag.add(linkTo(methodOn(TagController.class).findById(tagId)).withSelfRel());
        return ResponseEntity.ok(tag);
    }
}
