package br.com.patterns.bridge.mvc.services;

import br.com.patterns.bridge.mvc.model.User;

public class UserRest{

	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
	}
}
