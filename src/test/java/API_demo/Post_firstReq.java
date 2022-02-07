package API_demo;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Post_firstReq {
    public HashMap map = new HashMap();
    @BeforeClass
    public void url_setup() {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "api/users";
    }
    @BeforeClass
            public void generatereqbody(){
//        map.put("name","Neo");
//        map.put("job","Hacker");
        map.put("name",utils.getName());
        map.put("job",utils.getJob());


    }
    @Test
    public void CreateUser(){

        given()
                .body(map)
                .when()
                   .post()
                     .then()
                          .statusCode(201)
                .statusLine("HTTP/1.1 201 Created")
              .header("Content-Type", "application/json; charset=utf-8")
       //           .body("name",equalTo("Neo"))
              .log().all();

    }

}