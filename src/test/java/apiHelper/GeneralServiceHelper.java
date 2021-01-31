package apiHelper;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class GeneralServiceHelper {
    private RequestSpecification reqSpec;

    public GeneralServiceHelper(String baseUrl) {
        this.reqSpec = new RequestSpecBuilder()
        .setBaseUri(baseUrl)
        .setContentType("application/json; charset=utf-8")
        .build();
    }

    public RequestSpecification getReqSpec(){
        return reqSpec;
    }


}
