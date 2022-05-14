package az.iktlab.project.movieservice.model.movie;

import az.iktlab.project.movieservice.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieInfo {

    private Movie movie;
    private List<Comment> comment;
}
