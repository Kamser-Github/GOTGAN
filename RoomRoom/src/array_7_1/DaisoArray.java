package array_7_1;

public class DaisoArray {

	public static void main(String[] args) {
		
		Daiso1[] daisoProduct = new Daiso1[3];
		Daiso1[] daisoProduct2 = new Daiso1[3];
		System.out.println(daisoProduct);
		System.out.println(daisoProduct2);
		

		daisoProduct[0] = new Daiso1("pen", 1500);
		daisoProduct[1] = new Daiso1("Watch", 1200);
		daisoProduct[2] = new Daiso1("mouse", 1100);
		
		
		daisoProduct2[0] = new Daiso1();
		daisoProduct2[1] = new Daiso1();
		daisoProduct2[2] = new Daiso1();
		
		for(int i = 0 ; i <daisoProduct.length ; i++) {
			daisoProduct2[i].setName(daisoProduct[i].getName());
			daisoProduct2[i].setPrice(daisoProduct[i].getPrice());
		}
		
		for(Daiso1 s2 : daisoProduct2) {
			s2.showProduct();
		}
	}
	
}