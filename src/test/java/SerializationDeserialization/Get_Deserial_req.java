package SerializationDeserialization;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get_Deserial_req {

    @Test
    public void ListUser(){
        Deserialization response=
                given()


                .when()
                .get("https://reqres.in/api/users/2")

                .as(Deserialization.class);
        System.out.println("");



    }


}

