package com.ecommerce.microcommerece.ercomerce.DAO.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProdcutServiseImplemnet  implements ProductServise{
    
@Autowired
    private RepositoryProduct repositoryProduct;

    @Override
 
    public List<Product> listerAll() {

  
  return   repositoryProduct.findAll();
    }

    @Override
    public Product listerUnProduit(Long id ) {

        Optional <Product> optional=repositoryProduct.findById(id);
        if (optional.isPresent()){
        return optional.get();}
        else 
            return null;
    }

    @Override
    public Product ajouter(Product product) {
   return  repositoryProduct.save(product);
    }
    

}
