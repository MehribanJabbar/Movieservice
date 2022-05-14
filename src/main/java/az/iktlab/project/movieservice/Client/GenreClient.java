package az.iktlab.project.movieservice.Client;

import az.iktlab.project.movieservice.model.genre.GenreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient(name = "genres", url = "https://api.themoviedb.org/3/genre/movie/list?api_key=2ab288bec2c1171ab6e6c0fe9216269a&language=en-US")
public interface GenreClient {
    @RequestMapping(method = RequestMethod.GET)
    GenreDto findAll();
}
