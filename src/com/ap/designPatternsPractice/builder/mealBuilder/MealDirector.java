package com.ap.designPatternsPractice.builder.mealBuilder;

/**
 * Created by APandey on 03-04-2017.
 */
public class MealDirector {
	private MealBuilder mealBuilder = null;

	public MealDirector(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}

	public void constructMeal() {
		mealBuilder.buildDrink();
		mealBuilder.buildMainCourse();
		mealBuilder.buildSide();
	}

	public Meal getMeal() {
		return mealBuilder.getMeal();
	}
}
