package az.iktlab.project.movieservice.model.movie;

import az.iktlab.project.movieservice.model.Comment;
import az.iktlab.project.movieservice.model.genre.Genre;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private boolean adult;
    private String backdropPath;
    @JsonProperty("belongs_to_collection")
    private BelongsCollection belongsToCollection;
    private float budget;
    private List<Genre> genres ;
    private String homepage;
    private float id;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    private String overview;
    private float popularity;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("production_companies")
    private List<ProductionCompany> productionCompanies ;
    @JsonProperty("production_countries")
    private List <ProductionCountry> productionCountries ;
    @JsonProperty("release_date")
    private String releaseDate;
    private float revenue;
    private float runtime;
    @JsonProperty("spoken_language")
    private List <SpokenLanguage> spokenLanguages ;
    private List <Comment> comments;
    private String status;
    private String tagline;
    private String title;
    private boolean video;
    @JsonProperty("vote_average")
    private float voteAverage;
    @JsonProperty("vote_count")
    private float voteCount;
}

