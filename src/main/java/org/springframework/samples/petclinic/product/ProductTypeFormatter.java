package org.springframework.samples.petclinic.product;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
=======
>>>>>>> 7045109d084b51506614545dc0f5c2622402fddd
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeFormatter implements Formatter<ProductType>{

<<<<<<< HEAD
    @Autowired
    private ProductService pService;
=======
    private final ProductService peService;

    @Autowired
	public ProductTypeFormatter(ProductService petService) {
		this.peService = petService;
	}
>>>>>>> 7045109d084b51506614545dc0f5c2622402fddd

    @Override
    public String print(ProductType object, Locale locale) {
        return object.getName();
    }

    @Override
    public ProductType parse(String text, Locale locale) throws ParseException {
<<<<<<< HEAD
        Collection<ProductType> findPetTypes = this.pService.getAllProductsType();
=======
       
        Collection<ProductType> findPetTypes = this.peService.getAllProductsType();
>>>>>>> 7045109d084b51506614545dc0f5c2622402fddd
		for (ProductType type : findPetTypes) {
			if (type.getName().equals(text)) {
				return type;
			}
		}
		throw new ParseException("type not found: " + text, 0);
    }
    
}
