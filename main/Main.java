package main;

import kitchen.Fridge;
import recipe.Foodstuff;
import recipe.FoodstuffType;
import recipe.Ingredient;
import recipe.Recipe;

public class Main {

	public static void main(String[] args) {
		Foodstuff meat = new Foodstuff("Bečka", 50.3, FoodstuffType.MEAT);
		Foodstuff egg = new Foodstuff("Jaje", 5.4, FoodstuffType.DAIRY);
		
		Fridge fridge = new Fridge(new Ingredient(meat, 10), new Ingredient(egg, 4));
		
		Recipe recipe = new Recipe("Jaja i meso", 2, 70.8, "Ispeći meso i poslužiti sa jajetom.", new Ingredient(meat, 20), new Ingredient(egg, 4));
		
		recipe.printContents();
		System.out.println("#######################");
		recipe.prepare(fridge);

	}

}
