package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pRepository;
<<<<<<< HEAD
    
=======


>>>>>>> 7045109d084b51506614545dc0f5c2622402fddd
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
<<<<<<< HEAD
        return pRepository.getByName(typeName);
    }

    public Product save(Product p){
        return pRepository.save(p);      
=======
        return pRepository.findProductTypeByName(typeName);
    }

    public Product save(Product p){
        return pRepository.save(p);       
>>>>>>> 7045109d084b51506614545dc0f5c2622402fddd
    }

    
}
