package projectzero.projectwp_test.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String usuario,
                        @RequestParam String senha,
                        HttpSession sessao) {

        if ("admin@gmail.com".equals(usuario) && "123".equals(senha)) {
            sessao.setAttribute("usuarioLogado", usuario);
            return "redirect:/pedidos";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession sessao) {
        sessao.invalidate(); // 🔥 mata a sessão
        return "redirect:/login";
    }
}