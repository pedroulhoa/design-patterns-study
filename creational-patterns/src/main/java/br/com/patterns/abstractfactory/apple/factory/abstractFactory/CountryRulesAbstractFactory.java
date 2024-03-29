package br.com.patterns.abstractfactory.apple.factory.abstractFactory;

import br.com.patterns.abstractfactory.apple.model.certificate.Certificate;
import br.com.patterns.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
