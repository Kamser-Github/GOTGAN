package array_7_1;

public class ObjectCoppy {
	
	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백1","조정래");
		bookArray1[1] = new Book("태백2","조정래");
		bookArray1[2] = new Book("태백3","조정래");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
//		for (int i = 0 ; i < bookArray2.length ; i++) {
//			bookArray2[i].showBook();
//		}
		
//		for (Book s : bookArray2 ) {
//			s.showBook();
//		}
		
		
		
		bookArray1[0].setBookName("마마");
		bookArray1[0].setAuthor("고구마");
		
		System.out.println("--------");
		
		for (int i = 0 ; i < bookArray2.length ; i++) {
			bookArray2[i].showBook();
		}
		
		
		String[] lang = {"안드로이드","자바","자바스크립드"};
		
		for ( String s : lang) { // s = lang[i];
			System.out.println(s);
			//전부다 배열 하나씩 돌릴때 가능한 for문이다;
			
		}
		
	}
}
