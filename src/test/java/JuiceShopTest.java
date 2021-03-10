import datamodels.LoginData;
import datamodels.RegisterCustomerData;
import datamodels.SecurityQuestion;
import net.minidev.json.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class JuiceShopTest extends BaseConfig {
    @Test
    public void loginToJuiceApp() {
        given()
                .body(loginDataBuilder())
                .log().all().
        when()
                .post("rest/user/login").
        then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void registerUser(){
        given()
                .body(registrationDataBuilder()).
         when()
                .post("api/Users/").
         then()
                .log().all()
                .statusCode(201);

    }

    private LoginData loginDataBuilder(){
        return LoginData.builder()
                .email("shweta1@gmail.com")
                .password("Password@123")
                .build();
    }

    private RegisterCustomerData registrationDataBuilder(){
        return RegisterCustomerData.builder()
                .email("shweta56@gmail.com")
                .password("Anything123")
                .passwordRepeat("Anything123")
                .securityQuestion(SecurityQuestion.builder()
                        .question("Your eldest siblings middle name?")
                        .createdAt("2021-03-09T03:30:41.854Z")
                        .updatedAt("2021-03-09T03:30:41.854Z")
                        .build())
                .securityAnswer("bla").build();
    }
}