package org.springframework.samples.petclinic.product;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.user.AuthoritiesService;
import org.springframework.samples.petclinic.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    
    private static final String VIEWS_OWNER_CREATE_OR_UPDATE_FORM = "products/createOrUpdateProductForm";


    private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
    
    @GetMapping(path = "/product/create")
    public String create(ModelMap modelMap){
        Product product = new Product();
        modelMap.put("product", product);
        return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
    }

    @PostMapping(value = "/product/create")
	public String processCreationForm(@Valid Product product, BindingResult result, ModelMap modelmap) {
		if (result.hasErrors()) {
            modelmap.put("product", product);
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
			this.productService.save(product);
			
			return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
		}
	}
    
}
