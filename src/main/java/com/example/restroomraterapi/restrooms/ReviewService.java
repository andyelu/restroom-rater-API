package com.example.restroomraterapi.restrooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> GetReviews() {
        return reviewRepository.findAll();
    }

    public void addReview(Review review) {
        reviewRepository.save(review);
    }

    public List<Review> getReviewsByRestroom(String name) {
        return reviewRepository.findReviewByRestroom(name);
    }


    public double getRatingByRestroom(String restroomName) {
        Double average = reviewRepository.findAverageRatingByRestroomName(restroomName);

        return average != null ? average : 0.0;
    }
}
