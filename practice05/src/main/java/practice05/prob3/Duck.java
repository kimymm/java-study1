package practice05.prob3;

public class Duck extends Bird {
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "오리의 이름은" + getName() + "입니다.";
	}
	@Override
	public void fly() {
		System.out.println("오리(" + getName() + ")는 날지 않습니다.");	
	}
	@Override
	public void sing() {
		System.out.println("오리(" + getName() + ")가 소리내어 웁니다.");
	}
}
