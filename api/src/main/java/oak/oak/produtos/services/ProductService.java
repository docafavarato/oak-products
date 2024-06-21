package oak.oak.produtos.services;

import oak.oak.produtos.domain.Product;
import oak.oak.produtos.repositories.ProductRepository;
import oak.oak.produtos.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    public Product findById(UUID id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElseThrow(() -> new ObjectNotFoundException("Product with id " + id + " not found"));
    }

    public List<Product> findByName(String name) {
        List<Product> products = productRepository.findProductsByNameContainingIgnoreCaseOrderByPriceAsc(name);
        return products;
    }

    public List<Product> findAllOrderByPriceAsc() {
        List<Product> products = productRepository.findAllByOrderByPriceAsc();
        return products;
    }

    public List<Product> findByAvailable(Boolean available) {
        List<Product> products = productRepository.findProductByAvailableOrderByPriceAsc(available);
        return products;
    }

    public Product insert(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(UUID id) {
        productRepository.deleteById(id);
    }

}
