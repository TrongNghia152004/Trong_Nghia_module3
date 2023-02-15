package service;

import model.User;
import repository.IUserDAO;
import repository.UserDAO;

import java.util.List;

public class UserService implements IUserService {
    private IUserDAO userDAO = new UserDAO();

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void create(User user) {
        userDAO.create(user);
    }

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Override
    public List<User> search(String country) {
        return userDAO.search(country);
    }

    @Override
    public List<User> sort() {
        return userDAO.sort();
    }
}
