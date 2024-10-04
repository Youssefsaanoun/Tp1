package com.ecommerce.microcommerece.ercomerce.DAO.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductServise {
    public List<Product> listerAll();
    public  Product listerUnProduit(Long id );
    public  Product ajouter(Product product);

}
