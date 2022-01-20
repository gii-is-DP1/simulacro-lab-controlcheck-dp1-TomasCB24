package org.springframework.samples.petclinic.product;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
>>>>>>> 7045109d084b51506614545dc0f5c2622402fddd
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
<<<<<<< HEAD
public class Product extends BaseEntity{

    @NotEmpty
    @Size(min = 3, max = 50)
    String name;

    @Min(0)
=======
@Table(name = "product")
public class Product extends BaseEntity{
    
    @NotEmpty
    @Size(min = 3, max = 50)
    @Column(name = "name")
    String name;

    @NotNull
    @Min(0)
    @Column(name = "price")
>>>>>>> 7045109d084b51506614545dc0f5c2622402fddd
    double price;

    @ManyToOne
    ProductType productType;
}
