package br.com.patterns.bridge.mvc.services;

import br.com.patterns.bridge.mvc.dao.UserDao;
import br.com.patterns.bridge.mvc.model.User;

public abstract class UserService {
    protected UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}