kmpackage chapter03;

public class Goods {
	private String name; //변수보다 필드라 칭함
	private int price;
	private int counterSold;
	private int counterStock; // 스택에서 저장: 지워지고 	
	
	
	public static int countOfGoods = 0;
	
	
	
	public Goods() { //이름도 똑같이 썼지요?
		Goods.countOfGoods = Goods.countOfGoods + 1;
	}
	//메소드 지역  에서 저장.
	
	
	// getter 겟터, 설정자함수애기하는군
	
	public String getName() { //이름계약을 지켜서 지을것
		return name; //fetch네임도 있고
	}				//내가 지킬 건 지켜야 
					//빈규약이 있다. 변수데이터 떼올때 get대문자
					//언더바고 뭐고 get대문자
					//이거말고 더 지킬 것이 많은데
	public void setName(String name) { //이거 호출때 파라미터 사용하는거 잊지 않았지?
		this.name = name; // 파라미터가 우선
		//왼쪽이 객체의 name,
		
		//수많은 객체중에 writeName, setName, getName....규약에 따라서
	
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCounterSold() {
		return counterSold;
	}
	public void setCounterSold(int counterSold) {
		this.counterSold = counterSold;
	}
	public int getCounterStock() {
		return counterStock;
	}
	public void setCounterStock(int counterStock) {
		this.counterStock = counterStock;
	}
}
