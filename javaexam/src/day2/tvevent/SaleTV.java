package day2.tvevent;

public class SaleTV extends TV {
	
	private int price;
	
	public SaleTV() {}
	public SaleTV(int price,String model,int size,int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.println("판매 TV 채널 "+getChannel()+"번의 프로를 플레이합니다");
	}
	public void sale() {
		System.out.printf("%s 모델의 상품을 판매합니다.%d을 지불해주세요\n",getModel(),price);
	}
	@Override
	public String toString() {
		return String.format("대여상품정보    : 모델명("+getModel()+"), 가격("+price+"원), 크기("+getSize()+")",new SaleTV());
	}
}
