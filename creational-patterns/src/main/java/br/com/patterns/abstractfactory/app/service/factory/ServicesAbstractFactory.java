package br.com.patterns.abstractfactory.app.service.factory;

import br.com.patterns.abstractfactory.app.service.services.CarService;
import br.com.patterns.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();
    CarService getCarService();

}
