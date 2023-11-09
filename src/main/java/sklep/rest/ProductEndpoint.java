package sklep.rest;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sklep.model.Product;
import sklep.repository.ProductRepository;

@RestController
public class ProductEndpoint {
    private ProductRepository productRepository;

    public ProductEndpoint(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        System.out.println("puk puk");
        return productRepository.findAll();
    }

}
