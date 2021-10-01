package br.com.patterns.bridge.mvc.dao;

import br.com.patterns.bridge.mvc.model.User;

public class UserPostgresDao implements UserDao {

	public void save(User user) {
		System.out.println("Saving the user in the Postgres Database!");
	}
}
