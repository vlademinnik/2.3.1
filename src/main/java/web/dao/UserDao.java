package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User getUserById(long id);

    List<User> getAllUsers();

    void editUser(User user, long id);

    void deleteUser(User user, long id);
}
