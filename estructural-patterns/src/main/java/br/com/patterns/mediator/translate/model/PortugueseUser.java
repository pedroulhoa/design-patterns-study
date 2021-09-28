package br.com.patterns.mediator.translate.model;

import br.com.patterns.mediator.translate.mediator.Mediator;

public final class PortugueseUser extends User {

	public PortugueseUser(String name, Mediator mediator) {
		super(name, mediator, Language.PORTUGUESE);
	}
	
}
