package com.ecommerce.microcommerece.ercomerce.DAO.Dao;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product")


public class ProductController {

    ProdcutServiseImplemnet prodcutServiseImplemnet;



    @GetMapping("/getAllProduct")

    public List <Product> getAllProduct(){
      return   prodcutServiseImplemnet.listerAll();
    }
    @GetMapping("/GetProductById/{id}")
    public Product getProduct ( @PathVariable  Long id ){
       return prodcutServiseImplemnet.listerUnProduit(id);
    }
    @PostMapping("/ajouter Porduct")


public Product AjouteProduct(Product product){
    return prodcutServiseImplemnet.ajouter(product);
}




}
