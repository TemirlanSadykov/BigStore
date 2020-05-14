package attractorschool.kz.lesson68.domain.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/findByProduct")
    public String findByProduct(Model model){
        return "findByProduct";
    }
}
