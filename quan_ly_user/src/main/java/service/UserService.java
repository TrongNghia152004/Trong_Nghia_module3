package service;

import model.User;
import repository.IUserDAO;
import repository.UserDAO;

import java.util.List;

public class UserService implements IUserService{
    private IUserDAO userDAO = new UserDAO();

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void create(User user) {

    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
