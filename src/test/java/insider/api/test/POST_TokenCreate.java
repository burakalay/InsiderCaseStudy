package insider.api.test;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_TokenCreate {

	@Test
	public void createToken() {

		RestAssured.baseURI = "https://bookstore.toolsqa.com";

		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/json");

		// create the payload
		String payload = "{\r\n" + " \"userName\": \"Burak-Test112233\"," + "\r\n" + "  \"password\":  \"Asdasdf@123\"\r\n"
				+ "}";
		
		request.body(payload);
		
       Response response = request.when().post("/Account/v1/GenerateToken");
       
       response.prettyPrint();
       
       response.then().assertThat().statusCode(200);
       System.out.println(response.statusCode());

       
       System.out.println(response.getStatusLine());

       String token = response.body().jsonPath().getString("token");
       System.out.println(token);
	}

}
