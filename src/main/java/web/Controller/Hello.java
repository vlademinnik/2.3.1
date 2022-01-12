package web.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public class Hello {
    @GetMapping("/")
public String printWelcome(ModelMap modelMap) {
    String hello = "Welcome to my page!";
    modelMap.addAttribute("hello", hello);
    return "users/hello";
}
}

