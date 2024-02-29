package insider.api.test;

import org.hamcrest.Matchers;
import org.junit.Test;
import insider.utils.APIConstants;
import insider.utils.APIGlobalVariables;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POST_addListOfBooks {
	@Test
	public void addListOfBooks() {
		
		RestAssured.baseURI = APIConstants.BASE_URI2;
		String token = APIGlobalVariables.token;
		
		String payload  = "{\r\n"
				+ "    \"userId\": \""+ APIGlobalVariables.UserId +"\",\r\n"
				+ "    \"collectionOfIsbns\": [\r\n"
				+ "        {\r\n"
				+ "            \"isbn\": \""+ APIGlobalVariables.book1 +"\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"isbn\": \""+ APIGlobalVariables.book2 +"\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"isbn\": \"" + APIGlobalVariables.book3 + "\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		
		
		RestAssured.given()
		.auth().oauth2(token)
		.body(payload)
		.contentType(ContentType.JSON)
		.when().post(APIConstants.ADD_LIST_OF_BOOKS_ENDPOINT)
		.prettyPeek()
		.then()
		.assertThat().statusCode(201)
		.and()
		.body("books[0].isbn", Matchers.is(APIGlobalVariables.book1))
		.and()
		.body("books[1].isbn", Matchers.is(APIGlobalVariables.book2));
		
		
		
	}

}
