package org.myprogram.springboot.repositories;


import org.myprogram.springboot.entity.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {
}
