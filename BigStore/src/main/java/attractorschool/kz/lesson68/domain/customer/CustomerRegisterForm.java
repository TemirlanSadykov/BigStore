package attractorschool.kz.lesson68.domain.customer;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CustomerRegisterForm {

    @NotBlank
    @Email(message = "You don't enter email")
    private String email = "";

    @NotBlank
    @Pattern(regexp = "^[^\\d\\s]+$", message = "Should contain only letters")
    private String name = "";

    @Size(min=4, message = "Length must be >= 4")
    private String login = "";

    @NotBlank
    @Size(min = 8, message = "Length must be >= 8")
    private String password = "";
}

