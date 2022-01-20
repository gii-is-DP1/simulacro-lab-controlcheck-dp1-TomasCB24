package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


<<<<<<< HEAD
public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();

    @Query("SELECT P FROM ProductType P")
    List<ProductType> findAllProductTypes();

    Optional<Product> findById(int id);
    Product findByName(String name);

    @Query("SELECT P FROM ProductType P WHERE P.name LIKE ?1")
    ProductType getByName(String name);

    @Query("SELECT P FROM Product P WHERE P.price < :price")
    List<Product> findByPriceLessThan(Double price);
    Product save(Product p);
=======

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
>>>>>>> 7045109d084b51506614545dc0f5c2622402fddd
}
