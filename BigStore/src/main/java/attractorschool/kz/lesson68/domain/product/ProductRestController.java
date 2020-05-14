package attractorschool.kz.lesson68.domain.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/findByProduct")
public class ProductRestController {

    @Autowired
    private ProductService service;

    @GetMapping("/findProductByName/{findProductByName}")
    public List<Product> findProductByName(@PathVariable("findProductByName") String findProductByName) throws Exception{
        return service.findProductByName(findProductByName);
    }
    @GetMapping("/findProductByType/{findProductByType}")
    public List<Product> findProductByType(@PathVariable("findProductByType") String findProductByType) throws Exception{
        return service.findProductByType(findProductByType);
    }
    @GetMapping("/findProductByPrice/{findProductByPrice}")
    public List<Product> findProductByPrice(@PathVariable("findProductByPrice") float findProductByPrice) throws Exception{
        return service.findProductByPrice(findProductByPrice);
    }
    @GetMapping("/findProductByQuantity/{findProductByQuantity}")
    public List<Product> findProductByQuantity(@PathVariable("findProductByQuantity") int findProductByQuantity) throws Exception{
        return service.findProductByQuantity(findProductByQuantity);
    }
}
