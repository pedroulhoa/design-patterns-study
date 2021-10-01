package br.com.patterns.bridge.mvc.services;

import br.com.patterns.bridge.mvc.dao.UserDao;
import br.com.patterns.bridge.mvc.model.User;

public class UserRest extends UserService {

	public UserRest(UserDao dao) {
		super(dao);
	}

	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}
}
