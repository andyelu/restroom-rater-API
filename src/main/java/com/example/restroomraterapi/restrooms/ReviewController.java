package com.example.restroomraterapi.restrooms;


import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Review> getReviews() {
        return reviewService.GetReviews();
    }

    @PostMapping
    public void addReview(@RequestBody Review review) {
        reviewService.addReview(review);
    }

    @GetMapping(path = "{name}")
    public List<Review> getReviewsByRestroom(@PathVariable("name") String restroomName) {
        return reviewService.getReviewsByRestroom(restroomName);
    }

    @GetMapping(path = "rating/{name}")
    public double getRatingByRestroom(@PathVariable("name") String restroomName) {
        return reviewService.getRatingByRestroom(restroomName);
    }



}
