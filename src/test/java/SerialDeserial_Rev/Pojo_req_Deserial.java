package SerialDeserial_Rev;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import static io.restassured.RestAssured.given;

public class Pojo_req_Deserial {

    @BeforeClass()
    public void uri_config() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users";
    }

    @Test
    public void postreq2() {
        PojoSerial pp = new PojoSerial("Aditi", "Testing");//Serialization input
        PojoDeserial pp1 = given()
                .contentType("application/json")
                .body(pp)

                .when()
                .post()
                .as(PojoDeserial.class);//Deserialize output
        System.out.println(pp1.getCreatedAt());
        System.out.println(pp1.getId());
        System.out.println(pp1.getJob());
        System.out.println(pp1.getName());

    }
}
