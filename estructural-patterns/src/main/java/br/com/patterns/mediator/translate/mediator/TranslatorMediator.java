package br.com.patterns.mediator.translate.mediator;

import br.com.patterns.mediator.translate.model.User;
import br.com.patterns.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {
    private Translator translator = new Translator();

    protected String getMessage(String message, User to, User from) {
        return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
    }
}
