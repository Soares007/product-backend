package com.example.productbackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productbackend.entities.Product;
import com.example.productbackend.services.ProductService;

@RestController
@RequestMapping("products")
public class ProductContoller {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        var products = this.service.getProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable long id){
        this.service.deleteProductById(id);
        return ResponseEntity.noContent().build();
    }
}






