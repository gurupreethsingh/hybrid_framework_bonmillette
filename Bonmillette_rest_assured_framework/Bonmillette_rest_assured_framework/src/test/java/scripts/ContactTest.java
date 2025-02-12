package scripts;


 import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import endpoints.ContactEndpoints;
import io.restassured.response.Response;
import payload.Contact;


public class ContactTest 
{
	Faker faker;
	Contact contact;
	
	@BeforeMethod
	public void setUpData()
	{
		faker = new Faker();
		contact = new Contact();
		contact.setFirstName(faker.name().firstName());
		contact.setLastName(faker.name().lastName());
		contact.setEmail(faker.internet().safeEmailAddress());
		contact.setPhone(faker.phoneNumber().cellPhone());
		contact.setMessage_text(faker.lorem().sentence());
	}
	
	@Test(priority = 1)
	public void testMessageCreation()
	{
		Response response = ContactEndpoints.createMessage(contact);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 201);
	}
	
	
	@Test(priority = 2)
	public void testFetchingAllMessages()
	{
		Response response = ContactEndpoints.getAllMessages();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 3)
	public void testFetchingSingleMessages()
	{
		String hardcodedContactId = "67513bc92f2418ee351a6891";
		Response response = ContactEndpoints.getContactById(hardcodedContactId);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}