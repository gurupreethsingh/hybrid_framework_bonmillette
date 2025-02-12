package endpoints;

import payload.Category;
import routes.Category_routes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CategoryEndpoints {
    
    // Add a new category
    public static Response addCategory(Category category) {
        Response response = null;
        try {
            response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(category)
                .when()
                .post(Category_routes.post_add_category_url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
    
    // Fetch all categories
    public static Response getAllCategories() {
        Response response = null;
        try {
            response = given()
                .when()
                .get(Category_routes.get_all_categories_url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
    
    // Fetch a single category by ID
    public static Response getCategoryById(String id) {
        Response response = null;
        try {
            response = given()
                .when()
                .get(Category_routes.get_single_category_url.replace(":id", id));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
    
    // Delete a category by ID
    public static Response deleteCategory(String id) {
        Response response = null;
        try {
            response = given()
                .pathParam("id", id)
                .when()
                .delete(Category_routes.delete_category_url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
    
    // Update a category by ID
    public static Response updateCategory(String id, Category category) {
        Response response = null;
        try {
            response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("id", id)
                .body(category)
                .when()
                .put(Category_routes.put_update_category_url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
    
    // Get total count of categories
    public static Response getCategoryCount() {
        Response response = null;
        try {
            response = given()
                .when()
                .get(Category_routes.get_category_count_url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
    
    // Get product counts for all categories
    public static Response getCategoryProductCounts() {
        Response response = null;
        try {
            response = given()
                .when()
                .get(Category_routes.get_category_product_counts_url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
}
