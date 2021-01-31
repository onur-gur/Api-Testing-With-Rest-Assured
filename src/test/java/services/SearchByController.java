package services;

import apiHelper.GeneralServiceHelper;
import constant.Url;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import responseModel.SearcyByIdAndTitleResponse;
import responseModel.SearcyByResponse;

import static io.restassured.RestAssured.given;
import static org.apache.http.client.methods.RequestBuilder.get;

public class SearchByController extends GeneralServiceHelper {
    public SearchByController() {
        super(Url.OMDB_API_URL);
    }

    public SearcyByResponse searchByName(String filmName, ResponseSpecification spec){
        return given()
                .spec(getReqSpec())
                .log().all()
                .queryParam("apiKey",Url.OMDB_API_KEY)
                .queryParam("s",filmName)
                .when()
                .get()
                .then()
                .assertThat()
                .spec(spec)
                .extract()
                .response()
                .jsonPath()
                .getObject("", SearcyByResponse.class);
    }

    public SearcyByIdAndTitleResponse getFilmByImdbId(String imdbId, ResponseSpecification spec){
        return given()
                .spec(getReqSpec())
                .log().all()
                .queryParam("apikey",Url.OMDB_API_KEY)
                .queryParam("i",imdbId)
                .when()
                .get()
                .then()
                .assertThat()
                .spec(spec)
                .log().all()
                .extract()
                .response()
                .jsonPath()
                .getObject("", SearcyByIdAndTitleResponse.class);
    }

    public SearcyByIdAndTitleResponse getFilmByTitle(String filmName, ResponseSpecification spec){
        return given()
                .spec(getReqSpec())
                .log().all()
                .queryParam("apikey",Url.OMDB_API_KEY)
                .queryParam("t",filmName)
                .when()
                .get()
                .then()
                .assertThat()
                .spec(spec)
                .log().all()
                .extract()
                .response()
                .jsonPath()
                .getObject("", SearcyByIdAndTitleResponse.class);
    }
}
