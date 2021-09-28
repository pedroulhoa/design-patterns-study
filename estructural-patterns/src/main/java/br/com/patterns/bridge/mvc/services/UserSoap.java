package br.com.patterns.bridge.mvc.services;

import br.com.patterns.bridge.mvc.model.User;

public class UserSoap {

	public void save(User user) {
		System.out.println("Starting a save operation through Soap Protocol!");
	}
}
