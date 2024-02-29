package insider.api.test;

import org.hamcrest.Matchers;
import org.junit.Test;

import insider.utils.APIConstants;
import insider.utils.APIGlobalVariables;
import io.restassured.RestAssured;

public class GET_Account {

	@Test
	public void getAccount() {
		
		RestAssured.baseURI = APIConstants.BASE_URI2;
		
		String token = APIGlobalVariables.token;
		
		RestAssured.given()
		.header("Authorization", "Bearer "+token)
		.pathParam("UserId", APIGlobalVariables.UserId)
		.when().get(APIConstants.GET_ACCOUNT_ENDPOINT)
		.prettyPeek()
		.then().assertThat().statusCode(200)
		.and().body("userId", Matchers.is(APIGlobalVariables.UserId))
		.and().body("username", Matchers.is("Burak-Test112233"));
		
		
	}
	
	
}
