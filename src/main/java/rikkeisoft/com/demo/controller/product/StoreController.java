package rikkeisoft.com.demo.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rikkeisoft.com.demo.dto.StoreDTO;
import rikkeisoft.com.demo.model.Store;
import rikkeisoft.com.demo.service.StoreService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class StoreController {
    @Autowired
    private StoreService storeService;


    @GetMapping("/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Hello!!", HttpStatus.OK);
    }

    @GetMapping("/getStore")
    public ResponseEntity<List<Store>> getAllStores() {
        List<Store> storesList = storeService.getAllStores();
        return new ResponseEntity<>(storesList, HttpStatus.OK);
    }

    @PostMapping("/addStore")
    public ResponseEntity addStore(@RequestBody Store store) {
        storeService.saveStore(store);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteStore/{id}")
    public ResponseEntity deleteStore(@PathVariable(name = "id") int store_id) {
        storeService.deleteStore(store_id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/updateStore")
    public ResponseEntity updateStore(@RequestBody Store store) {
        storeService.saveStore(store);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/getListStoreDTO")
    public List<StoreDTO> getListStoreDTO() {
        List<StoreDTO> storesList = storeService.getListStoreDTO();
        return storesList;
    }
}
