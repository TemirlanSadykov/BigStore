package attractorschool.kz.lesson68.domain.product;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "You don't enter product name")
    @Column(length = 128)
    private String name;

    @NotBlank(message = "You don't enter product image")
    @Column(length = 128)
    private String image;

    @NotBlank(message = "You don't enter product price")
    @Positive(message = "Price should be bigger than 0")
    @Column(length = 128)
    private float price;

    @NotBlank(message = "You don't enter product quantity")
    @PositiveOrZero(message = "Price should not be negative ")
    @Column(length = 128)
    private int quantity;

    @NotBlank(message = "You don't enter product type")
    @Column(length = 128)
    private String type;

}