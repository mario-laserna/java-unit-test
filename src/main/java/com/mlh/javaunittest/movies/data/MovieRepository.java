package com.mlh.javaunittest.movies.data;

import com.mlh.javaunittest.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {
    Movie findById(int id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
