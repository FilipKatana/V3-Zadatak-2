package recipe;

public class Foodstuff {
	private String name;
	private double energyValue;
	private FoodstuffType type;
	
	
	public Foodstuff(String name, double energyValue, FoodstuffType type) {
		this.name = name;
		this.energyValue = energyValue;
		this.type = type;
	}
	
	public FoodstuffType getType() {
		return type;
	}
	
	public double getEnergyValue() {
		return energyValue;
	}
	
	public String getName() {
		return this.name;
	}
	
}
