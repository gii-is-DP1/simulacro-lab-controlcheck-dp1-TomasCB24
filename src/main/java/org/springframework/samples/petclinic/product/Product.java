package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
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
public class Product extends BaseEntity{

    @NotEmpty
    @Size(min = 3, max = 50)
    String name;

    @Min(0)
    double price;

    @ManyToOne
    ProductType productType;
}
