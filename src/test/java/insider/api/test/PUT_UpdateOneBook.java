package insider.api.test;

import org.junit.Test;

import insider.utils.APIConstants;
import insider.utils.APIGlobalVariables;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PUT_UpdateOneBook {
	
	@Test
	public void updateOneBook() {
		
		
		RestAssured.baseURI = APIConstants.BASE_URI2;
		
		//request needs 4 items
		// auth token
		// content type
		// path param
		// payload
		
		String payload = "{\r\n"
				+ "  \"userId\": \""+ APIGlobalVariables.UserId +"\",\r\n"
				+ "  \"isbn\": \""+ APIGlobalVariables.book1 +"\"\r\n"
				+ "}";
		
		String token = APIGlobalVariables.token;
		
	Response response =	RestAssured.given()
		.auth().oauth2(token)
		.pathParam("ISBN", APIGlobalVariables.book4)
		.contentType(ContentType.JSON)
		.body(payload)
		.when().put(APIConstants.UPDATE_ONE_BOOK_ENDPOINT).prettyPeek();
		
	response.then().assertThat().statusCode(200);
	
	//check if the response body contains certain string
	
	
	
		
		
		
		
	}

}
