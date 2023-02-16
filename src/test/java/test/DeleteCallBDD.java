package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteCallBDD {
    @Test
	public void Delete_Api() {
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).
		log().all();
	}
}
