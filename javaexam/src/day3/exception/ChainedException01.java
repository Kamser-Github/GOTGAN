package day3.exception;

public class ChainedException01 {
	
	public static void main(String args[]) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException{
		//여기서 오류는 저게 생기고
		//저걸 호출한 애한테 전달 할거야
		try {
			startInstall(); //프로그램 설치 준비
			copyFiles(); //파일을 복사한다.
		} catch (SpaceException e) {
			//SpaceException이 발생하면
			InstallException ie = new InstallException("설치중 예외 발생");
			ie.initCause(e);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치중 예외 발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();//임시 파일을 다 지운다
		}//try 끝
	}
	
	static void startInstall() throws SpaceException,MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("설치 공간이 부족합니다");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}//startInstall 끝
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
}

class InstallException extends Exception {
	InstallException(String msg) {
	   super(msg);	
   }
} 

class SpaceException extends Exception {
	SpaceException(String msg) {
	   super(msg);	
   }
} 

class MemoryException extends Exception {
	MemoryException(String msg) {
	   super(msg);	
   }
}


