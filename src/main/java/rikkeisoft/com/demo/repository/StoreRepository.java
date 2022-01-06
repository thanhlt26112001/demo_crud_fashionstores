package rikkeisoft.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rikkeisoft.com.demo.dto.StoreDTO;
import rikkeisoft.com.demo.model.Store;

import java.util.List;
@Repository
public interface StoreRepository extends JpaRepository<Store,Integer> {
    public List<Store> findAll();

    @Query(value = "select new rikkeisoft.com.demo.dto.StoreDTO(" +
            "s.id, s.name, count(sp.product.id), avg(p.price)" +
            ") from Store s join Store_Products sp on s.id = sp.store.id" +
            " join Product p on p.id= sp.product.id" +
            " group by s.id")
    public List<StoreDTO> getListStoreDTO();
}
