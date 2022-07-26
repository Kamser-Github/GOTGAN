package day2.exception1;

public class PasswordTest {
	
	private String password;
	
	public String getPassword() {return password;}
	
	public PasswordTest(String password) throws PasswordException{
		
		if(password == null) {
			throw new PasswordException("비밀번호를 입력해주세요");
		}
		else if(new String(password).matches("[a-zA-Z]+")) {
			throw new PasswordException("문자와 숫자가 섞어야합니다");
		}
		else if(password.length()<5) {
			throw new PasswordException("5글자 이상 해주세요");
		}
		
		this.password = password;
	}
	
	public static void main(String[] args) {
		
		String password = "adfaf";
		try {
			new PasswordTest(password);
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = null;
		try {
			new PasswordTest(password);
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		password = "d1";
		try {
			new PasswordTest(password);
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
