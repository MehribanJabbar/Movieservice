package az.iktlab.project.movieservice.controller;


import az.iktlab.project.movieservice.model.Comment;
import az.iktlab.project.movieservice.model.Popularity;
import az.iktlab.project.movieservice.model.movie.Movie;
import az.iktlab.project.movieservice.model.movie.MovieInfo;
import az.iktlab.project.movieservice.model.movie.SpokenLanguage;
import az.iktlab.project.movieservice.model.genre.GenreDto;
import az.iktlab.project.movieservice.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/movies")
@Slf4j
public class MovieController {
    private final MovieService movieService;
    //getalllanguages,

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/spoken/languages/{id}")
    public List<SpokenLanguage> getAllLanguages(@PathVariable float id){
        return movieService.getAllLanguages(id);
    }

    @GetMapping("/genre")
    public List<GenreDto> getAllGenre(){
        return (List<GenreDto>) movieService.getAllGenre();
    }
    @PostMapping("/comment")
    public List<Comment> getGetAllComment(){
        return movieService.getAllComments();
    }

    @GetMapping("/popular")
    public List<Popularity> getPopularMovies() {
        return  movieService.getPopularMovies();
    }

    @GetMapping("/{movieId}")
    public MovieInfo getMovieInfo(@PathVariable Long movieId) {

        return movieService.getMovieInfo(movieId);
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        log.info("Fetch all the Movies...");
        return movieService.getAllMovies();
    }
}
