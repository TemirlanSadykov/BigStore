package attractorschool.kz.lesson68.domain.order;

import attractorschool.kz.lesson68.domain.customer.Customer;
import attractorschool.kz.lesson68.domain.product.Product;
import attractorschool.kz.lesson68.domain.store.Store;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "order")
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

}
