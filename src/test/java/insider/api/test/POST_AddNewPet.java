package insider.api.test;

import org.junit.Test;
import insider.utils.APIConstants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POST_AddNewPet {

	@Test
	public void addPet() {

		RestAssured.baseURI = APIConstants.BASE_URI;

		String payload = """
							{
				  "id": "",
				  "category": {
				    "id": "",
				    "name": "dwight"
				  },
				  "name": "doggie",
				  "photoUrls": [
				    "string"
				  ],
				  "tags": [
				    {
				      "id": 159357,
				      "name": "frenchbulldog"
				    }
				  ],
				  "status": "available"
				}

		                	""";
		
		
		RestAssured.given()
		.body(payload).contentType(ContentType.JSON)
		.when().post(APIConstants.POST_ADD_NEW_PET)
		.prettyPeek();

	}

}
