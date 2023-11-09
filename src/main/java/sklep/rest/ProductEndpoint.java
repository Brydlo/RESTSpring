package sklep.rest;

import sklep.model.Product;
import sklep.repository.ProductRepository;

import java.util.List;

public class ProductEndpoint {

    private ProductRepository productRepository;

    public ProductEndpoint(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
