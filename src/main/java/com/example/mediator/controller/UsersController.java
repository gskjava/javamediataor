package com.example.mediator.controller;

import com.example.mediator.core.Mediator;
import com.example.mediator.features.users.queries.GetUsersQuery;
import com.example.mediator.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final Mediator mediator;

    public UsersController(Mediator mediator) {
        this.mediator = mediator;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return mediator.send(new GetUsersQuery());
    }
}
