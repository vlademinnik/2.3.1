package web.service;
import web.model.User;
import web.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClass implements ServiceUser {

    @Autowired
    private UserDao ud;

    @Transactional
    @Override
    public void addUser(User user) {
        ud.addUser(user);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return ud.getAllUsers();
    }

    @Transactional
    @Override
    public User getUserById(long id) {
        return ud.getUserById(id);
    }

    @Transactional
    @Override
    public void editUser(User user, long id) {
        ud.editUser(user, id);
    }

    @Transactional
    @Override
    public void deleteUser(User user, long id) {
        ud.deleteUser(user, id);
    }
}
