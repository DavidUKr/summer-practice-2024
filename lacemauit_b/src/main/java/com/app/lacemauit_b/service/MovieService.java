package com.app.lacemauit_b.service;

import com.app.lacemauit_b.module.Movie;
import com.app.lacemauit_b.repo.MovieRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepo movieRepo;

    public List<Movie> getAll(){
        return movieRepo.findAll();
    }

    public void addMovie(Movie movie){
        movieRepo.save(movie);
    }
}
