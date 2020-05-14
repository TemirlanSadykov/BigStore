package attractorschool.kz.lesson68.domain.store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
    public List<Store> findAllByName(String name);
    public List<Store> findAllByDescription(String name);
    public List<Store> findAllByAddress(String name);
}
