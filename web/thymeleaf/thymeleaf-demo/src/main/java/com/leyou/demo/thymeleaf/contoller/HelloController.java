package com.leyou.demo.thymeleaf.contoller;

import com.leyou.demo.thymeleaf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("show1")
    public String show1(Model model) {
        model.addAttribute("msg", "hello, Thymeleaf");
        return "hello";
    }

    @GetMapping("show2")
    public String show2(Model model) {
        User user = new User();
        user.setAge(21);
        user.setName("ming wang");
        user.setFriend(new User("baolan", 22));
        model.addAttribute("user", user);
        return "show2";
    }

    @GetMapping("show3")
    public String show3(Model model) {
        model.addAttribute("today", new Date());
        return "show3";
    }

    @GetMapping("show4")
    public String show4(Model model) {
        List<User> users = new ArrayList<>();
        users.add(new User("ming", 11));
        users.add(new User("xx", 12));
        users.add(new User("uzi", 13));
        model.addAttribute("users", users);
        return "show4";
    }

}
