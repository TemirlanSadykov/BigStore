package attractorschool.kz.lesson68.domain.store;

import attractorschool.kz.lesson68.domain.product.Product;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Getter
@Setter
@Table(name = "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "You don't enter store name")
    @Column(length = 128)
    private String name;

    @NotBlank(message = "You don't enter store image")
    @Column(length = 128)
    private String image;

    @NotBlank(message = "You don't enter store address")
    @Column(length = 128)
    private String address;

    @NotBlank(message = "You don't enter store name")
    @Column(length = 128)
    private String description;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}