
class Print{
	public String delimiter = "";
	//오류 이유 classpratice에서는 delimiter를 불러올수가 없다;
	//따라서 쓸곳에 정의를 해주어야한다;
	public Print(String _delimiter) {
		this.delimiter = _delimiter;
	}
	
	public void C() {
		System.out.println(this.delimiter);
		System.out.println("C");
		System.out.println("C");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
}