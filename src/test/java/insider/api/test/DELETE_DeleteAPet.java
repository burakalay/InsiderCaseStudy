package insider.api.test;

import org.junit.Test;

import insider.utils.APIConstants;
import io.restassured.RestAssured;

public class DELETE_DeleteAPet {
	
	@Test
	public void deletePet() {
		
		int petId=296;
		

		 RestAssured.baseURI = APIConstants.BASE_URI;
		    RestAssured.given()
		            .auth().oauth2("special-key")
		            .pathParam("petId", petId) 
		    .when()
		            .delete("/pet/{petId}") 
		    .prettyPeek();
	}

}
