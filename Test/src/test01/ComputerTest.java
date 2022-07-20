package test01;

import kr.co.abstractex.*;

public class ComputerTest {
	
	public static void main(String[] args) {
		
		DeskTop top = new DeskTop();
		NoteBook book = new NoteBook();
		
		top.doPlay();
		book.doPlay();
		
		Computer[] com = new Computer[4];
		com[0] = new DeskTop();
		com[1] = new NoteBook();
		com[2] = new DeskTop();
		com[3] = new NoteBook();
		
		Computer[] com2 = {
				new DeskTop(),
				new NoteBook(),
				new DeskTop(),
				new NoteBook()
		};
		
		//1.
		for(int i=0 ; i<com2.length ; i++) {
			if(com2[i] instanceof DeskTop) {
				((DeskTop)com2[i]).playGame();
			}else if(com2[i] instanceof NoteBook) {
				((NoteBook)com2[i]).takeWeight();
			}
		}
		
		
	}
}
