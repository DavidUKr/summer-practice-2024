package com.app.lacemauit_b.control;

import com.app.lacemauit_b.module.Movie;
import com.app.lacemauit_b.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lcmu/api/v1/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
     public List<Movie> getAllMovies(){
        return movieService.getAll();
    }

    @PutMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
    }
}
