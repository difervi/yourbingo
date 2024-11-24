package org.yourbingo.bingofullstack.service;

import org.springframework.stereotype.Service;
import org.yourbingo.bingofullstack.entities.User;
import org.yourbingo.bingofullstack.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User save(User user){
        return userRepository.save(user);
    }

}
