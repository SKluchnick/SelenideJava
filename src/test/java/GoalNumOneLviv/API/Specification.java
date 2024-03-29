package GoalNumOneLviv.API;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {
    public static RequestSpecification requestSpecification(String URL){
        return new RequestSpecBuilder()
                .setBaseUri(URL)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification responseSpecification200(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

    }
    public static ResponseSpecification responseSpecification201(){
        return new ResponseSpecBuilder()
                .expectStatusCode(201)
                .build();

    }

    public static void installSpecification(RequestSpecification requestSpecification
            , ResponseSpecification responseSpecification){

        RestAssured.requestSpecification = requestSpecification;
        RestAssured.responseSpecification = responseSpecification;


    }


}
