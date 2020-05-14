package attractorschool.kz.lesson68.domain.store;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {
    @GetMapping("/findByStore")
    public String findByStore(Model model){
        return "findByStore";
    }
}
