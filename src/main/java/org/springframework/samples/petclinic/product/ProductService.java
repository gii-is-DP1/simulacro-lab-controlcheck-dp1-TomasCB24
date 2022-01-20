package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pRepository;
    
    public List<Product> getAllProducts(){
        return pRepository.findAll();
    }

    public List<ProductType> getAllProductsType(){
        return pRepository.findAllProductTypes();
    }

    public List<Product> getProductsCheaperThan(double price) {
        return pRepository.findByPriceLessThan(price);
    }

    public ProductType getProductType(String typeName) {
        return pRepository.getByName(typeName);
    }

    public Product save(Product p){
        return pRepository.save(p);      
    }

    
}
