package com.ap.designPatternsPractice.builder.mealBuilder;

/**
 * Created by APandey on 03-04-2017.
 */
public class JapaneseMealBuilder implements MealBuilder {

	private Meal meal;

	public JapaneseMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildDrink() {
		meal.setDrink("sake");
	}

	@Override
	public void buildMainCourse() {
		meal.setMainCourse("chicken teriyaki");
	}

	@Override
	public void buildSide() {
		meal.setSide("miso soup");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}