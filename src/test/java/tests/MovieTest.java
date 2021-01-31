package tests;

import org.testng.annotations.Test;
import responseModel.BaseModel;
import responseModel.SearcyByIdAndTitleResponse;
import responseModel.SearcyByResponse;
import services.SearchByController;

import static org.testng.Assert.assertEquals;
import static verification.ResponseSpec.getStatusCodeOk;

public class MovieTest {
    private final String EXPECTED_IMDB_ID = "tt0450392";
    private final String EXPECTED_RELEASED = "14 Jun 2005";
    private final String EXPECTED_TITLE = "Batman Begins";
    private final String EXPECTED_YEAR = "2005";

    BaseModel model = new BaseModel();
    SearchByController controller = new SearchByController();

    @Test
    public void validateMovieByImdbId(){
        String imdbId = model.getImdbIdFromSearchByName();

        SearcyByIdAndTitleResponse responseByImdbId = controller.getFilmByImdbId(imdbId, getStatusCodeOk());
        assertEquals(EXPECTED_IMDB_ID,responseByImdbId.getImdbID());
        assertEquals(EXPECTED_RELEASED,responseByImdbId.getReleased());
        assertEquals(EXPECTED_TITLE,responseByImdbId.getTitle());
    }

    @Test
    public  void validateMovideByTitle(){
        String imdbId = model.getImdbIdFromSearchByName();

        SearcyByIdAndTitleResponse responseByImdbId = controller.getFilmByTitle("Batman Begins", getStatusCodeOk());
        assertEquals(EXPECTED_IMDB_ID,responseByImdbId.getImdbID());
        assertEquals(EXPECTED_RELEASED,responseByImdbId.getReleased());
        assertEquals(EXPECTED_TITLE,responseByImdbId.getTitle());
    }







}
