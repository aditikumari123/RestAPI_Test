package SerialDeserial;


import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Post_Serial_Req {

    @BeforeClass
    public void uri_config(){
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users/";
    }

    @Test
    public void CreateUsr(){
        Serialization ser = new Serialization("Monika","Recruitment");
        given()
                .contentType("application/json")
                .body(ser)

                .when()
                .post()

                .then()
                .statusCode(201)
                .log().all();
    }
}

