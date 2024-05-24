package part11_Array;

public class Test {

	public static void main(String[] args) {
		Book [] library = new Book[5];
		for(int i = 0 ; i<library.length; i++) {
			System.out.println(library[i]);
		}

		
		library[0]= new Book("삼국지1","나관중");
		library[1]= new Book("삼국지2","나관중");
		library[2]= new Book("삼국지3","나관중");
		library[3]= new Book("삼국지4","나관중");
		library[4]= new Book("삼국지5","나관중");
		
		
		
		for(int i = 0 ; i<library.length; i++) {
			System.out.println(library[i]);
			
			library[i].showBookInfo();
		}
		
		
		
		
	}

}
