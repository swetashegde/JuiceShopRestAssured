import net.minidev.json.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class JuiceShopTest extends BaseConfig {
    @Test
    public void loginToJuiceApp() {
        JSONObject loginRequestBody = new JSONObject();
        loginRequestBody.put("email", "shweta1@gmail.com");
        loginRequestBody.put("password", "Password@123");

        given()
                .body(loginRequestBody).
        when()
                .post("rest/user/login").
        then()
                .log().all();
    }
}
