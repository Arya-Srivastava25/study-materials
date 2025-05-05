package EcommerceApplicationPattern;

import java.util.List;

public class Main {
}

class ProductCategory{
    List<Product> products;
    String category;
}

class Product{
    int id;
    String description;
    double price;

    List<ProductCategory> productCategories;
}

class User{
}