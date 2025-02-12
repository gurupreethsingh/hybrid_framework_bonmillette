package endpoints;
  
import payload.Contact;
import routes.Category_routes;
import routes.Contact_routes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ContactEndpoints {
		// create functions for all your contact actions. you need to perform
		
		public static Response createMessage(Contact contact)
		{
			Response response = null;
			
			try
			{
				response = given()
	  			.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(contact)
				.when()
				.post(Contact_routes.post_create_message_url);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			return response;
		}
		
		
		
		public static Response getAllMessages()
		{
			Response response = null;
			try
			{
	             response = given()
	         			.when()
	        	        .get(Contact_routes.get_fetch_all_messages_url);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			return response;
		}
		
		
		
		
		
		public static Response getContactById(String id)
		{
			Response response = null;
			  try {
			     response=given()
					.when()
			        .get(Contact_routes.get_fetch_message_by_id_url.replace(":id", id));
			  }
			  catch (Exception ex) {
		            ex.printStackTrace();
		        }
			  
			return response;
		}
		
		
		public static Response getAllMessageCount()
		{
			Response response = null;
			try
			{
	             response = given()
	         			.when()
	        	        .get(Contact_routes.get_total_message_count_url);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			return response;
		}
		
	} 