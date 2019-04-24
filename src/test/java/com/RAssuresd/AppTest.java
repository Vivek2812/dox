package com.RAssuresd;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	@Test
	public void testResponseCode() throws JSONException 
	{
		
//		String URI="http://ergast.com/api/f1/2017/circuits.json";
//		Response resp=RestAssured.get(URI);
//		int code = resp.getStatusCode();
//		System.out.println(code);
//		Assert.assertEquals(code, 200);
		RestAssured.proxy("genproxy.amdocs.com",8080); 
		given().
		when().
			get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").
		then().
			assertThat().
			statusCode(200);
//		System.out.println(body.asSreing());
		
//		ResponseBody body = response.getBody();
	}
    
}