package org.springframework.samples.petclinic.product;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    
@Autowired
private ProductService pService;

private static final String VIEWS_OWNER_CREATE_OR_UPDATE_FORM = "products/createOrUpdateProductForm";

@GetMapping(path = "/product/create")
public String create(ModelMap model){
    Product p = new Product();
	model.put("product", p);
	return "products/createOrUpdateProductForm";

}

@PostMapping(path = "/product/create")
public String save(@Valid Product product, BindingResult result, ModelMap modelMap){
    if (result.hasErrors()) {
        modelMap.put("product", product);
        if(product.price<0){
            return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;

        }
        if(product.name == ""){
            return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
        }

        return "welcome";
    }
    else {
        //creating owner, user and authorities
        this.pService.save(product);
        
        return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
    }

}}
