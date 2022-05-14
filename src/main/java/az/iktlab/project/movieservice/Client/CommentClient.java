package az.iktlab.project.movieservice.Client;

import az.iktlab.project.movieservice.model.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "comments", url = "")
public interface CommentClient {

    @RequestMapping(method = RequestMethod.GET)
    List<Comment> findAll();
}
