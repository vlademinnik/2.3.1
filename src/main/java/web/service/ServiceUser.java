package web.service;

import web.model.User;

import java.util.List;

public interface ServiceUser {
    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void editUser(User user, long id);

    void deleteUser(User user, long id);
}
