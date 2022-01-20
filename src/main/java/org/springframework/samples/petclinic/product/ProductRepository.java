package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


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
}
