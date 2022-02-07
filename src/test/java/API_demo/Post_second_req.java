package API_demo;

import io.restassured.RestAssured;
import io.restassured.internal.util.IOUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Post_second_req {

    public FileInputStream fileipstream;
    @BeforeClass
    public void url_setup(){
        RestAssured.baseURI ="https://reqres.in";
        RestAssured.basePath = "/api/users";
    }

    @BeforeClass
    public void generatereqbody()  throws FileNotFoundException {
         fileipstream= new FileInputStream("C:\\Users\\DELL\\RestAPI_Test\\src\\test\\resources\\CreateUser_input_payload.json");
    }


        @Test
    public void CreateUser(){

        given()
                .contentType("application/json")
                .body(fileipstream)
               // .body(IOUtils.to)

                .when()
                .post()
                .then()
                .statusCode(201)
                .statusLine("HTTP/1.1 201 Created")
                .header("Content-Type", "application/json; charset=utf-8")
                .body("name",equalTo("morpheus"))
                .log().all();

    }

}

