package projectzero.projectwp_test.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidosController {

    @GetMapping("/pedidos")
    public String pedidos(Authentication authentication, Model model) {

        String usuario = authentication.getName();

        model.addAttribute("usuario", usuario);

        return "pedidos";
    }
}