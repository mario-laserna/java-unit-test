package com.mlh.javaunittest.movies.service;

import com.mlh.javaunittest.movies.data.MovieRepository;
import com.mlh.javaunittest.movies.model.Genre;
import com.mlh.javaunittest.movies.model.Movie;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return this.movieRepository.findAll().stream()
                .filter(movie -> (movie.getGenre() == genre))
                .collect(Collectors.toList());
    }
}
