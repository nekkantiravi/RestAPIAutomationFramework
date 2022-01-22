import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //System.out.println("jackson tutorial");
        ObjectMapper mapper = new ObjectMapper();
        /*String employeejson="{}";
       JsonNode node= mapper.readTree("");
       String name=node.get("firstname").asText();
        System.out.println("First name"+name);*/

        Employee[] employeelist1 = mapper.readValue(new File("src/main/resources/EmployeeList.json"), Employee[].class);
        for (Employee list : employeelist1) {
            System.out.println(list);
        }

        System.out.println("Emploeee at 0th index:" + " " + employeelist1[1].getFirstname());

    }
}