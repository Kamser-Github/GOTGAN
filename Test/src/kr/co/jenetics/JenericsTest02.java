package kr.co.jenetics;

public class JenericsTest02 {
	
	public static void main(String[] args) {
		
		Hamberger<Bread> bread = new Hamberger<>();
		bread.setIngerdients(new Bread());
		Bread paris = bread.getIngredients();
		System.out.println(bread.toString());
		System.out.println(paris.hashCode());
		System.out.println(bread.getIngredients().hashCode());
		bread.makeFood();
		paris.trimFood();
		
		Hamberger<Pickle> pickle = new Hamberger<>();
		pickle.setIngerdients(new Pickle());
		Pickle nomat = pickle.getIngredients();
		System.out.println(pickle.toString());
		pickle.makeFood();
		
		Product[] bergerking = {
				paris,
				nomat
		};
		
		for(Product intg : bergerking) {
			intg.trimFood();
		}
	
	}
}
