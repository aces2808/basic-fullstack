package ph.com.fullstack.sudocode.user.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create() {
        return "";
    }

    @RequestMapping(value = "/retrieve", method = RequestMethod.GET)
    public String retrieve() {
        return "";

    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public String update() {
        return "";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String delete() {
        return "";

    }
}
