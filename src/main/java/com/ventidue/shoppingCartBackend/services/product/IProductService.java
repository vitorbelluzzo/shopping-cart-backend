package com.ventidue.shoppingCartBackend.services.product;

import com.ventidue.shoppingCartBackend.models.Image;
import com.ventidue.shoppingCartBackend.models.Product;

import java.math.BigDecimal;
import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductByBrandAndName(String brand, String name);

}
