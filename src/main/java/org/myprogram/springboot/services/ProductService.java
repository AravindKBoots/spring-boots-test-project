package org.myprogram.springboot.services;



import java.util.List;

import org.myprogram.springboot.entity.Product;
import org.myprogram.springboot.form.ProductForm;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
