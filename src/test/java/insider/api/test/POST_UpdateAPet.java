package insider.api.test;

import org.junit.Test;

import insider.utils.APIConstants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_UpdateAPet {

	@Test
	public void updatePet() {
		
		RestAssured.baseURI = APIConstants.BASE_URI;
		

	
		 String requestBody = """
		            {
		                "name": "schrute",
		                "status": "sold"
		            }
		        """;
		 
		 RestAssured.given()
			.body(requestBody).contentType(ContentType.JSON)
			.pathParam("id",1)
			.when().post(APIConstants.POST_UPDATE_EXISTING_PET)
			.prettyPeek();
	
	}
	
	
	
}
