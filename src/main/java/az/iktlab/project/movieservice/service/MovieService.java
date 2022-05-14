package az.iktlab.project.movieservice.service;

import az.iktlab.project.movieservice.Client.CommentClient;
import az.iktlab.project.movieservice.Client.GenreClient;
import az.iktlab.project.movieservice.Client.MoviesClient;
import az.iktlab.project.movieservice.Client.PopularityClient;
import az.iktlab.project.movieservice.model.Comment;
import az.iktlab.project.movieservice.model.Popularity;
import az.iktlab.project.movieservice.model.genre.Genre;
import az.iktlab.project.movieservice.model.movie.Movie;
import az.iktlab.project.movieservice.model.genre.GenreDto;
import az.iktlab.project.movieservice.model.movie.MovieInfo;
import az.iktlab.project.movieservice.model.movie.SpokenLanguage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class MovieService {
    private static final Logger log = LoggerFactory.getLogger(MovieService.class);

    private final MoviesClient moviesClient;
    private final GenreClient genreClient;
    private final CommentClient commentClient;
    private final PopularityClient popularityClient;

    public MovieService(MoviesClient moviesClient, GenreClient genreClient, CommentClient commentClient, PopularityClient popularityClient) {
        this.moviesClient = moviesClient;
        this.genreClient = genreClient;
        this.commentClient = commentClient;
        this.popularityClient = popularityClient;
    }

    public GenreDto getAllGenre() {
        log.info("getAllGenre started.");
        List<Genre> genres=null;
        try {
            genres=genreClient.findAll().getGenres();
        }catch (RuntimeException ex){
            log.error("getAllGenres error. {}", ex.getMessage());
        }

        System.out.println(genres);
        log.info("getAllGenres end.");
        return (GenreDto) genres;
    }


    public List<SpokenLanguage> getAllLanguages(float id) {
        log.info("getAllLanguages started.");

        List<SpokenLanguage> languages = null;
        try {
            languages = moviesClient.findAll().get((int) id).getSpokenLanguages();
        } catch (RuntimeException ex) {
            log.error("getAllLanguages error. {}", ex.getMessage());
        }

        System.out.println(languages);
        log.info("getAllLanguages end.");
        return languages;
    }

    public List<Comment> getAllComments () {
        log.info("getAllComments started.");

        List<Comment> comments=null;
        try {
            comments=commentClient.findAll();
        }catch (RuntimeException ex){
            log.error("getAllComments error. {}", ex.getMessage());
        }

        System.out.println(comments);
        log.info("getAllComments end.");
        return comments;
    }

    public  List<Popularity> getPopularMovies(){
      log.info("getpopularMovies started.");

      List<Popularity> popularities=null;
      try {
          popularities=popularityClient.findAll();
      }catch (RuntimeException ex){
          log.error("getPopularMovies error. {}", ex.getMessage());
      }
        System.out.println(popularities);
      log.info("getPopularMovies end.");
      return popularities;
    }


    public List<Movie> getAllMovies() {
        return moviesClient.findAll();
    }

    public MovieInfo getMovieInfo(Long movieId) {

        Movie movie = getAllMovies().stream()
                .filter(movie1 -> movie1.getId() == movieId)
                .collect(Collectors.toList()).get(0);

        List<Comment> comments = getAllComments().stream()
                .filter(comment -> Objects.equals(comment.getMovieId(), movieId))
                .collect(Collectors.toList());

        MovieInfo movieInfo = new MovieInfo();
        movieInfo.setMovie(movie);
        movieInfo.setComment(comments);

        log.info("getMovieInfo end.");
        return movieInfo;
    }




}
