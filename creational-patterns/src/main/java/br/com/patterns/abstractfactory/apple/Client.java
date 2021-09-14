package br.com.patterns.abstractfactory.apple;

import br.com.patterns.abstractfactory.apple.factory.IPhone11Factory;
import br.com.patterns.abstractfactory.apple.factory.IPhoneFactory;
import br.com.patterns.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.patterns.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.patterns.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.patterns.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.patterns.abstractfactory.apple.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {

        // Rules
        CountryRulesAbstractFactory brazilRules = new BrazilianRulesAbstractFactory();
        CountryRulesAbstractFactory USRules = new USRulesAbstractFactory();

        // Iphone Factory
        IPhoneFactory genXFactory = new IPhoneXFactory(brazilRules);
        IPhoneFactory gen11Factory = new IPhone11Factory(USRules);

        // Ordering Iphone's
        IPhone iPhoneX = genXFactory.orderIPhone("standard");
        System.out.println(iPhoneX);

        IPhone iPhone11 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iPhone11);

    }
}
