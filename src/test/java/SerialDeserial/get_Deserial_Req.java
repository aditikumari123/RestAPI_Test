package SerialDeserial;


//import API_Demo.utils;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class get_Deserial_Req {

    public HashMap map = new HashMap();
    @BeforeClass
    public void uri_config(){
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users/";
    }

    @BeforeClass
    public void generateQueryParam(){
        map.put("page", 2);
    }

    @Test
    public void ListUser(){
        PojoClass pjc = given()

                .queryParams(map)

                .when()
                .get()

                .as(PojoClass.class);

        System.out.println(pjc.getTotal_pages());
        System.out.println(pjc.getData());
        System.out.println(pjc.getData().get(5));
        System.out.println(pjc.getData().get(4).getFirst_name());
        String fn = pjc.getData().get(4).getFirst_name();
        Assert.assertEquals(fn,"George");

    }
}

