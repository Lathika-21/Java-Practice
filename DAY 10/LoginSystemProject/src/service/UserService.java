package service;

import dao.UserDAO;

public class UserService {

    UserDAO dao = new UserDAO();

    public void register(String username, String password) {
        dao.registerUser(username, password);
    }

    public boolean login(String username, String password) {
        return dao.loginUser(username, password);
    }
}