package com.mlh.javaunittest.movies.service;

import com.mlh.javaunittest.movies.data.MovieRepository;
import com.mlh.javaunittest.movies.model.Genre;
import com.mlh.javaunittest.movies.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceShould {
    private MovieRepository movieRepository;
    private MovieService movieService;

    @Before
    public void setup(){
        movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION)
                )
        );

        movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movies_by_genre() {
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        assertEquals(Arrays.asList(3, 6), getMovieIds(movies));
    }

    @Test
    public void return_names_by_lenght() {
        Collection<Movie> movies = movieService.findMoviesByLength(119);
        assertEquals(Arrays.asList(2, 3, 4, 5, 6), getMovieIds(movies));
    }

    private List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(movie -> movie.getId())
                .collect(Collectors.toList());
    }
}