package attractorschool.kz.lesson68.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer> {
    public List<Product> findAllByName(String name);
    public List<Product> findAllByType(String type);
    public List<Product> findAllByPrice(float price);
    public List<Product> findAllByQuantity(int Quantity);
}
