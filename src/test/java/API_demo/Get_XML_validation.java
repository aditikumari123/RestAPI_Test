package API_demo;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Get_XML_validation {
    @BeforeClass
    public void url_setup(){
        int id = 7;
        RestAssured.baseURI = "http://www.thomas-bayer.com";
        RestAssured.basePath = "/sqlrest/CUSTOMER/"+id;
    }
    @Test
    public void validate_xml(){
         given()
                 .when()
                 .get()
                 .then()
                 .statusCode(200)
                 .contentType("application/xml")
                 .header("Content-Type", "application/xml")
          .body("CUSTOMER.CITY",equalTo("San Francisco"))
                .body("CUSTOMER.FIRSTNAME",equalTo("James"))
                  .log().all();
    }
}
