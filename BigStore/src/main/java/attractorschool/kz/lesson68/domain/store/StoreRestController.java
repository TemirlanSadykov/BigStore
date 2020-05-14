package attractorschool.kz.lesson68.domain.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/findByStore")
public class StoreRestController {

    @Autowired
    private StoreService service;

    @GetMapping("/findStoreByName/{findStoreByName}")
    public List<Store> findStoreByName(@PathVariable("findStoreByName") String findStoreByName) throws Exception{
        return service.findStoreByName(findStoreByName);
    }
    @GetMapping("/findStoreByAddress/{findStoreByAddress}")
    public List<Store> findStoreByAddress(@PathVariable("findStoreByAddress") String findStoreByAddress) throws Exception{
        return service.findStoreByAddress(findStoreByAddress);
    }
    @GetMapping("/findStoreByDescription/{findStoreByDescription}")
    public List<Store> findStoreByDescription(@PathVariable("findStoreByDescription") String findStoreByDescription) throws Exception{
        return service.findStoreByDescription(findStoreByDescription);
    }
}
