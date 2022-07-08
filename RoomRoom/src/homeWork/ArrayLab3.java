package homeWork;

public class ArrayLab3 {
	public static void main(String[] args) {

		char[] java = { 'J', 'a', 'V', 'a' };
		String arrDir = "";
		for (int a = 0; a < java.length; a++) {
			java[a] = (java[a] > 96) ? (char) (java[a] - 32) : (char) (java[a] + 32);
			arrDir += java[a];F
			if (a == java.length - 1)
				break;
			arrDir += ",";
		}
		System.out.println("변환된 배열 : " + arrDir);
	}
}
