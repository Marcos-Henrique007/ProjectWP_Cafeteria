package projectzero.projectwp_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import projectzero.projectwp_test.filter.AuthFilter;
import projectzero.projectwp_test.model.Login;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
