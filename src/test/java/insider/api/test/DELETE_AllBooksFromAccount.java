package insider.api.test;

import org.junit.Test;

import insider.utils.APIConstants;
import insider.utils.APIGlobalVariables;
import io.restassured.RestAssured;

public class DELETE_AllBooksFromAccount {

	@Test
	public void deleteAllBooks() {
		
		RestAssured.baseURI = APIConstants.BASE_URI2;
		RestAssured.given()
		.auth().oauth2(APIGlobalVariables.token)
		.queryParam("UserId", APIGlobalVariables.UserId)
		.when().delete(APIConstants.DELETE_ALL_BOOKS_ENDPOINT).prettyPeek()
		.then().assertThat().statusCode(204);
		//.and().assertThat().body("UserId", Matchers.is(APIGlobalVariables.UserId));
		
		
		
		
		
	}
	
	
}
