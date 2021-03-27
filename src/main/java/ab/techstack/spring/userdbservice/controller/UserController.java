package ab.techstack.spring.userdbservice.controller;

import ab.techstack.spring.userdbservice.model.User;
import ab.techstack.spring.userdbservice.repository.UserRepository;
import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    @ResponseBody
    @Timed(value = "allEmployeeAPI")
    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable Integer id){
        return this.userRepository.getOne(id);
    }

    @PostMapping
    @ResponseBody
    public User saveUser(User user){
        return this.userRepository.save(user);
    }
}