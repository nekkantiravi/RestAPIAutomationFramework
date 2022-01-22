package restassuredTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Put_Request {

    HashMap map = new HashMap();


    @BeforeClass
    public void putData() {
        map.put("id", "3");
        map.put("firstName", "lakshmi");
        map.put("lastName", "sathvika");
        map.put("email", "lakshmi@est.com");
        map.put("age", "14");


    }

    @Test(priority = 1)
    public void putTest() {
        given()
                .contentType("application/json")
                .body(map)
                .when()
                .put("http://localhost:3000/users/3")
                .then()
                .statusCode(200);
        //Assert.assertEquals();


    }


}


