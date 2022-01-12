package web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.ServiceClass;
import web.service.ServiceUser;


@Controller
@RequestMapping("/")
public class UserController {
    private final ServiceUser serviceUser;

    @Autowired
    public UserController(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String printAllUsers(Model model) {
        model.addAttribute("users", serviceUser.getAllUsers());
        return "users/user";
    }

    @GetMapping("/{id}/edit")
    public String updateUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", serviceUser.getUserById(id));
        return "users/edit";
    }
        @PatchMapping("/{id}")
        public String upDate(User user, @PathVariable("id") Long id) {
            serviceUser.editUser(user, id);
            return "redirect:/users";
        }

        @DeleteMapping("/{id}/delete")
        public String deleteUser(User user, @PathVariable("id") Long id) {
            serviceUser.deleteUser(user, id);
            return "redirect:/users";
        }

        @GetMapping("/newuser")
        public String newUser(Model model) {
            model.addAttribute("user", new User());
            return "users/newuser";
        }

        @PostMapping("/users")
        public String createUser(@ModelAttribute("user") User user) {
            serviceUser.addUser(user);
            return "redirect:/users";
        }
    }



//    @RequestMapping (value ="/", method = RequestMethod.)

