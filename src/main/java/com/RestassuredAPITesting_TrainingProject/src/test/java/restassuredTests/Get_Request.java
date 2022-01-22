package restassuredTests;


//Given() set cookies, add auth, add param, set headers, info etc..
//When() get, post,put, delete
//Then() Validate status code, extract response, extract headers cookies and Response body.


//import io.restassured.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.*;

public class Get_Request {
    //$.users[?(@.age<=40)]
    //$.users[1].age(key)
    @Test
    public void getApiRequest() {
        baseURI = "http://localhost:3000";
        basePath = "/Book";

        Response response = given().contentType(ContentType.JSON).log().all().get();

        String node2 = response.prettyPrint();
        System.out.println("Value of node:" + node2);
        //io.restassured.path.json.JsonPath extractor=response.jsonPath();
        //String email = extractor.get("email");
       // System.out.println("Email value is:" + email);
        Response res = given().contentType(ContentType.JSON).log().all().get();
        JsonPath test=res.jsonPath();
        ArrayList<Object> users = test.get();
        for (Object m : users) {
            System.out.println(m);

        }

        //Assert.assertEquals(response.getStatusCode(), 200, "response code mismatch");
        //String value=response.jsonPath().get("$.users[1,4,2].firstName");
//String value=response.jsonPath().get("$..users[2]").toString();
        //System.out.println("The value is" +value);
        //Assert.assertEquals(value,"2","lastname mismatch");
        /*ResponseBody body=response.getBody();
        System.out.println("Response body is:" + body);
*/


    }

    @Test(enabled = false)
    public void getRequest() {


    /*

            given()
                    .when()
                    .get("http://ergast.com/api/f1/2017/circuits.json")
                    .then()
                    .assertThat()
                    .statusCode(200).
                    and()
                    .body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
                    and()
                    .header("Content-Type", equalTo("application/json; charset=utf-8"))
                    .and()
                    .contentType("application/json; charset=utf-8");


             Response resp = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
            int code = get("http://ergast.com/api/f1/2017/circuits.json").statusCode();
            System.out.println("Status code is:" + code);
            Assert.assertEquals(code, 200);
            String data = get("http://ergast.com/api/f1/2017/circuits.json").asString();
            System.out.println("Body Data is:" + data);
            long time = get("http://ergast.com/api/f1/2017/circuits.json").getTime();
            System.out.println("time is:" + time);

        }

        @Test
        public void testCircuitBody() {
            String type = get("http://ergast.com/api/f1/2017/circuits.json").contentType();
            System.out.println("Content Type is:" + type);
            Assert.assertTrue(true, "application/json; charset=utf-8");
        }
    */
        RequestSpecification res = RestAssured.given();
        res.when();
        res.queryParam("id", "4");
        res.queryParam("firstName", "Vijaya");
        Response rop = get("http://localhost:3000/users");
        String line = rop.statusLine();
        long time = rop.getTime();
        int code = rop.statusCode();
        System.out.println(line);
        System.out.println(time);
        System.out.println(code);
        //System.out.println("Vales are:" +values);

    }

}