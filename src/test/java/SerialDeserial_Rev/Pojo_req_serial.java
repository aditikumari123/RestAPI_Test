package SerialDeserial_Rev;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;

public class Pojo_req_serial {

    @BeforeClass()
    public void uri_config(){
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users";

    }

    @Test
    public void postreq(){
        PojoSerial pp = new PojoSerial("Aditi","Testing");
        Response res =  given()
                .contentType("application/json")
                .body(pp)

                .when()
                .post()

                .then()
                .statusCode(201)
                .extract().response();
        System.out.println(res.getBody().asString());




    }

}
