package ph.com.fullstack.sudocode.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController {


    @RequestMapping(value = "/auth")
    public String auth() {
        return "";
    }
}
