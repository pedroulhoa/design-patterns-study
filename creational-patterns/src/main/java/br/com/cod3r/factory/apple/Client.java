package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhoneX = IPhoneFactory.orderIPhone("X", "standard");
		System.out.println(iPhoneX);

		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11 = IPhoneFactory.orderIPhone("11", "highEnd");
		System.out.println(iPhone11);

	}
}
