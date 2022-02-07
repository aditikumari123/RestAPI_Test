package API_demo;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get_Second_Response {
    @BeforeClass
    public void url_setup(){
        RestAssured.baseURI ="https://reqres.in";
        RestAssured.basePath = "/api/users";
    }
    @Test
    public void get_Rest(){
        given()
                .queryParams("page","2")
                .when()
                .get()
                    .then()
                          .statusCode(200)
                              .statusLine("HTTP/1.1 200 OK")
                             .log().all();
    }
}
