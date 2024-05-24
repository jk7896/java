package part06;

public class Person {
	
	String name;
	int age;
	
	public void setAge(int _age) {
		this.age =_age;
	}
	public Person() {
		this("이름없음",1);
	}
	public Person(String name, int age) {
		this.name =name;
		this.age =age;
	}
	
	public void ShowPerson() {
		System.out.println("이름 : "+this.name + "나이 : "+this.age);
	}	
	public Person getPerson()
	{
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
