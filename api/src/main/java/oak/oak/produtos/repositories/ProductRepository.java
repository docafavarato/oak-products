package oak.oak.produtos.repositories;

import oak.oak.produtos.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findAllByOrderByPriceAsc();
    List<Product> findProductsByNameContainingIgnoreCaseOrderByPriceAsc(String name);
    List<Product> findProductByAvailableOrderByPriceAsc(Boolean available);
}
