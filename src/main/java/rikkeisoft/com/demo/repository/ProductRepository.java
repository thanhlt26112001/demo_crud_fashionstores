package rikkeisoft.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rikkeisoft.com.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
