package recipe;

import java.util.ArrayList;

import kitchen.Fridge;

public class Recipe {
	private String name;
	private int portions;
	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	private String instructions;
	private double time;
	
	private Recipe(String name, int portions, double time, String instructions) {
		this.instructions = instructions;
		this.name = name;
		this.portions = portions;
		this.time = time;
	}
	
	public Recipe(String name, int portions, double time, String instructions, Ingredient ...ingredients) {
		this(name, portions, time, instructions);
		
		for (Ingredient in : ingredients) {
			this.ingredients.add(in);
		}
	}
	
	
	public Recipe(String name, int portions, double time, String instructions, ArrayList<Ingredient> ingredients) {
		this(name, portions, time, instructions);
		this.ingredients.addAll(ingredients);
	}
	
	
	public void printContents() {
		System.out.println("------------" + this.name + "------------");
		
		for (Ingredient in : this.ingredients) {
			System.out.println(in);
		}
		
		System.out.println("\nInstrukcije za pripremu: ");
		System.out.println(this.instructions);
		System.out.println(isVegetarian() ? "Recept je vegetarijanski." : "Recept nije vegetarijanski.");
	}

	public int getPortions() {
		return portions;
	}

	public double getTime() {
		return time;
	}
	
	public boolean isVegetarian() {
		for (Ingredient in : this.ingredients) {
			if (in.getFoodstuff().getType() == FoodstuffType.MEAT) {
				return false;
			}
		}
		return true;
	}
	
	public boolean prepare(Fridge fridge) {
		for (Ingredient in : this.ingredients) {
			Ingredient target = fridge.get(in.getFoodstuff().getName());
			if (target == null) {
				System.out.println("Neuspelo pripremanje jela");
				return false;
			}
			
			if (target.getAmount() < in.getAmount()) {
				System.out.println("Neuspelo pripremanje jela!");
				return false;
			}
		}
		
		
		for (Ingredient in : this.ingredients) {
			Ingredient target= fridge.get(in.getFoodstuff().getName());
			target.setAmount(target.getAmount() - in.getAmount());
		}
		return true;
	}
}
