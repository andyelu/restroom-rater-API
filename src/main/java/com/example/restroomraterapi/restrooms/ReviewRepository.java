package com.example.restroomraterapi.restrooms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query("SELECT r FROM Review r where r.restroom_name = :restroomName")
    List<Review> findReviewByRestroom(@Param("restroomName") String restroomName);

    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.restroom_name = :restroomName")
    Double findAverageRatingByRestroomName(@Param("restroomName") String restroomName);
}
