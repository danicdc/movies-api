package com.apidemo.api.rest;

import com.apidemo.api.entity.Movie;
import com.apidemo.api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieRestController {

    private MovieService movieService;

    @Autowired
    public MovieRestController(MovieService theMovieService) {
        movieService = theMovieService;
    }


    @GetMapping("/movies")
    public List<Movie> findAll() {
        return movieService.findAll();
    }

    // add mapping for GET /movies/{movieId}

    @GetMapping("/movies/{movieId}")
    public Movie getMovie(@PathVariable int movieId) {

        Movie theMovie = movieService.findById(movieId);

        if (theMovie == null) {
            throw new RuntimeException("Movie id not found - " + movieId);
        }

        return theMovie;
    }

    @GetMapping("/movies/{movieId}/movieTitle")
    public String getMovieTitle(@PathVariable int movieId) {

        Movie theMovie = movieService.findById(movieId);
        String movieTitle = theMovie.getTitle();

        if (movieTitle == null) {
            throw new RuntimeException("Movie id not found - " + movieId);
        }

        return movieTitle;
    }



    // add mapping for POST /movies

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie theMovie) {

        theMovie.setId(0);

        Movie dbMovie = movieService.save(theMovie);

        return dbMovie;
    }

    // add mapping for PUT /movies

    @PutMapping("/movies")
    public Movie updateMovie(@RequestBody Movie theMovie) {

        Movie dbMovie = movieService.save(theMovie);

        return dbMovie;
    }

    // add mapping for DELETE /movies/{movieId} - delete movie

    @DeleteMapping("/movies/{movieId}")
    public String deleteMovie(@PathVariable int movieId) {

        Movie tempMovie = movieService.findById(movieId);


        if (tempMovie == null) {
            throw new RuntimeException("Movie id not found - " + movieId);
        }

        movieService.deleteById(movieId);

        return "Deleted movie id - " + movieId;
    }

}














