package attractorschool.kz.lesson68.domain.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository repo;

    public List<Product> findProductByName(String name){
        return repo.findAllByName(name);
    }
    public List<Product> findProductByType(String type){
        return repo.findAllByType(type);
    }
    public List<Product> findProductByPrice(float price){
        return repo.findAllByPrice(price);
    }
    public List<Product> findProductByQuantity(int quantity){
        return repo.findAllByQuantity(quantity);
    }
}
