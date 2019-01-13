package com.example.elastic.resource;

import com.example.elastic.model.Users;
import com.example.elastic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/search")
public class SearchResource {

    @Autowired
    private UserRepository userRepository;


    @PostMapping(value = "/user")
    public Users searchName(@RequestBody Users users) {
        return userRepository.save(users);
    }

    @GetMapping(value = "/findall")
    public List<Users> searchAll() {
        List<Users> usersList = new ArrayList<>();
        userRepository.findAll().forEach(users -> usersList.add(users));
        return usersList;
    }

}
