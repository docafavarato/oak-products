package oak.oak.produtos.controllers;

import oak.oak.produtos.domain.Product;
import oak.oak.produtos.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = productService.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable UUID id) {
        Product product = productService.findById(id);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping(value = "/orderByPriceAsc")
    public ResponseEntity<List<Product>> findAllOrderByPriceAsc() {
        List<Product> products = productService.findAllOrderByPriceAsc();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/search", params = {"name"})
    public ResponseEntity<List<Product>> findByName(@RequestParam(value = "name") String name) {
        List<Product> products = productService.findByName(name);
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/search", params = {"available"})
    public ResponseEntity<List<Product>> findByAvailable(@RequestParam(value = "available") Boolean available) {
        List<Product> products = productService.findByAvailable(available);
        return ResponseEntity.ok().body(products);
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Product> insert(@RequestBody Product product) {
        product = productService.insert(product);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(product.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        productService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
