package br.com.patterns.bridge.mvc.dao;

import br.com.patterns.bridge.mvc.model.User;

public interface UserDao {
    public void save(User user);
}
