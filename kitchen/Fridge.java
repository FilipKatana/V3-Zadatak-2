package kitchen;

import java.util.ArrayList;
import java.util.HashMap;

import recipe.Ingredient;

public class Fridge {
	//private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	private HashMap<String, Ingredient> ingredients = new HashMap<String, Ingredient>();
	
	/*
	public Fridge(Ingredient ...ingredients) {
		for (Ingredient in : ingredients) {
			this.ingredients.add(in);
		}
	}
	
	public void addIngredient(Ingredient ingredient) {
		for (Ingredient in : this.ingredients) {
			if (in.getFoodstuff().getName() == ingredient.getFoodstuff().getName() && in.getFoodstuff().getType() == ingredient.getFoodstuff().getType()) {
				in.setAmount(in.getAmount() + ingredient.getAmount());
				return;
			}
		}
		this.ingredients.add(ingredient);
	}
	
	public int getSize() {
		return this.ingredients.size();
	}
	
	//public Ingredient getIngredient() {}
	 * 
	 */
	
	
	public Fridge(Ingredient ...ingredients) {
		for (Ingredient in : ingredients) {
			this.ingredients.put(in.getFoodstuff().getName(), in);
		}
	}
	
	
	public Ingredient get(String name) {
		return this.ingredients.get(name);
	}
	
	public void add(Ingredient ingredient) {
		if (this.ingredients.containsKey(ingredient.getFoodstuff().getName())) {
			Ingredient in = this.ingredients.get(ingredient.getFoodstuff().getName());
			in.setAmount(in.getAmount() + ingredient.getAmount());
			return;
		}
		
		this.ingredients.put(ingredient.getFoodstuff().getName(), ingredient);
	}
	
	
}
