package rikkeisoft.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rikkeisoft.com.demo.model.Store_Products;

@Repository
public interface Store_ProductsRepository extends JpaRepository<Store_Products,Integer> {
}
