package com.felipe.app.crud.repositories;

import com.felipe.app.crud.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
