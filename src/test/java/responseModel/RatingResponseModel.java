package responseModel;

import lombok.Getter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Getter
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "Source",
        "Value"
})
public class RatingResponseModel {
    @JsonProperty("Source")
    private String source;
    @JsonProperty("Value")
    private String value;
}
