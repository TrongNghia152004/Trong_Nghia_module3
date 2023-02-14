package service;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void create(User user);

    User findById(int id);

    void update(User user);

    void delete(User user);
}
