package br.com.patterns.abstractfactory.app.service.factory;

import br.com.patterns.abstractfactory.app.service.services.CarEJBService;
import br.com.patterns.abstractfactory.app.service.services.CarService;
import br.com.patterns.abstractfactory.app.service.services.UserEJBService;
import br.com.patterns.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }
}
