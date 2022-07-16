package day0716;

class TV{
	
	int channel;
	boolean power;
	String color;
	
	TV(){}
	
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
}
public class ObjectArr1 {
	
	public static void main(String[] args){
		
		TV[] tvArr = new TV[4];
		
		for(int i=0 ; i<tvArr.length ; i++) {
			tvArr[i] = new TV();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0 ; i<tvArr.length ; i++) {
			tvArr[i].channelUp();
			System.out.printf("%d번째 tv의 현재 채널은 : %2d\n",i+1,tvArr[i].channel);
		}
	}
			
}
