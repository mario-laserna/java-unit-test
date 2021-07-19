package com.mlh.javaunittest.movies.data;

import com.mlh.javaunittest.movies.model.Genre;
import com.mlh.javaunittest.movies.model.Movie;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class MovieRepositoryIntegrationTest {

    @Test
    public void load_all_movies() throws SQLException {
        //Carga la conexión a una base de datos en memoria simulando ser mysql
        DriverManagerDataSource driverManagerDataSource =
                new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");

        //carga a la bd en memoria el script sql que crea la tabla y realiza inserción
        ScriptUtils.executeSqlScript(driverManagerDataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);

        MovieRepositoryJdbc movieRepositoryJdbc = new MovieRepositoryJdbc(jdbcTemplate);
        Collection<Movie> all = movieRepositoryJdbc.findAll();

        assertEquals(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        ), all);
    }
}