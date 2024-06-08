package com.app.lacemauit_b.repo;

import com.app.lacemauit_b.module.Movie;
import com.app.lacemauit_b.module.Review;
import com.app.lacemauit_b.module.User;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepo extends JpaRepository<Review, String> {

    List<Review> findAllByUser(User user);

    List<Review> findAllByMovie(Movie movie);

    Optional<Review> getReviewById (String Id);
}
