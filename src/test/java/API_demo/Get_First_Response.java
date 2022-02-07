package API_demo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get_First_Response {
    @Test
    public void get_rest(){
        given()

                .when()
                    .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200);

    }
}
