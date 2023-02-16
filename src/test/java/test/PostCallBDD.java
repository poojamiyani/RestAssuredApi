package test;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;


public class PostCallBDD {

	@Test
	public void Post_Api() {
		// https://reqres.in/api/users
		
		Map<String ,Object> map =new HashMap<String ,Object>();
		
		map.put("name", "pooja");
		map.put("job", "teacher");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject();
		map.put("name", "pooja");
		map.put("job", "teacher");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		

		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
	}


}
