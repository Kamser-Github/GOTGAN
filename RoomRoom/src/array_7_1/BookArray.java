package array_7_1;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		
		
		library[0] = new Book("토지", "조정래");
		library[1] = new Book("토지1", "조정래");
		library[2] = new Book("토지2", "조정래");
		library[3] = new Book("토지3", "조정래");
		library[4] = new Book("토지4", "조정래");
		
		

		for (int i = 0 ; i < library.length ; i++) {
				library[i].showBook();
			//책이 5권 만들어지는게 아니라 책 주소 5칸이 만들어졌다;
		}
	}

}
