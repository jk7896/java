package part12_ArrayTest;


// 책에 관련된 데이터를 관리하는 클래스, 설계서, 객체화 할 대상, 데이터 자료형
// int, String, 같은 자료형 처럼 개발자가 원하는 데이터와 기능이 모여 있는 자료를 직접 구성 할 수 있다는 개념
public class Book {
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(String title, String author) {
		this.title =title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void showBookInfo() {
		System.out.println(title + ","+author);
	}

}
