package org.springframework.samples.petclinic.product;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeFormatter implements Formatter<ProductType>{

    @Autowired
    private ProductService pService;

    @Override
    public String print(ProductType object, Locale locale) {
        return object.getName();
    }

    @Override
    public ProductType parse(String text, Locale locale) throws ParseException {
        Collection<ProductType> findPetTypes = this.pService.getAllProductsType();
		for (ProductType type : findPetTypes) {
			if (type.getName().equals(text)) {
				return type;
			}
		}
		throw new ParseException("type not found: " + text, 0);
    }
    
}
