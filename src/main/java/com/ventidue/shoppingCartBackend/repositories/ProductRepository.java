package com.ventidue.shoppingCartBackend.repositories;

import com.ventidue.shoppingCartBackend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}