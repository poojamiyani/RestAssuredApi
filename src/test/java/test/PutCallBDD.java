package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutCallBDD {

	@Test
		public void Put_Api() {

			JSONObject request = new JSONObject();

			request.put("first_name", "Emma");
			request.put("last_name", "Wong");

			System.out.println(request);
			System.out.println(request.toJSONString());

			given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
			when().
			put("https://reqres.in/api/users/2").
			then().
			statusCode(200);

		}
}
