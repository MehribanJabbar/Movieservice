package az.iktlab.project.movieservice.model.movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionCountry {
    private String iso_3166_1;
    private String name;


}

