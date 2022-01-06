package rikkeisoft.com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkeisoft.com.demo.dto.StoreDTO;
import rikkeisoft.com.demo.model.Store;
import rikkeisoft.com.demo.repository.StoreRepository;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public List<Store> getAllStores(){
        return storeRepository.findAll();
    }

    public void saveStore(Store store) {
        storeRepository.save(store);
    }

    public void deleteStore(int store_id){
        storeRepository.deleteById(store_id);
    }

    public List<StoreDTO> getListStoreDTO(){
        return storeRepository.getListStoreDTO();
    }
}
