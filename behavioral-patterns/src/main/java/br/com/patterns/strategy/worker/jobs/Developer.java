package br.com.patterns.strategy.worker.jobs;

import br.com.patterns.strategy.worker.strategies.eat.MeatFoodStrategy;
import br.com.patterns.strategy.worker.strategies.transportation.CarStrategy;
import br.com.patterns.strategy.worker.strategies.work.DeveloperStrategy;

public class Developer implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new CarStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
