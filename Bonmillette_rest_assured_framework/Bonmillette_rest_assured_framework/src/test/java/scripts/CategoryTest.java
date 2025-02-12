package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import endpoints.CategoryEndpoints;
import io.restassured.response.Response;
import payload.Category;

public class CategoryTest 
{
    Faker faker;
    Category category;
    String categoryId;
    
    @BeforeMethod
    public void setUpData()
    {
        faker = new Faker();
        category = new Category();
        category.setCategory_name(faker.commerce().department());
    }
    
//    @Test(priority = 1)
//    public void testCategoryCreation()
//    {
//        Response response = CategoryEndpoints.addCategory(category);
//        response.then().log().all();
//        Assert.assertEquals(response.getStatusCode(), 201);
//        categoryId = response.jsonPath().getString("_id");
//    }
    
//    @Test(priority = 2)
//    public void testFetchingAllCategories()
//    {
//        Response response = CategoryEndpoints.getAllCategories();
//        response.then().log().all();
//        Assert.assertEquals(response.getStatusCode(), 200);
//    }
    
    @Test(priority = 1)
    public void testFetchingSingleCategory()
    {
        String hardcodedCategoryId = "67ac57e7d2bf47a5e4851d80";
        Response response = CategoryEndpoints.getCategoryById(hardcodedCategoryId);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    
    
//    @Test(priority = 4)
//    public void testUpdateCategory()
//    {
//        category.setCategory_name("Updated " + faker.commerce().department());
//        Response response = CategoryEndpoints.updateCategory(categoryId, category);
//        response.then().log().all();
//        Assert.assertEquals(response.getStatusCode(), 200);
//    }
//    
//    @Test(priority = 5)
//    public void testDeleteCategory()
//    {
//        Response response = CategoryEndpoints.deleteCategory(categoryId);
//        response.then().log().all();
//        Assert.assertEquals(response.getStatusCode(), 200);
//    }
}
