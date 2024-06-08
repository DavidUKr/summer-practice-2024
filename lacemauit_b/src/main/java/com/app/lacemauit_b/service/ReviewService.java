package com.app.lacemauit_b.service;

import com.app.lacemauit_b.module.Movie;
import com.app.lacemauit_b.module.Review;
import com.app.lacemauit_b.module.User;
import com.app.lacemauit_b.repo.MovieRepo;
import com.app.lacemauit_b.repo.ReviewRepo;
import com.app.lacemauit_b.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.app.lacemauit_b.advice.exception.ReviewNotFoundException;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepo reviewRepo;
    private  final MovieRepo movieRepo;
    private final UserRepo userRepo;

    public Review getReviewById(String id){
        return reviewRepo.getReviewById(id).orElseThrow(() -> new ReviewNotFoundException("Review not found"));
    }

    public List<Review> getAll(){
        return reviewRepo.findAll();
    }

    public List<Review> getAllByMovie(String movieId){

        Movie movie=movieRepo.getReferenceById(movieId);

        return reviewRepo.findAllByMovie(movie);
    }

    public List<Review> getAllByUser(String userId) {
        User user=userRepo.getReferenceById(userId);

        return reviewRepo.findAllByUser(user);
    }

    public void createReview(Review review){
        reviewRepo.save(review);
    }
}
