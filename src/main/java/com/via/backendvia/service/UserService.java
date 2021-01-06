package com.via.backendvia.service;

import com.via.backendvia.model.Note;
import com.via.backendvia.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(String id);

    User saveOrUpdateUser(User user);

    void deleteUserById(String id);
}
