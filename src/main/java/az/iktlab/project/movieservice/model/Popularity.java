package az.iktlab.project.movieservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Popularity {
    private float page;
    @JsonProperty("total_pages")
    private float totalPages;
    @JsonProperty("total_results")
    private float totalResults;


}

