import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;

public class BaseConfig {
    public static RequestSpecification requestSpecification;
//    public static ResponseSpecification responseSpecification;

    @BeforeClass
    public static void setup() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://juice-shop.herokuapp.com/")
                .addHeader("Content-Type","application/json")
                .addHeader("Accept","application/json")
                .build();

//        responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .build();

        RestAssured.requestSpecification = requestSpecification;
//        RestAssured.responseSpecification = responseSpecification;
    }
}
