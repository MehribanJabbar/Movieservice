package az.iktlab.project.movieservice.model.movie;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionCompany {
    private Long id;
    @JsonProperty("logo_path")
    private String logoPath;
    private String name;
    @JsonProperty("origin_country")
    private String originCountry;


}

