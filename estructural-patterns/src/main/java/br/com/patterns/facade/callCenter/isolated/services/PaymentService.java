package br.com.patterns.facade.callCenter.isolated.services;

import br.com.patterns.facade.callCenter.isolated.model.Card;
import br.com.patterns.facade.callCenter.isolated.model.Register;

import java.util.List;

public class PaymentService {
	private RegisterService registerService;

	public PaymentService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getPaymentInfoByCard(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		double sum = registers.stream()
				.reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
		System.out.println(String.format("You have to pay %.2f until next week", sum));
	}

}
