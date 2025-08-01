package com.example.mediator.features.users.queries;

import com.example.mediator.core.RequestHandler;
import com.example.mediator.model.User;
import com.example.mediator.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("getUsersQueryHandler")
public class GetUsersQueryHandler implements RequestHandler<GetUsersQuery, List<User>> {

    private final UserRepository userRepository;

    public GetUsersQueryHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> handle(GetUsersQuery query) {
        return userRepository.findAll();
    }
}
