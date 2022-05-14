package az.iktlab.project.movieservice.Client;

import az.iktlab.project.movieservice.model.Popularity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "popularity", url = "https://api.themoviedb.org/3/movie/popular?api_key=2ab288bec2c1171ab6e6c0fe9216269a&language=en-US&page=1")
public interface PopularityClient {

    @RequestMapping(method = RequestMethod.GET)
    List<Popularity> findAll();



}
