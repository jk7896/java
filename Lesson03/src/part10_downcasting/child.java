package part10_downcasting;

public class child extends Parent {
	
	private String Name; //이름
	child(String _Name){
		this.Name=_Name;
	}
	@Override
	public void Action() {
		System.out.println(this.Name + "입니다.");
	}
	
	
	
}
