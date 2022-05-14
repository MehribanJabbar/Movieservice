package az.iktlab.project.movieservice.model.movie;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpokenLanguage {
    @JsonProperty("english_name")
    private String englishName;
    private String iso_639_1;
    private String name;

}

