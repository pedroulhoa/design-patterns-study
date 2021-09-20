package br.com.patterns.builder.meal.fluent;

import br.com.patterns.builder.meal.fluent.model.FastFoodMeal;

public class Client {
	
	public static void main(String[] args) {

		FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
				.andMain("CheeseBurger")
				.forDrink("Coke")
				.thatsAll();

		System.out.println(burguerCombo);

		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
		System.out.println(justFries);

		FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
				.andMain("Monster Burguer")
				.forDrink("Milk Shake")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.thatsAll();

		System.out.println(heartAtackCombo);



	}
}