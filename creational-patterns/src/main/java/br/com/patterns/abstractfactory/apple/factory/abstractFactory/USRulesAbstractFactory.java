package br.com.patterns.abstractfactory.apple.factory.abstractFactory;

import br.com.patterns.abstractfactory.apple.model.certificate.Certificate;
import br.com.patterns.abstractfactory.apple.model.certificate.USCertificate;
import br.com.patterns.abstractfactory.apple.model.packing.Packing;
import br.com.patterns.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory{

    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
