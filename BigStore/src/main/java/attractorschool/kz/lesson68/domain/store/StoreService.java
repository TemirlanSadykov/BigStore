package attractorschool.kz.lesson68.domain.store;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StoreService {

    private StoreRepository repo;

    public List<Store> findStoreByName(String name){
        return repo.findAllByName(name);
    }
    public List<Store> findStoreByAddress(String address){
        return repo.findAllByAddress(address);
    }
    public List<Store> findStoreByDescription(String description){
        return repo.findAllByDescription(description);
    }
}
