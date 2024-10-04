package com.ecommerce.microcommerece.ercomerce.DAO.Dao;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Product {
    private int id ; 
    private String nom;
    private int prix;


}
