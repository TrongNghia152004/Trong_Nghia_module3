package repository;

import model.User;

import java.util.List;

public interface IUserDAO {
 List<User> findAll();

 void create(User user);

 User findById(int id);

 void update(User user);

 void delete(int id);
}
