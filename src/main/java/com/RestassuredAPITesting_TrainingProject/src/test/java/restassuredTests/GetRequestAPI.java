package restassuredTests;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class GetRequestAPI {
    @Test
    public void getApiRequest() throws IOException {
       baseURI = "http://localhost:3000";
        basePath = "/Book";

        RequestSpecification req=given();

        //basePath = "/Bicycle";

        //String url="http://localhost:3000/book";

        //Response response = given().contentType(ContentType.JSON).log().all().get();

        //String node2 = response.prettyPrint();
        //System.out.println("Value of node:" + node2);
        Response response= given().contentType(ContentType.JSON).log().all().get();
        JsonPath jpath=response.jsonPath();
        ArrayList<Object>books=jpath.get();
        // System.out.println("color name is:"+id);
        for(Object list:books){
    System.out.println(list);
}

              /*ArrayList<Object> users = test.get();
        HeaderConfig head=new HeaderConfig();
        users.forEach(a->{
                        System.out.println(a);
        });
        for (Object m : users) {
            System.out.println(m);
        }
        int code = res.getStatusCode();
        Assert.assertEquals(code, 200);
        System.out.println("status code is:" + code);
        String line = res.getStatusLine();
        Assert.assertEquals(line, "HTTP/1.1 200 OK");
        System.out.println("Status line" + line);*/


    }
}