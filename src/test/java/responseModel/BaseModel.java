package responseModel;

import org.kohsuke.rngom.parse.host.Base;
import services.SearchByController;

import static verification.ResponseSpec.getStatusCodeOk;

public class BaseModel {

    SearchByController searchByController = new SearchByController();
    private final String EXPECTED_TITLE = "Batman Begins";
    static String imdbId;

    public String getImdbIdFromSearchByName() {

        SearcyByResponse response = searchByController.searchByName(EXPECTED_TITLE, getStatusCodeOk());
        for (var film : response.getFilmsOrderByName()) {
            if (EXPECTED_TITLE.equals(film.getTitle())) {
                imdbId = film.getImdbId();
            }
        }
        if (imdbId.equals(null)) {
            return "invalid";
        }
        return imdbId;
    }
}


