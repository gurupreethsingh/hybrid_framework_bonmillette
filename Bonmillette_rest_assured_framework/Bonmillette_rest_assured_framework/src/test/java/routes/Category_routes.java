package routes;

public class Category_routes {
    public static String base_url = "http://localhost:3006";

    // URL for adding a new category
    public static String post_add_category_url = base_url + "/api/add-category";

    // URL for getting all categories
    public static String get_all_categories_url = base_url + "/api/all-categories";

    // URL for getting a category by ID
    public static String get_single_category_url = base_url + "/api/single-category/:id";

    // URL for deleting a category by ID
    public static String delete_category_url = base_url + "/api/delete-category/:id";

    // URL for updating a category by ID
    public static String put_update_category_url = base_url + "/api/update-category/:id";

    // URL for getting total count of categories
    public static String get_category_count_url = base_url + "/api/category-count";

    // URL for getting product counts for all categories
    public static String get_category_product_counts_url = base_url + "/api/category-product-counts";
}