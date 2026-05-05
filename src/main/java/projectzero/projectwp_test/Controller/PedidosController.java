package projectzero.projectwp_test.Controller;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidosController {

    @GetMapping("/pedidos")
    public String pedidos(HttpSession sessao, Model model) {

        String usuario = (String) sessao.getAttribute("usuarioLogado");

        model.addAttribute("usuario", usuario);

        return "pedidos";
    }
}