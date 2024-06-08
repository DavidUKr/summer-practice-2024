package com.app.lacemauit_b.control;

import com.app.lacemauit_b.module.Movie;
import com.app.lacemauit_b.module.Review;
import com.app.lacemauit_b.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lcmu/api/v1/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Review> getAllReviews(){
        return reviewService.getAll();
    }

    @GetMapping(value = "/movie/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Review> getReviewsByMovie(@PathVariable String id){
        return reviewService.getAllByMovie(id);
    }

    @GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Review> getReviewsByUser(@PathVariable String id){
        return reviewService.getAllByUser(id);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Review getReviewById(@PathVariable String id){
        return reviewService.getReviewById(id);
    }

    @PutMapping(value="/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createReview(@RequestBody Review review){
        reviewService.createReview(review);
    }
}
