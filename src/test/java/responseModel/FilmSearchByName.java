package responseModel;

import lombok.Getter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Getter
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "Title",
        "Year",
        "imdbID",
        "Type",
        "Poster"
})
public class FilmSearchByName {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private int year;
    @JsonProperty("imdbID")
    private String imdbId;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Poster")
    private String poster;
}