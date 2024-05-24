package part10_downcasting;

public class Test {

	public static void main(String[] args) {
		child ch = new child("최형배");
		Parent pa=ch;
		pa.Action();
		
		child ch_a=(child)pa; //다운캐스팅하여 적용
		

	}

}
