package az.iktlab.project.movieservice.Client;

import az.iktlab.project.movieservice.model.movie.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "movies", url = "https://api.themoviedb.org/3/movie/76341?api_key=2ab288bec2c1171ab6e6c0fe9216269a")
public interface MoviesClient {
    @RequestMapping(method = RequestMethod.GET)
    List<Movie> findAll();
}
