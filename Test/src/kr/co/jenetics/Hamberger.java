package kr.co.jenetics;

public class Hamberger<T extends Product> {
	
	private T ingredients;
	
	public void setIngerdients(T ingredients) {
		this.ingredients = ingredients;
	}
	
	public T getIngredients() {
		return ingredients;
	}
	
	@Override
	public String toString() {
		return ingredients.toString();
	}
	
	public void makeFood() {
		
		ingredients.trimFood();
	}
}
