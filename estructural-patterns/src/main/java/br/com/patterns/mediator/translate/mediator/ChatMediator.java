package br.com.patterns.mediator.translate.mediator;

import br.com.patterns.mediator.translate.model.User;

public class ChatMediator extends Mediator {
    public String getMessage(String message, User to, User from) {
        return message;
    }
}
