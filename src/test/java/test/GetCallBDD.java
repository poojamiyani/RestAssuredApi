package test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetCallBDD {	
	@Test 
	public void Circuits2022_Season(){
		given().
		when().
		      get("http://ergast.com/api/f1/2022/circuits.json").
		then().
		      assertThat().
		      statusCode(200).
		      and().
		      body("MRData.CircuitTable.Circuits.circuitId",hasSize(22)).
		      and().
		      header("Content-Length", equalTo("4987")).
		      log().all();
		
	}
	
	
	
	
	
	
}
