package test01;

import kr.co.abstractex.Vacuum;
import kr.co.abstractex.Cleaner;
import kr.co.abstractex.RoBotCleaner;

public class CleanerTest {
	
	public static void main(String[] args) {
		
		Cleaner c1 = new Vacuum();
		Cleaner r1 = new RoBotCleaner();
		
//		c1.doClean();
//		r1.doClean();
		
		Vacuum c2 = (Vacuum)c1;
		c2.alarmFilter();
		RoBotCleaner r2 = (RoBotCleaner)r1;
		r2.autoPlay(2);
	}
	
}
