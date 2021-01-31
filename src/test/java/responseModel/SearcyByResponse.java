package responseModel;

import lombok.Getter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.List;
@Getter
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "Search",
        "totalResults",
        "Response"
})
public class SearcyByResponse {
    @JsonProperty("Search")
    private List<FilmSearchByName> filmsOrderByName=null;
    @JsonProperty("totalResults")
    private int totalResult;
    @JsonProperty("Response")
    private String reponse;
}
