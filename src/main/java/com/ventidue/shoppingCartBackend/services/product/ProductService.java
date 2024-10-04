package com.ventidue.shoppingCartBackend.services.product;

import com.ventidue.shoppingCartBackend.exceptions.ProductNotFoundException;
import com.ventidue.shoppingCartBackend.models.Image;
import com.ventidue.shoppingCartBackend.models.Product;
import com.ventidue.shoppingCartBackend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

public class ProductService implements IProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(()-> new ProductNotFoundException("Product not found!"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id).ifPresent(productRepository::delete);
    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String category, String name) {
        return List.of();
    }

    @Override
    public Long countProductByBrandAndName(String brand, String name) {
        return 0;
    }

    @Override
    public Product updateProductPrice(Long productId, BigDecimal newPrice) {
        return null;
    }

    @Override
    public void updateProductInventory(Long productId, Integer newInventory) {

    }

    @Override
    public List<Product> getProductsInPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return List.of();
    }

    @Override
    public List<Product> searchProducts(String keyword) {
        return List.of();
    }

    @Override
    public List<Product> getTopSellingProducts(int limit) {
        return List.of();
    }

    @Override
    public void addImageToProduct(Long productId, Image image) {

    }

    @Override
    public void removeImageFromProduct(Long productId, Long imageId) {

    }

    @Override
    public List<Product> getProductsByPopularity() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByRating(Double minRating) {
        return List.of();
    }

    @Override
    public void clearInventory(Long productId) {

    }

    @Override
    public void markProductAsFeatured(Long productId) {

    }

    @Override
    public void unmarkProductAsFeatured(Long productId) {

    }
}
