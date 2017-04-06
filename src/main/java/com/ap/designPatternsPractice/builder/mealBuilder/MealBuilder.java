package com.ap.designPatternsPractice.builder.mealBuilder;

/**
 * Created by APandey on 03-04-2017.
 */
public interface MealBuilder {
	public void buildDrink();

	public void buildMainCourse();

	public void buildSide();

	public Meal getMeal();
}
