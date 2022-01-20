package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();

    @Query("SELECT C FROM ProductType C")
    List<ProductType> findAllProductTypes();

    @Query("SELECT C FROM ProductType C WHERE C.name = :name")
    ProductType findProductTypeByName(String name);

    @Query("SELECT C FROM Product C WHERE C.price < :p")
    List<Product> findByPriceLessThan(Double p);
    
    Optional<Product> findById(int id);
    Product findByName(String name);
    // Product save(Product p);
}
