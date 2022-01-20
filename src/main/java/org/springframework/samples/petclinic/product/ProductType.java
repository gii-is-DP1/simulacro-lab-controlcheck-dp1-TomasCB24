package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_type")
<<<<<<< HEAD
public class ProductType extends BaseEntity{
    
    @NotEmpty
    @Size(min = 3, max = 50)
    @Column(unique = true)
=======
public class ProductType extends BaseEntity {
    
    @NotEmpty
    @Size(min = 3, max = 50)
    @Column(name = "name", unique = true)
>>>>>>> 7045109d084b51506614545dc0f5c2622402fddd
    String name;
}
