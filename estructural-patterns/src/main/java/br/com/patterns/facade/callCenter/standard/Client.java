package br.com.patterns.facade.callCenter.standard;

import br.com.patterns.facade.callCenter.standard.facade.CallCenterFacade;
import br.com.patterns.facade.callCenter.standard.model.Card;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();

		Card card = facade.getCardByUser(123456L);
		System.out.println(card);

		facade.getSumary(card);

		facade.getPaymentInfoByCard(card);

		facade.cancelLastRegister(card);

		Card newCard = facade.getCardByUser(123456L);
		System.out.println(newCard);
	}
}
