package com.ap.designPatternsPractice.builder.mealBuilder;

/**
 * Created by APandey on 03-04-2017.
 */
public class ItalianMealBuilder implements MealBuilder {

	private Meal meal;

	public ItalianMealBuilder() {
		meal = new Meal();
	}

	public void buildDrink() {
		meal.setDrink("red wine");
	}

	public void buildMainCourse() {
		meal.setMainCourse("pizza");
	}

	public void buildSide() {
		meal.setSide("bread");
	}

	public Meal getMeal() {
		return meal;
	}

}
