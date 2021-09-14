package br.com.patterns.abstractfactory.app.service;

import br.com.patterns.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.patterns.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.patterns.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.patterns.abstractfactory.app.service.services.CarService;
import br.com.patterns.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {

		ServicesAbstractFactory restService = new RestAbstractFactory();
		ServicesAbstractFactory EJBService = new EJBAbstractFactory();

		CarService restCarService = restService.getCarService();
		UserService restUserService = restService.getUserService();

		CarService ejbCarService = EJBService.getCarService();
		UserService ejbUserService = EJBService.getUserService();

		// ----------------------------

		restCarService.save("Car Model save via REST");
		ejbCarService.save("Car Model save via EJB");

		restUserService.delete(5);
		ejbUserService.delete(5);

	}
}
