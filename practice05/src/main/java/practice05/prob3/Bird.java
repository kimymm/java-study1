package prob3;
//이 또한 오버라이드
// 오버라이드 또한 뭐 있겠어 그냥 좀 알아보고 자식메소드가 실행된다는 걸 체감하면 되는거 아냐
public abstract class Bird {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}