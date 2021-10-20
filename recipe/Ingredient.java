package recipe;

public class Ingredient {
	private double amount;
	private Foodstuff foodstuff;
	
	
	public Ingredient(Foodstuff foodstuff, double amount) {
		this.amount = amount;
		this.foodstuff = foodstuff;
	}
	
	public Foodstuff getFoodstuff() {
		return this.foodstuff;
	}
	
	public boolean setAmount(double amount) {
		if (amount > 0) {
			this.amount = amount;
			return true;
		}
		return false;
	}

	public double getAmount() {
		return amount;
	}
	
	public String toString() {
		return this.foodstuff.getName() + " x" + this.amount;
	}
}
