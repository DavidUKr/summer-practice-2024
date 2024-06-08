package com.app.lacemauit_b.repo;

import com.app.lacemauit_b.module.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, String> {

}
