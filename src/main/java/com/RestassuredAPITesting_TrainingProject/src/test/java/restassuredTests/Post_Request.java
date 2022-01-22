package restassuredTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Post_Request {

    HashMap map = new HashMap();


    @BeforeClass
    public void postData() {
        map.put("id", RestUtils.getId());
        map.put("firstName", RestUtils.getfirstName());
        map.put("lastName", RestUtils.getlastName());
        map.put("email", RestUtils.getemail());


//baseURI=" http://localhost:3000/";
//basePath="/users";


    }

    @Test(enabled = false)
    public void test() {
        //RequestSpecification request=RestAssured.given();
        //request.header("Content-Type","application/json");


        RequestSpecification request = RestAssured.given().header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("id", "9");
        json.put("firstName", "David");
        json.put("lastName", "simson");
        json.put("email", "David@test.com");
        request.body(json.toJSONString());
        Response response = request.post("http://localhost:3000/Book");
        int code = response.getStatusCode();
        Assert.assertEquals(code, 201);
        System.out.println("Status code is:" + code);
        given()
                .contentType("application/json")
                .body(map)
                .when()
                .post("http://localhost:3000/users")
                //.delete("http://localhost:3000/users/yfb41bz")


                .then()
                .statusCode(200);

        // .body("success code", equalTo(201));


    }


}
