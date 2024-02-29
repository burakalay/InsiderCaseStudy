package insider.api.test;

import org.junit.Test;

import insider.utils.APIConstants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_SearchPetWithID {
	@Test
	public void GET_Pet() {
		
        RestAssured.baseURI = APIConstants.BASE_URI;
    
        RequestSpecification request = RestAssured.given();
        
       
        Response response = request
                .pathParam("petId", 10)
            .when()
                .get(APIConstants.GET_FIND_BY_ID)
            .then()
                .extract().response();

        
        System.out.println("Response Body:");
        System.out.println(response.asPrettyString());

       
        int statusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + statusCode);

		
	}

}
