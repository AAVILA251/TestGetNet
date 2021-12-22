package projeto.api.restassured;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get {

	@Test
	public void statusCode() {

		Response response = RestAssured.get("https://reqres.in/api/%20-%20Documenta%C3%A7%C3%A3o");
		int satusCode = response.getStatusCode();
		assertEquals(200, satusCode);
		System.out.println("Status Code: " + response.getStatusCode());
		
	}

}
