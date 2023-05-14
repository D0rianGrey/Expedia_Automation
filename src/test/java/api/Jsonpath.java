package api;

import api.models.Users;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;

import java.util.List;

public class Jsonpath {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        var list = RestAssured.when().get("/users").then()
                .log()
                .body()
                .extract()
                .body()
                .jsonPath()
                .getList("$", Users.class);

        System.out.println("List size: " + list.size());

        List<Users> list1 = list.stream()
                .filter(user -> user.getId() <= 5)
                .peek(user -> {
                    var website = user.getWebsiteFake() + "--> test";
                    user.setWebsiteFake(website);
                }).toList();

        System.out.println(list1);
        System.out.println("List size: " + list1.size());
    }
}
