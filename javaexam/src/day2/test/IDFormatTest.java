package day2.test;

import day2.exception1.IDFormatException;

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUseID(String ID) throws IDFormatException{
		
		if(ID==null) {
			throw new IDFormatException("아이디를 입력해주세요");
		}
		else if(ID.length()<8 || ID.length()>20) {
			throw new IDFormatException("아이디는 8글자이상 20글자 이하입니다");
		}
		
		this.userID = ID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUseID(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		String user = "12567"; //8글자 이하
		try {
			test.setUseID(user);
		}catch(IDFormatException a) {
			System.out.println(a.getMessage());
		}
	}
}
