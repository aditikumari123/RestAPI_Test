package API_demo;
import java.util.HashMap;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.responseSpecification;
import static org.hamcrest.core.IsEqual.equalTo;

public class Get_Second_ResponseUsingutils {
    public HashMap map=new HashMap();
    @BeforeClass
    public void url_setup(){
        RestAssured.baseURI ="https://reqres.in";
        RestAssured.basePath = "/api/users";
    }
    @BeforeClass
    public void generateQueryParam(){
        map.put("page",utils.getpageNo());
    }

    @Test
    public void get_Rest(){
        Response response = given()
                //.queryParams("page",1)
                .queryParams(map)
                     .when()
                                .get()
                          .then()
                           .statusCode(200)
                           .statusLine("HTTP/1.1 200 OK")
                         //    .log().all()
                .body("data[0].first_name",equalTo("George"))
                .header("Content-Type","application/json; charset=utf-8")
                .extract().response();
       // System.out.println(response.body());
        String responsebody = response.getBody().asString();
        System.out.println(responsebody);


    }
}
