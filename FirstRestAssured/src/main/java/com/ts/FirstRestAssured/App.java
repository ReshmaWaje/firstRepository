package com.ts.FirstRestAssured;
import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
/*--------------- object to json =serialization---------------*/    	
    	Student stud=new Student();
    	stud.setName("Reshma");
    	stud.setJob("Test engineer");
    	
    	given()
    	.contentType("application/json")
    	.body(stud)
    	.when()
    	.post("https://reqres.in/api/users")
    	.then().log().all();
    	
 /*--------------- end---------------*/    	
  
   /* 	given()
		.when()
		.get(" https://reqres.in/api/users/2")
		.then()
		.log()
		.body();    
    	
    	given().
    	contentType("application/json").body
    	("{\r\n"
    			+ "    \"name\": \"morpheus\",\r\n"
    			+ "    \"job\": \"leader\"\r\n"
    			+ "}")
    	.when()
    	.post("https://reqres.in/api/users")
    	.then().log().all();

 
    	String jsonString="{\r\n"
    			+ "  \"name\":\"reshma\",\r\n"
    			+ "  \"cars\":[\r\n"
    			+ "  {\r\n"
    			+ "    \"name\":\"I20\",\r\n"
    			+ "    \"year\":\"2005\"\r\n"
    			+ "  },\r\n"
    			+ "  {\r\n"
    			+ "     \"name\":\"swift\",\r\n"
    			+ "    \"year\":\"2010\"\r\n"
    			+ "    \r\n"
    			+ "  }]\r\n"
    			+ "}";
    	
    	JsonPath js=new JsonPath(jsonString);
    	String carName=js.getString("cars[0].name");
    	System.out.println("car name:"+carName);       }*/
    }
}
